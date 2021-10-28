

package com.cybage.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exception.CustomerException;
import com.cybage.model.Customer;
import com.cybage.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/getAllCustomers")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customerList = customerService.getCustomers();
		if (customerList.size() == 0) {
			throw new CustomerException("Customer not Found");
		} else {
			return new ResponseEntity<>(customerList, HttpStatus.OK);
		}
	}

	@PostMapping("/addCustomer")
	public ResponseEntity<String> addCustomer(@Valid @RequestBody Customer customer) {
		if (customerService.addCustomer(customer) != null) {
			return new ResponseEntity<>("Customer Added", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Customer Addition Failed", HttpStatus.NOT_IMPLEMENTED);
		}
	}

	@PutMapping("/editCustomer")
	public ResponseEntity<String> editCustomer(@Valid @RequestBody Customer customer) {
		if (customerService.editCustomer(customer) != null) {
			return new ResponseEntity<>("Customer Edited", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Customer edit Failed", HttpStatus.NOT_IMPLEMENTED);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
		return new ResponseEntity<>("Customer deleted", HttpStatus.OK);
	}

	@GetMapping("/filterCustomer")
	public ResponseEntity<List<Customer>> filterCustomer(@RequestParam String searchType,
			@RequestParam String searchValue) {
		List<Customer> customers = new ArrayList<>();
		if (searchType.equals("name")) {
			customers = customerService.findCustomerByName(searchValue);
		} else if (searchType.equals("address")) {
			customers = customerService.findCustomerByAddress(searchValue);
		}
		if (customers.size() == 0) {
			throw new CustomerException("Customer not found");
		} else {
			return new ResponseEntity<>(customers, HttpStatus.OK);
		}
	}

	@GetMapping("/getCustomerByEmail")
	public ResponseEntity<Customer> getCustomerByEmail(@RequestParam String email) {
		Customer customer = customerService.findCustomerByEmail(email);
		if (customer != null) {
			return new ResponseEntity<>(customer, HttpStatus.OK);
		} else {
			throw new CustomerException("Customer not found");
		}
	}
}
