package com.customer.system;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.customer.system.model.Customer;
import com.customer.system.repository.CustomerRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CustomerRepositoryTest {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void testCreate() {
		Customer customer = new Customer();
		customer.setUsername("testUser");
		customer.setAddress("Hyderabad");
		customer.setEmail("testuser121@gmail.com");
		customer.setCardNo(12345543);
		customer.setName("test");
		customer.setPhoneNo("4567894567");
		
		customerRepository.save(customer);
		
		assertThat(customer).isNotNull();
	}
}
