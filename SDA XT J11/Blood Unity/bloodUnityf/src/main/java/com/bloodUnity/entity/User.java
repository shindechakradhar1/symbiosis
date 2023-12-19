package com.bloodUnity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Userid;
	private String name;
	private String address;
	private String phone;
	private String bloodGroup;   
	
	public User() {
		
	}

	public User(Integer userid, String name, String address, String phone, String bloodGroup) {
		super();
		Userid = userid;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.bloodGroup = bloodGroup;
	}

	public Integer getUserid() {
		return Userid;
	}

	public void setUserid(Integer userid) {
		Userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "User [Userid=" + Userid + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", bloodGroup=" + bloodGroup + "]";
	}

	
	
}
