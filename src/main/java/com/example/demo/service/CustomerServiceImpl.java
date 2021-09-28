package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomerDetails;
import com.example.demo.repo.CustomerDetailsRepository;
@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerDetailsRepository cDetailsRepo;
	
	@Override
	public String saveCustomer(CustomerDetails customerDetails) {
		CustomerDetails cdetails=cDetailsRepo.save(customerDetails);
		return "Customer Details Saved Successfully";
	}

}
