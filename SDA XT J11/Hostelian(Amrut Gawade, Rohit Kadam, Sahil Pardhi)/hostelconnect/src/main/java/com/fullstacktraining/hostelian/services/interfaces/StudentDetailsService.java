package com.fullstacktraining.hostelian.services.interfaces;

import com.fullstacktraining.hostelian.entities.StudentDetails;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface StudentDetailsService {
    List<StudentDetails> getAllStudentDetails();

    ResponseEntity<StudentDetails> getStudentDetailsById(Long id);

    ResponseEntity<StudentDetails> saveStudentDetails(StudentDetails studentDetails);

    ResponseEntity<String> deleteStudentDetails(Long id);
}
