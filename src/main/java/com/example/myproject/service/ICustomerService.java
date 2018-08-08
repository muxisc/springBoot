package com.example.myproject.service;

import java.util.List;

import com.example.myproject.domain.Customer;

public interface ICustomerService {
	
	public List<Customer> getAll();
	
	public void addOne(String zm,Integer age);
	
	public List<Customer> getByAge(Integer age);
	
	public void addTwo();

}
