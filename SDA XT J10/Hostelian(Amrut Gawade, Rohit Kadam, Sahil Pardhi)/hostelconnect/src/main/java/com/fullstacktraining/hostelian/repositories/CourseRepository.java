package com.fullstacktraining.hostelian.repositories;

import com.fullstacktraining.hostelian.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
    boolean existsByCourseCode(String courseCode);
}
