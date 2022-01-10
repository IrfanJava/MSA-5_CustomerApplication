package net.Irfan.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.Irfan.springboot.model.Customer;
import net.Irfan.springboot.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List getAllCustomers() {
		
		List customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		
		return customers;
	}
	
	public Optional<Customer> getCustomer(int id) {
		return customerRepository.findById(id);
	}
	
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	

	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}

	public void updateCustomer(int id, Customer customer) {
		customerRepository.save(customer);
		
	}
	
}
