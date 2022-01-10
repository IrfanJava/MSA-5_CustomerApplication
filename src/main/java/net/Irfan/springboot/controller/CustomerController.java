package net.Irfan.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.Irfan.springboot.model.Customer;
import net.Irfan.springboot.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List getAllCustomer() {
		return customerService.getAllCustomers();
	}
	
	@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
	public Optional<Customer> getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		
	}
	
	@RequestMapping(value = "/customers/{id}", method = RequestMethod.PUT)
	public void updateCustomer(@RequestBody Customer customer,@PathVariable int id) {
		customerService.updateCustomer(id, customer);
	}
	
	@RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
	}
	
	
	
}
