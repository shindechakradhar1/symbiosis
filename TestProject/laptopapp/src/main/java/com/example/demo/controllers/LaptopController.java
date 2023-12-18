package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.LaptopRepo;
import com.example.demo.entities.Laptop;

@RestController // controller + responsebody
@RequestMapping("/")
public class LaptopController {
	
	@Autowired
	private LaptopRepo laptopRepo;
	
	@GetMapping
	public List<Laptop> showLaptops(Model model)
	{
		List<Laptop> laptops = laptopRepo.findAll();
		model.addAttribute("laptops", laptops);
		return laptops;
	}
	
	@PostMapping("laptops/save")
	public String saveLaptops(@ModelAttribute("laptop") Laptop laptop) {
		laptopRepo.save(laptop);
		return "redirect:http://localhost:8080/laptops";
	}
	
	@GetMapping("laptops/add")
	public String addLaptop(Model model) {
		Laptop laptop = new Laptop();
		model.addAttribute("laptop", laptop);
		return "add";
	}
	
	@GetMapping("laptops/update/{id}")
	public String updateLaptop(@PathVariable(value="id") Long id, Model model) {
		Laptop laptop=null;
		Optional<Laptop> laptopOptional = laptopRepo.findById(id);
		if(laptopOptional.isPresent())
			laptop = laptopOptional.get();
		else
			System.out.println("Record is empty..");
		
		model.addAttribute("laptop", laptop);
		return "update";
	}
	
	@GetMapping("laptops/delete/{id}")
	public String deleteLaptop(@PathVariable(value="id") Long id) {
		laptopRepo.deleteById(id);
		return "redirect:http://localhost:8080/laptops";
	}
	
}
