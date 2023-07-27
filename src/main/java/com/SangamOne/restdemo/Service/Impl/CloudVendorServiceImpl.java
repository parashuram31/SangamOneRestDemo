package com.SangamOne.restdemo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SangamOne.restdemo.Repository.CloudVendorRepository;
import com.SangamOne.restdemo.Service.CloudVendorService;
import com.SangamOne.restdemo.model.CloudVendor;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
	@Autowired
	CloudVendorRepository cloudVendorRepository;

	/*public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}*/

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Sucsess";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(int cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(int cloudVendorId) {
		
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
	
		return cloudVendorRepository.findAll();
	}

	

}
