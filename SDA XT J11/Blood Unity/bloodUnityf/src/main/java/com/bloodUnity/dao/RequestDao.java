package com.bloodUnity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodUnity.entity.RequestCompleted;


public interface RequestDao extends JpaRepository<RequestCompleted,Integer>{

	void save(Integer userid);

}
