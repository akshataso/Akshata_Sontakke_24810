package com.cybage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findCustomerByName(String name);

	List<Customer> findCustomerByAddress(String address);

	Customer findCustomerByEmail(String email);
}
