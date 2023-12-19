package com.fullstacktraining.hostelian.services;

import com.fullstacktraining.hostelian.CustomExceptionClasses.DataDeletionException;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataFetchingException;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataInsertionException;
import com.fullstacktraining.hostelian.entities.Admin;
import com.fullstacktraining.hostelian.entities.Course;
import com.fullstacktraining.hostelian.entities.Fees;
import com.fullstacktraining.hostelian.entities.Room;
import com.fullstacktraining.hostelian.models.ResponseModel;
import com.fullstacktraining.hostelian.repositories.AdminRepository;
import com.fullstacktraining.hostelian.repositories.CourseRepository;
import com.fullstacktraining.hostelian.repositories.FeesRepository;
import com.fullstacktraining.hostelian.repositories.RoomRepository;
import com.fullstacktraining.hostelian.services.interfaces.AdminService;
import com.fullstacktraining.hostelian.services.interfaces.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    public CourseServiceImpl() {
    }


    //Course Entity CRUD Operation
    @Override
    public ResponseEntity<Course> addCourse(Course course) {
        boolean isPresent = courseRepository.existsByCourseCode(course.getCourseCode());
        if (isPresent)
            throw new DataInsertionException("Course Code "+course.getCourseCode()+" is already present");
        return new ResponseEntity<>(courseRepository.save(course),HttpStatus.CREATED);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public ResponseEntity<Course> getUniqueCourse(Long courseId) {
        Course course = courseRepository.findById(courseId).orElse(null);
        if (course==null) {
            throw new DataFetchingException("There is no course with course id " + courseId);
        }
        return new ResponseEntity<>(course, HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<Course> updateCourse(Long courseId, Course course) {
        Course existingCourse = courseRepository.findById(courseId).orElse(null);
        if (existingCourse == null) {
            throw new DataFetchingException("There is no course with course id " + courseId);
        }
        existingCourse.setCourseCode(course.getCourseCode());
        existingCourse.setCourseName(course.getCourseName());

        return new ResponseEntity<>(courseRepository.save(existingCourse), HttpStatus.CREATED);
    }
    @Override
    public ResponseEntity<String> deleteCourseDetails(Long courseId) {
        if (courseRepository.existsById(courseId))
            courseRepository.deleteById(courseId);
        else
            throw new DataDeletionException("Course is not available with id "+courseId);
        return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
    }

}
