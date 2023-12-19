package com.fullstacktraining.hostelian.services.interfaces;

import com.fullstacktraining.hostelian.entities.Student;

import java.util.List;

public interface StudentService {
    public Student register(Student student) throws Exception;

    List<Student> getAllStudents();

    Student getStudent(Long studentId);

    boolean deleteStudent(Long studentId);
}
