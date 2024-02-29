package com.customer.system.service;

import java.util.List;

import com.customer.system.dto.APIResponseDTO;
import com.customer.system.model.Customer;

public interface CustomerService {

	public Customer create(Customer customer);
	public List<Customer> listAll();
	public Customer update(Customer customer);
	public void delete(int id);
	public APIResponseDTO getCustomer(int id);
	
}
