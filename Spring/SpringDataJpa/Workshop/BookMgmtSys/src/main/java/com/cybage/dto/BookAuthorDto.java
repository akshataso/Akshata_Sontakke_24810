package com.cybage.dto;

public class BookAuthorDto {
	private int bookId;
	private String title;
	private String publisher;
	private String email;
	private String name;
	private String mobile;

	public BookAuthorDto() {
		super();
	}

	public BookAuthorDto(int bookId, String title, String publisher, String email, String name, String mobile) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.publisher = publisher;
		this.email = email;
		this.name = name;
		this.mobile = mobile;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
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
