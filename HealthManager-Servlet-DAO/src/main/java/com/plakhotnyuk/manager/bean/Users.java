package com.plakhotnyuk.manager.bean;

public class Users {
	private int id;
	private String email;
	private String firstName;
	private String secondName;
	private String password;
	
	public Users() {
		
	}

	public Users(int id, String email, String firstName, String secondName, String password) {
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.secondName = secondName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", email=" + email + ", firstName=" + firstName + ", secondName=" + secondName
				+ ", password=" + password + "]";
	}
	
	
	
}
