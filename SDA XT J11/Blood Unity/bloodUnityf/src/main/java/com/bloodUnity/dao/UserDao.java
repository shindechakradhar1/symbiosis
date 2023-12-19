package com.bloodUnity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodUnity.entity.User;

public interface UserDao extends JpaRepository<User,Integer>{

}
