package com.bean;

public class UserBean {

	String firstName;
	String lastName;
	int age;
	
	public void init() {
		
		firstName = "Hardik";
		lastName = "Prajapati";
	}
	
	public void destroy() {
		System.out.println("Destroy called");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
