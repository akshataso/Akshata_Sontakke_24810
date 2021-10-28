package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.AuthorRepository;
import com.cybage.model.Author;

@Service
public class AuthorServiceImpl {
	@Autowired
	private AuthorRepository authorRepository;

	public void addAuthor(Author author) {
		authorRepository.save(author);
	}

	public List<Author> getAuthorsByBook(int bookId) {
		List<Author> bookAuthors = new ArrayList<>();
		List<Author> authorList = authorRepository.findAll();
		for (Author a : authorList) {
			if (a.getBook().getBookId() == bookId) {
				bookAuthors.add(a);
			}
		}
		return bookAuthors;
	}

}
