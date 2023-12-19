package com.bloodUnity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodUnity.entity.Donor;

public interface DonorDao extends JpaRepository<Donor, Long> {
	
}

