package com.example.myproject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * 创建好该类后，运行Application，数据库会生成对应表：customer
 */
@Entity     //可以让该实体类 对应 数据库表
public class Customer {

	@Id
	@GeneratedValue    //自增
	private Integer id;
	
	private String zm;
	
	private Integer age;
	
	public Customer() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getZm() {
		return zm;
	}

	public void setZm(String zm) {
		this.zm = zm;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	

}
