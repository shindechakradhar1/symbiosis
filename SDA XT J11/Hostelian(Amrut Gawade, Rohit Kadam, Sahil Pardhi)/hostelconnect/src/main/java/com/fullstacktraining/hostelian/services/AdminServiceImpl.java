package com.fullstacktraining.hostelian.services;

import com.fullstacktraining.hostelian.CustomExceptionClasses.DataDeletionException;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataFetchingException;
import com.fullstacktraining.hostelian.entities.Admin;
import com.fullstacktraining.hostelian.entities.Course;
import com.fullstacktraining.hostelian.entities.Fees;
import com.fullstacktraining.hostelian.entities.Room;
import com.fullstacktraining.hostelian.models.ResponseModel;
import com.fullstacktraining.hostelian.repositories.AdminRepository;
import com.fullstacktraining.hostelian.repositories.CourseRepository;
import com.fullstacktraining.hostelian.repositories.FeesRepository;
import com.fullstacktraining.hostelian.repositories.RoomRepository;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataInsertionException;
import com.fullstacktraining.hostelian.services.interfaces.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public AdminServiceImpl() {
    }

    @Override
    public Admin register(Admin admin) {
        System.out.println(admin);
        Admin admin1 = adminRepository.findByEmailAndPassword(admin.getEmail(), admin.getPassword());
        if (admin1 == null) {
            adminRepository.save(admin);
            return admin;
        }
        return null;
    }





}
