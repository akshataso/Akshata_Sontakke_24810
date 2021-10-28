package com.cybage.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
@Entity
public class Book {
	@NotNull
	@Id
	
	private int bookId;
	@NotNull
	@Column
	private String title;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "book")
	//@JoinTable(name = "bookAuthor",joinColumns = {@JoinColumn(name="bookId")},inverseJoinColumns = {@JoinColumn(name="email")})
	private List<Author> authors = new ArrayList<>();
	@NotNull
	@Column
	private String publisher;

	


	public Book(@NotNull int bookId, @NotNull String title, @NotNull String publisher) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.publisher = publisher;
	}

	public Book(@NotNull int bookId, @NotNull String title, @NotNull List<Author> authors, @NotNull String publisher) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
	}

	

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public Book() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + authors + ", publisher=" + publisher + "]";
	}

}
