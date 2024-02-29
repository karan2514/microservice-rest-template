package com.customer.system.dto;

public class APIResponseDTO {

	private CustomerDTO customerDTO;
	private AccountDTO accountDTO;
	public CustomerDTO getCustomerDTO() {
		return customerDTO;
	}
	public void setCustomerDTO(CustomerDTO customerDTO) {
		this.customerDTO = customerDTO;
	}
	public AccountDTO getAccountDTO() {
		return accountDTO;
	}
	public void setAccountDTO(AccountDTO accountDTO) {
		this.accountDTO = accountDTO;
	}
	public APIResponseDTO(CustomerDTO customerDTO, AccountDTO accountDTO) {
		super();
		this.customerDTO = customerDTO;
		this.accountDTO = accountDTO;
	}
	public APIResponseDTO() {}
	
	
}
