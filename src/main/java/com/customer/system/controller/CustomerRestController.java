package com.customer.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.customer.system.dto.APIResponseDTO;
import com.customer.system.model.Customer;
import com.customer.system.service.CustomerService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/getAll")
	public List<Customer> getAllCustomers() {
		return customerService.listAll();
	}
	
	@PostMapping("/customer")
	public Customer create(@RequestBody Customer customer) {
		return customerService.create(customer);
	}
	
	@PutMapping("/customer/{id}")
	public Customer updateCustomer(@PathVariable("id") int id, @RequestBody Customer customer) {
		customer.setId(id);
		Customer updatedCustomer = customerService.update(customer);
		
		return updatedCustomer;
	}
	
	@DeleteMapping("/customer/{id}")
	public void delete(@PathVariable("id") int id) {
		customerService.delete(id);
	}
	
	@GetMapping("/customerFullDetails/{id}")
	public ResponseEntity<APIResponseDTO> getCustomer(@PathVariable("id") int id) {
		APIResponseDTO apiResponseDTO = customerService.getCustomer(id);
		return new ResponseEntity<>(apiResponseDTO, HttpStatus.OK);
	}
	
	
	
}
