package com.bloodUnity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodUnity.dao.RequestDao;
import com.bloodUnity.dao.UserDao;

import com.bloodUnity.entity.User;

@Service
public class UserService {
  
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private RequestDao requestDao;
	
	public void save(User user) {
		userDao.save(user);
	}
	public String completeRequest(Integer Userid) {
		if(userDao.existsById(Userid))
			requestDao.save(Userid);
			userDao.deleteById(Userid);
		
		return  " Completed SuccessFully...";
	}
	
	
	
}
