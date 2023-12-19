package com.bloodUnity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Donor {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer DonorId;
	private String name;
	private String address;
	private String phone;
	private String bloodGroup;   
//	private String emailAddress;
	
	public Donor() {
		
	}
	public Donor(Integer donorId, String name, String address, String phone, String bloodGroup, String emailAddress) {
		
		DonorId = donorId;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.bloodGroup = bloodGroup;
//		this.emailAddress = emailAddress;
	}
	public Integer getDonorId() {
		return DonorId;
	}
	public void setDonorId(Integer donorId) {
		DonorId = donorId;
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
//	public String getEmailAddress() {
//		return emailAddress;
//	}
//	public void setEmailAddress(String emailAddress) {
//		this.emailAddress = emailAddress;
//	}
	
	
	
}
