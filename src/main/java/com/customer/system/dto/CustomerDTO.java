package com.customer.system.dto;

public class CustomerDTO {

	private int id;
	private String name;
	private String email;
	private String phoneNo;
	private String username;
	private String address;
	private int account_number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public CustomerDTO(String name, String email, String phoneNo, String username, String address, int account_number) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.username = username;
		this.address = address;
		this.account_number = account_number;
	}
	
	public CustomerDTO() {}
	
	
}
