package com.fullstacktraining.hostelian.services;

import com.fullstacktraining.hostelian.entities.Student;
import com.fullstacktraining.hostelian.repositories.StudentRepository;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataFetchingException;
import com.fullstacktraining.hostelian.CustomExceptionClasses.DataInsertionException;
import com.fullstacktraining.hostelian.services.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student register(Student student) throws DataInsertionException {
        Student student1 = studentRepository.findByEmailId(student.getEmailId());
        if (student1!=null)
        {
            throw new DataInsertionException("User Already Exists..!");
        }
//        student.
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = studentRepository.findAll();
        if (list.isEmpty())
        {
            throw new DataFetchingException("Data is not available..!");
        }
        return list;
    }

    @Override
    public Student getStudent(Long studentId) {
        return  studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public boolean deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
        return true;
    }

}