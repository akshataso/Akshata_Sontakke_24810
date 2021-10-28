package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Customer {
	@Id
	@NotNull
	private int customerId;

	@Column
	@NotEmpty
	private String name;

	@Column
	@NotNull
	private String address;
	
	@Column
	@NotNull
	private String email;

	

	public Customer(@NotNull int customerId, @NotEmpty String name, @NotNull String address, @NotNull String email) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public Customer() {
		super();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
