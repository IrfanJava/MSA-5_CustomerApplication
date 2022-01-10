package net.Irfan.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.Irfan.springboot.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository <Customer,Integer> {
	
}


