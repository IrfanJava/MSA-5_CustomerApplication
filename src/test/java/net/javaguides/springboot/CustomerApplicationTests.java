package net.javaguides.springboot;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import net.Irfan.springboot.CustomerApplication;
import net.Irfan.springboot.model.Customer;
import net.Irfan.springboot.repository.CustomerRepository;
import net.Irfan.springboot.service.CustomerService;

@SpringBootTest(classes=CustomerApplication.class)
class CustomerApplicationTests {

	@Autowired
	private CustomerService cutserv;
	
	@MockBean
	private CustomerRepository custrepo;
	
	@Test
	public void getAllCustomerTest() {
		when(custrepo.findAll()).thenReturn(Stream.of(new Customer("Kurt","M","45","veg"),new Customer("Nacho","M","19","nonveg"),new Customer("Kim","F","28","veg"),new Customer("Polios","M","47","nonveg")).collect(Collectors.toList()));
	
	assertEquals(4,(cutserv.getAllCustomers()).size());
	}	
}
