package com.fullstacktraining.hostelian.controllers;

import com.fullstacktraining.hostelian.entities.Student;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataFetchingException;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataInsertionException;
import com.fullstacktraining.hostelian.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/student")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService sService){
        studentService = sService;
    }
//    Student temp = new Student("Sahil","Pardhi","Computer",'M', 9420293054L,"sahilpardhi@gmail.com","sahil@123");

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Student student) {
        try {
            studentService.register(student);
            return ResponseEntity.ok("Data inserted Successfully..!");
        }catch (DataInsertionException exception){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Data Already Exists");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/allstudents")
    public ResponseEntity<List<Student>> getStudents() {
        try {
            List<Student> list = studentService.getAllStudents();
            return ResponseEntity.ok(list);
        }catch (DataFetchingException exception){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getUniqueStudent(@PathVariable Long studentId) {
        Student student = null;
        try {
            student = studentService.getStudent(studentId);
            return ResponseEntity.ok(student);
        }catch (DataFetchingException exception){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(student);
        }
    }

    @DeleteMapping("/{studentId}")
    public String deleteStudent(@PathVariable Long studentId){
        try {
            boolean result = studentService.deleteStudent(studentId);
            return "Successfully Deleted";
        }catch (DataFetchingException exception){
            return "Failed";
        }
    }
}
