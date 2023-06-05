package com.greatlearning.model;

public class Employee {
	private String firstName, lastName,email,pwd;
	public int getFirstName;

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public String getPwd() {
		return pwd;
	}


		
	
	
}
