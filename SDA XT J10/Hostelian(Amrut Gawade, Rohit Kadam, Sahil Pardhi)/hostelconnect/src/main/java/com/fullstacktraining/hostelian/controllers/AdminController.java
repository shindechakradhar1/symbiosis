package com.fullstacktraining.hostelian.controllers;

import com.fullstacktraining.hostelian.entities.Admin;
import com.fullstacktraining.hostelian.entities.Course;
import com.fullstacktraining.hostelian.entities.Fees;
import com.fullstacktraining.hostelian.entities.Room;
import com.fullstacktraining.hostelian.models.ResponseModel;
import com.fullstacktraining.hostelian.services.interfaces.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    Admin admin1 = new Admin(10L,"ROhit","kadamrohit@gmail.com", "Rohit@Kadam",new Date(),new Date());
    @PostMapping("/register")
    public String registerAdmin(Admin admin){
        adminService.register(admin1);
        return "Success..";
    }





}