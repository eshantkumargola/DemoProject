package com.expertorion.demoproject.dao;

import org.springframework.stereotype.Component;

@Component
public class User {

	private long         id ;
	private String username ;
	private String password ;
	private String  country ;
	private long    zipcode ;	
	
	public User() {}

	public User(long id, String username, String password, String country, long zipcode) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.country = country;
		this.zipcode = zipcode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getZipcode() {
		return zipcode;
	}


	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", country=" + country
				+ ", zipcode=" + zipcode + "]";
	}	
}
