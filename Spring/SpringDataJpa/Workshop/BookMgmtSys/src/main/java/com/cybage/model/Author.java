package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Author {

	@Id
	private String email;
	@Column
	private String name;

	@Column
	private String mobile;

	@ManyToOne
	@JoinColumn(name = "book")
	private Book book;


	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Author() {
		super();
	}

	public Author(String email, String name, String mobile) {
		super();
		this.email = email;
		this.name = name;
		this.mobile = mobile;
		
	}



	public Author(String email, String name, String mobile, Book book) {
		super();
		this.email = email;
		this.name = name;
		this.mobile = mobile;
		this.book = book;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	
}
