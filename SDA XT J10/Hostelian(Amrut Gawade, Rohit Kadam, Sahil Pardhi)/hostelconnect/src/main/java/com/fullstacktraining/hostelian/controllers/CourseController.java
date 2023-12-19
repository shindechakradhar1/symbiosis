package com.fullstacktraining.hostelian.controllers;

import com.fullstacktraining.hostelian.entities.Course;
import com.fullstacktraining.hostelian.services.interfaces.CourseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    //Course Requests Controller
    @PostMapping("/addCourse")
    public ResponseEntity<Course> addNewCourse(@Valid @RequestBody Course course){
        return courseService.addCourse(course);
    }
    @GetMapping("/coursedetails")
    public List<Course> getCourseDetails(){
        return courseService.getAllCourses();
    }

    @PutMapping("/updatecoursedetails/{courseId}")
    public ResponseEntity<Course> updateCourse(@PathVariable Long courseId,@Valid @RequestBody Course course){
        return courseService.updateCourse(courseId,course);
    }
    @DeleteMapping("/deletecourse/{courseId}")
    public ResponseEntity<String> deleteCourse(@PathVariable Long courseId){
        return courseService.deleteCourseDetails(courseId);
    }
    @GetMapping("/coursedetails/{courseId}")
    public ResponseEntity<Course> getUniqueCourseDetails(@PathVariable Long courseId){
        return courseService.getUniqueCourse(courseId);
    }
}
