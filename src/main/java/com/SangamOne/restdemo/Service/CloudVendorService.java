package com.SangamOne.restdemo.Service;

import java.util.List;

import com.SangamOne.restdemo.model.CloudVendor;

public interface CloudVendorService {
	
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(int cloudVendorId);
	public CloudVendor getCloudVendor(int cloudVendorId);
	public List<CloudVendor> getAllCloudVendors();
	

}
