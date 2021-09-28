package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerDetails;
import com.example.demo.service.ICustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

	@Autowired
	private ICustomerService cservice;
	
	/*
	 * Http Method : POST 
	 * http://localhost:8080/customer/saveCustomer
	 * status : 201 : Created
	  {
	    "ccity":"Goa",
	    "cmobile":"90909012345",
	    "customer":{
	      "cname":"Raj"
	    }
	  }
	 */
	@PostMapping(value = "/saveCustomer")
	public ResponseEntity<String> saveCustomer(@RequestBody CustomerDetails cdetails)
	{
		String msg=cservice.saveCustomer(cdetails);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
}
