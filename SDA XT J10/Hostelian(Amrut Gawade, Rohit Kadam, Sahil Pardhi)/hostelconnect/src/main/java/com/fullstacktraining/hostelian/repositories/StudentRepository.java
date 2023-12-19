package com.fullstacktraining.hostelian.repositories;

import com.fullstacktraining.hostelian.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student findByEmailId(String emailId);
}
