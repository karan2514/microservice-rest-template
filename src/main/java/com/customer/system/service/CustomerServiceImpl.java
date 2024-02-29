package com.customer.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customer.system.dto.APIResponseDTO;
import com.customer.system.dto.AccountDTO;
import com.customer.system.dto.CustomerDTO;
import com.customer.system.model.Customer;
import com.customer.system.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer create(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> listAll() {
		
		return customerRepository.findAll();
	}

	@Override
	public Customer update(Customer customer) {
		Customer existingCustomer = customerRepository.findById(customer.getId()).get();
		existingCustomer.setAddress(customer.getAddress());
		existingCustomer.setCardNo(customer.getCardNo());
		existingCustomer.setEmail(customer.getEmail());
		existingCustomer.setName(customer.getName());
		existingCustomer.setPhoneNo(customer.getPhoneNo());
		existingCustomer.setUsername(customer.getUsername());
		return customerRepository.save(existingCustomer);
	}

	@Override
	public void delete(int id) {
		customerRepository.deleteById(null);
		
	}

	@Override
	public APIResponseDTO getCustomer(int id) {
		Customer customer = customerRepository.findById(id).get();
		ResponseEntity<AccountDTO> responseEntity = restTemplate.getForEntity("http://localhost:8082/api/account/accounts/+"+customer.getAccount_number(), AccountDTO.class);
		AccountDTO AccountDTO= responseEntity.getBody();
		
		
		
		CustomerDTO customerDTO = new CustomerDTO();
		
		customerDTO.setName(customer.getName());
		customerDTO.setEmail(customer.getEmail());
		customerDTO.setPhoneNo(customer.getPhoneNo()) ;
		customerDTO.setUsername(customer.getUsername()) ;
		customerDTO.setAddress(customer.getAddress()) ;
		customerDTO.setAccount_number(customer.getAccount_number()) ;
		
		APIResponseDTO apiResponseDTO = new APIResponseDTO();
		apiResponseDTO.setCustomerDTO(customerDTO);
		apiResponseDTO.setAccountDTO(AccountDTO);
		
		
		return apiResponseDTO;
	}




	
	

}
