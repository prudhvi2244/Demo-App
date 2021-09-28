package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CustomerDetails;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails,Integer>{

}
