package com.example.myproject.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	/*
	 * 通过年龄获取    必须命名findByAge 
	 */
	public List<Customer> findByAge(Integer age);

}
