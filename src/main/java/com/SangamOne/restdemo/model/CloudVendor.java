package com.SangamOne.restdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="cloud_vendor")
public class CloudVendor {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	 
	@Column (name="cloud_vendor_id")
	private int cloudVendorId;
	
	@Column (name="cloud_vendor_name")
	private String cloudVendorName;
	
	public int getCloudVendorId() {
		return cloudVendorId;
	}

	public void setCloudVendorId(int cloudVendorId) {
		this.cloudVendorId = cloudVendorId;
	}

	public String getCloudVendorName() {
		return cloudVendorName;
	}

	public void setCloudVendorName(String cloudVendorName) {
		this.cloudVendorName = cloudVendorName;
	}

	

	

}
