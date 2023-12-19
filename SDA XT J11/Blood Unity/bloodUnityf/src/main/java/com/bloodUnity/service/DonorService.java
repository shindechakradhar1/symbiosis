package com.bloodUnity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bloodUnity.dao.DonorDao;

import com.bloodUnity.entity.Donor;

@Service
public class DonorService {
  
	@Autowired
	private DonorDao donorDao;
	
	public void save(Donor donor) {
		donorDao.save(donor);
	}

	public String deleteDonor(Long donorId) {
		donorDao.deleteById(donorId);
		return  "Donor Deleted SuccessFully...";
	}
	
}
