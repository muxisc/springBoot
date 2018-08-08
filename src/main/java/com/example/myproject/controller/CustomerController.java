package com.example.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.domain.Customer;
import com.example.myproject.service.ICustomerService;

@RestController    //controller里的方法都以json格式输出
public class CustomerController {
	
	@Value("${zm}")
	private String zm;
	
	@Autowired
	private ICustomerService customerService;
	
	@RequestMapping("/hello")
	public String index() {
		return "Hello World"+zm;
	}
	
	@RequestMapping("/getAll")
	public List<Customer> getAll(){
		return customerService.getAll();
	}
	
	@RequestMapping(value="/addOne")
	public String addOne(@RequestParam("zm") String zm,@RequestParam("age") Integer age) {
		customerService.addOne(zm, age);
		return "新增一条记录成功";
	}
	
	@RequestMapping("/getByAge")
	public List<Customer> getByAge(@RequestParam("age") Integer age){
		return customerService.getByAge(age);
	}
	
	@RequestMapping("/addTwo")
	public void addTwo() {
		customerService.addTwo();
	}

}
