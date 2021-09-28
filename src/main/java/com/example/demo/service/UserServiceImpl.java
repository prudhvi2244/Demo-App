package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository urepo;

	@Override
	public User saveUser(User user) {
		User savedUser=urepo.save(user);
		System.out.println(savedUser);
		return savedUser;
	}

}
