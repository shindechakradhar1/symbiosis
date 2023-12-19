package com.bloodUnity.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodUnity.entity.BloodGroup;

public interface BloodGroupDao extends JpaRepository<BloodGroup, Long> {

	BloodGroup save(Optional<BloodGroup> bloodGroup);

	

  
}

