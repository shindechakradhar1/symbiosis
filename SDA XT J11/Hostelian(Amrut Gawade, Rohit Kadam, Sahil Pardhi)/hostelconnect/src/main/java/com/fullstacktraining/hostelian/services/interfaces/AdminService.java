package com.fullstacktraining.hostelian.services.interfaces;

import com.fullstacktraining.hostelian.entities.Admin;
import com.fullstacktraining.hostelian.entities.Course;
import com.fullstacktraining.hostelian.entities.Fees;
import com.fullstacktraining.hostelian.entities.Room;
import com.fullstacktraining.hostelian.models.ResponseModel;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface AdminService {
    public Admin register(Admin admin);


}
