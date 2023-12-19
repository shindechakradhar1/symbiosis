package com.bloodUnity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bloodUnity.dao.BloodGroupDao;
import com.bloodUnity.dao.DonorDao;
import com.bloodUnity.dao.UserDao;
import com.bloodUnity.entity.BloodGroup;
import com.bloodUnity.entity.Donor;
import com.bloodUnity.entity.User;
import com.bloodUnity.service.BloodGroupService;
import com.bloodUnity.service.DonorService;
import com.bloodUnity.service.UserService;


@Controller
public class BloodController {
	
	@Autowired
	private UserService service;
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private BloodGroupDao bloodGroupDao;
	@Autowired
	private BloodGroupService bloodGroupService;
	
	@Autowired
	private DonorDao donorDao;
	@Autowired
	private DonorService donorService;
	
	
	
	@RequestMapping("/home")
	public String getHome(Model model) {
	
		return "home";
	}
	
	@RequestMapping("/adminLogin")
	public String getAdminLogin(Model model) {
	
		return "adminLogin";
	}
	 @RequestMapping("/donorReg")
		public String getDonorReg(Model model) {
		
			return "donorReg";
		}
	@PostMapping("/add") 
	public String addRequest(@ModelAttribute User user,Model model) {
		service.save(user);
		model.addAttribute("successMessage", "Blood Request submitted successfully!");
		return "home";
	}
	
	@PostMapping("/addDonor") 
	 public String addDonor(@ModelAttribute Donor donor,Model model) {
		donorService.save(donor);
		 model.addAttribute("successMessage", "Form submitted successfully!");
		return "donorReg";
		
	}
	
	@RequestMapping("/adminHomePage")
	public String getAdminHomePage(Model model) {
	
		return "adminHomePage";
	}
	@PostMapping("/adminHomePage") 
	public String login( Model model, @RequestParam String username, @RequestParam String password) {
		
		if(username.equals("admin")&& password.equals("root"))
			return "adminHomePage";
		
		model.addAttribute("InvalidCredentials",true);
		   return "adminLogin";
	}
	 @RequestMapping("/bloodRequest")
		public String getBloodRequest(Model model) {
		 List<User> users = userDao.findAll();
	        model.addAttribute("users",users);
			return "bloodRequest";
		}
	@RequestMapping("/manageDonor")
	public String getManageDonor(Model model) {
		 List<Donor> donors = donorDao.findAll();
	        model.addAttribute("donors",donors);
		return "manageDonor";
	}
	
	@RequestMapping("/manageStock")
	public String getManageStock(Model model) {
	    
		 List<BloodGroup> bloodGroups = bloodGroupDao.findAll();
		 model.addAttribute("bloodGroups", bloodGroups);

		 model.addAttribute("bloodGroup", new BloodGroup());
		return "manageStock";
	}

	
    @GetMapping("/updateStock/{id}")
    public ResponseEntity<BloodGroup> updateStockValue(@PathVariable Long id,@RequestParam int newStockValue) {
        BloodGroup updatedBloodGroup = bloodGroupService.updateStockValue(id, newStockValue);
        return ResponseEntity.ok(updatedBloodGroup);
    }
    
  
	@PostMapping("/save")
	public String saveBloodGroup(@ModelAttribute("bloodGroup")BloodGroup bloodGroup,BindingResult bindingResult,Model model ) {
		bloodGroupService.save(bloodGroup);
		model.addAttribute("bloodGroup", bloodGroup);
		return "redirect:/manageStock";
	}
    @GetMapping("/deleteDonor/{DonorId}")
	public String getdeleteDonor(@PathVariable("DonorId") Long DonorId, Model model,RedirectAttributes redirectAttributes) {
		String successMsg = donorService.deleteDonor(DonorId);
		redirectAttributes.addFlashAttribute("successMsg", successMsg);
		return "redirect:/manageDonor";
	} 
    
}
	
		
	

