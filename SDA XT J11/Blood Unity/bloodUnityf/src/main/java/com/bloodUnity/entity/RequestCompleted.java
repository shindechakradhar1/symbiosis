package com.bloodUnity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class RequestCompleted {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer CompletedId;
	private String name;
	private String address;
	private String phone;
	private String bloodGroup;
	public RequestCompleted() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequestCompleted(Integer completedId, String name, String address, String phone, String bloodGroup) {
		super();
		CompletedId = completedId;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.bloodGroup = bloodGroup;
	}
	public Integer getCompletedId() {
		return CompletedId;
	}
	public void setCompletedId(Integer completedId) {
		CompletedId = completedId;
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
		return "RequestCompleted [CompletedId=" + CompletedId + ", name=" + name + ", address=" + address + ", phone="
				+ phone + ", bloodGroup=" + bloodGroup + "]";
	}   
	
	
}
	