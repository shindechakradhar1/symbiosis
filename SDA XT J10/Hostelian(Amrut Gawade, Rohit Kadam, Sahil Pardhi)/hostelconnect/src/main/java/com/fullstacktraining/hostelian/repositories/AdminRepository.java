package com.fullstacktraining.hostelian.repositories;

import com.fullstacktraining.hostelian.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
    public Admin findByEmailAndPassword(String email,String password);
}
