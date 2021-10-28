package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.CustomerRepository;
import com.cybage.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public Customer getCustomerById(int id) {
		return customerRepository.getById(id);
	}

	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	public Customer addCustomer(Customer customer) {
	return	customerRepository.save(customer);
	}

	public Customer editCustomer(Customer customer) {
	return	customerRepository.save(customer);
	}

	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}

	public List<Customer> findCustomerByName(String name) {
		return customerRepository.findCustomerByName(name);
	}

	public List<Customer> findCustomerByAddress(String address) {
		return customerRepository.findCustomerByAddress(address);
	}

	public Customer findCustomerByEmail(String email) {
		return customerRepository.findCustomerByEmail(email);
	}

}
