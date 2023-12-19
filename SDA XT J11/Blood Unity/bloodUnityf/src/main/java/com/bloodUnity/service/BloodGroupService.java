package com.bloodUnity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodUnity.dao.BloodGroupDao;
import com.bloodUnity.entity.BloodGroup;

@Service
public class BloodGroupService {

		@Autowired
		private BloodGroupDao bloodGroupDao;
		
		public void save(BloodGroup bloodGroup) {
			bloodGroupDao.save(bloodGroup);
		}

		public BloodGroup updateStockValue(Long id, int newStockValue) {
			Optional<BloodGroup> bloodGroup = bloodGroupDao.findById(id);
            BloodGroup result= bloodGroup.get();
            result.setStock(newStockValue);
	        return bloodGroupDao.save(bloodGroup);
	    }
		

	
}
