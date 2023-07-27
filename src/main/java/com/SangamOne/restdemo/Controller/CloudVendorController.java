package com.SangamOne.restdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.restdemo.Service.CloudVendorService;
import com.SangamOne.restdemo.model.CloudVendor;

@RestController
@RequestMapping(value="/Cloud")
public class CloudVendorController {
	
@Autowired
CloudVendorService cloudVendorService;

/*public CloudVendorController(CloudVendorService cloudVendorService) {
	super();
	this.cloudVendorService = cloudVendorService;
}*/

//@Autowired
//CloudVendor cloudVendor;

@GetMapping("{cloudVendorId}")
public CloudVendor getCloudVendorDetailes(@PathVariable("cloudVendorId")int cloudVendorId) {
	return cloudVendorService.getCloudVendor(cloudVendorId);
}

@PostMapping
public String addCloudVendor(@RequestBody CloudVendor cloudVendor) {
	cloudVendorService.createCloudVendor(cloudVendor);
	//this.cloudVendor = cloudVendor;
	return "Cloud Vendor Created Successfully";
}

@PutMapping//("/update/{cloudVendorId}")
public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
	cloudVendorService.updateCloudVendor(cloudVendor);
	//this.cloudVendor = cloudVendor;
	return "Cloud Vendor Updated Successfully";

}

@DeleteMapping("/delete/{cloudVendorId}")
public String deleteCloudVendor(@PathVariable ("cloudVendorId") int cloudVendorId) {
	cloudVendorService.deleteCloudVendor(cloudVendorId);
	//this.cloudVendor = null;
	return "Cloud Vendor Updated Successfully";

}

@GetMapping()
public List<CloudVendor> getAllCloudVendorDetails() {
	
	return cloudVendorService.getAllCloudVendors();
}

}
