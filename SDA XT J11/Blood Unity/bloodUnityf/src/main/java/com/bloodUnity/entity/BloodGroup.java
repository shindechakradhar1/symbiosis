package com.bloodUnity.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BloodGroup {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
   
	private Long id;

    private String groupType;
    private Integer stock;
	
    public BloodGroup() {
		
	}
	public BloodGroup(Long id, String groupType, Integer stock) {
		
		this.id = id;
		this.groupType = groupType;
		this.stock = stock;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGroupType() {
		return groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
    
    
}
