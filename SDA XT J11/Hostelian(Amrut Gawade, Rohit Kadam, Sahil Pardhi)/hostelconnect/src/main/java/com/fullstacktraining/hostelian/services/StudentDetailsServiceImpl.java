package com.fullstacktraining.hostelian.services;

import com.fullstacktraining.hostelian.CustomExceptionClasses.DataDeletionException;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataFetchingException;
import com.fullstacktraining.hostelian.entities.StudentDetails;
import com.fullstacktraining.hostelian.models.ResponseModel;
import com.fullstacktraining.hostelian.repositories.StudentDetailsRepository;
import com.fullstacktraining.hostelian.services.interfaces.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {

    private final StudentDetailsRepository studentDetailsRepository;

    @Autowired
    public StudentDetailsServiceImpl(StudentDetailsRepository studentDetailsRepository) {
        this.studentDetailsRepository = studentDetailsRepository;
    }

    public List<StudentDetails> getAllStudentDetails() {

        List<StudentDetails> studentDetails = studentDetailsRepository.findAll();
        if (studentDetails.isEmpty())
        {
            throw new DataFetchingException("Data is not available..!");
        }
        return studentDetails;
    }

    public ResponseEntity<StudentDetails> getStudentDetailsById(Long id) {
        StudentDetails studentDetails = studentDetailsRepository.findById(id).orElse(null);
        if (studentDetails == null) {
            throw new DataFetchingException("There is no student details with room id " + id);
        }
        return new ResponseEntity<>(studentDetails, HttpStatus.FOUND);
    }

    public ResponseEntity<StudentDetails> saveStudentDetails(StudentDetails studentDetails) {
        return new ResponseEntity<>(studentDetailsRepository.save(studentDetails), HttpStatus.CREATED);
    }

    public ResponseEntity<String> deleteStudentDetails(Long id) {
        if (studentDetailsRepository.existsById(id))
            studentDetailsRepository.deleteById(id);
        else
            throw new DataDeletionException("Student is not available with id "+id);
        return new ResponseEntity<>("Successfully Deleted",HttpStatus.OK);
    }
}

