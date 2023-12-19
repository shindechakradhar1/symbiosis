package com.fullstacktraining.hostelian.repositories;

import com.fullstacktraining.hostelian.entities.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Long> {
}
