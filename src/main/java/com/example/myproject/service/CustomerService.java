package com.example.myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.myproject.domain.Customer;
import com.example.myproject.domain.CustomerRepository;

@Service
public class CustomerService  implements ICustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAll() {
		return customerRepository.findAll();
	}

	@Override
	public void addOne(String zm, Integer age) {
		Customer customer=new Customer();
		customer.setZm(zm);
		customer.setAge(age);
		customerRepository.save(customer);
	}

	
	/*
	 * 通过年龄获取
	 */
	@Override
	public List<Customer> getByAge(Integer age) {
		return customerRepository.findByAge(age);
	}

	
	/*
	 * 事务管理:
	 * 若第一条插入成功，第二条失败，则全部失败。要么全部成功，要么全部失败。
	 * 
	 */
	@Transactional
	public void addTwo() {
		Customer customer1=new Customer();
		customer1.setZm("A");
		customer1.setAge(10);
		customerRepository.save(customer1);
		
		Customer customer2=new Customer();
		customer2.setZm("AB");
		customer2.setAge(20);
		customerRepository.save(customer2);
		
	}
	


}
