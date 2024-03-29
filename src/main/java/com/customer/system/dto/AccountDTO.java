package com.customer.system.dto;

public class AccountDTO {

	private int id;
	private int account_number;
	private float balance;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public AccountDTO(int account_number, float balance, String description) {
		super();
		this.account_number = account_number;
		this.balance = balance;
		this.description = description;
	}
	
	public AccountDTO() {}
	
	
}
