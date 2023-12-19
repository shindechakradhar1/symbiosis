package com.fullstacktraining.hostelian.services.interfaces;

import com.fullstacktraining.hostelian.entities.Admin;
import com.fullstacktraining.hostelian.entities.Course;
import com.fullstacktraining.hostelian.entities.Fees;
import com.fullstacktraining.hostelian.entities.Room;
import com.fullstacktraining.hostelian.models.ResponseModel;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface CourseService {
    ResponseEntity<Course> addCourse(Course course);

    List<Course> getAllCourses();

    ResponseEntity<Course> getUniqueCourse(Long courseId);

    ResponseEntity<Course> updateCourse(Long courseId, Course course);

    ResponseEntity<String> deleteCourseDetails(Long courseId);
}
