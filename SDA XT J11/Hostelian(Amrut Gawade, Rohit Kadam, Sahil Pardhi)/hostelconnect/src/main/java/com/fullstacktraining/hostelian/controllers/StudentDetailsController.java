package com.fullstacktraining.hostelian.controllers;

import com.fullstacktraining.hostelian.entities.StudentDetails;
import com.fullstacktraining.hostelian.services.interfaces.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student-details")
public class StudentDetailsController {

    private final StudentDetailsService studentDetailsService;

    @Autowired
    public StudentDetailsController(StudentDetailsService studentDetailsService) {
        this.studentDetailsService = studentDetailsService;
    }

    @GetMapping("/allStudentsDetails")
    public List<StudentDetails> getAllStudentDetails() {
        return studentDetailsService.getAllStudentDetails();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDetails> getStudentDetailsById(@PathVariable Long id) {
        return studentDetailsService.getStudentDetailsById(id);
    }

    @PostMapping("/save-student")
    public ResponseEntity<StudentDetails> saveStudentDetails(@RequestBody StudentDetails studentDetails) {
        return studentDetailsService.saveStudentDetails(studentDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudentDetails(@PathVariable Long id) {
        return studentDetailsService.deleteStudentDetails(id);
    }
}
