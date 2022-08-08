package com.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeBean implements InitializingBean,DisposableBean{

	String name;
	String gender;
	int salary;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("init from Initializing Bean");
		
	}
//	public void destroy() throws Exception {
//		System.out.println("Destroy from Disposable Bean");
//		
//	}
public void init() {
		
		name = "Hardik";
		gender = "male";
	}
	
	public void destroy() {
		System.out.println("Destroy called");
	}
	
}
