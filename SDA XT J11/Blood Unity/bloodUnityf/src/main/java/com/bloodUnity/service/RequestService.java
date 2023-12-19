package com.bloodUnity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodUnity.dao.RequestDao;

import com.bloodUnity.entity.RequestCompleted;


@Service
public class RequestService {
	@Autowired
	private RequestDao requestDao;
	
	public void save(RequestCompleted requestCompleted) {
		requestDao.save(requestCompleted);
	}
}
