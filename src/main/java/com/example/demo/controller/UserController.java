package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	/*
	 * http://localhost:8080/user/saveUser
	   {
	     "username":"prudhvi2244",
	     "password":"12345",
	     "roles":["Admin","SuperUser"]
 	   }
	 */
	
	@PostMapping(value = "/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user)
	{
		User savedUser=userService.saveUser(user);
		return new ResponseEntity<User>(savedUser,HttpStatus.CREATED);
	}

}
