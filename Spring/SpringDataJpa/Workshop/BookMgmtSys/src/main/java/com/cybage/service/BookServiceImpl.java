package com.cybage.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.BookRepository;
import com.cybage.model.Book;

@Service
public class BookServiceImpl {
	@Autowired
	private BookRepository bookRepository;

	//private List<Book> bookList = new ArrayList<>();

	public boolean authenticate(String username, String password) {
		if (username.equals("admin") && password.equals("admin123")) {
			return true;
		}
		return false;
	}

	public List<Book> addBook(Book book) {
		// bookList.add(book);
		bookRepository.save(book);
		return getBooks();
	}

	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	public List<Book> editBook(Book book) {
		/*
		 * Book book2 = null; for (Book b : bookList) { if (b.getBookId() ==
		 * book.getBookId()) { book2 = b; } } bookList.remove(book2);
		 * bookList.add(book);
		 */
		bookRepository.save(book);
		return getBooks();
	}

	public List<Book> deleteBook(int bookId) {
		// bookList.remove(bookId);
		bookRepository.deleteById(bookId);
		return getBooks();
	}
	public Book getBookById(int id) {
		/*
		 * Book book = null; for (Book b : bookList) { if (b.getBookId() == id) { book =
		 * b; } }
		 */
		return getBookById(id);
	}

	public List<Book> getBookByTitle(String search) {
		// return bookList.stream().filter((e) ->
		// e.getTitle().equals(search)).collect(Collectors.toList());
		return bookRepository.findBookByTitle(search);
	}

	public List<Book> getBookByPublisher(String search) {
		// return bookList.stream().filter((e) ->
		// e.getPublisher().equals(search)).collect(Collectors.toList());
		return bookRepository.findBookByPublisher(search);
	}
}
