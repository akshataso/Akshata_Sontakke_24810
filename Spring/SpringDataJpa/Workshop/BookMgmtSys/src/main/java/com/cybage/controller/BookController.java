package com.cybage.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.dto.BookAuthorDto;
import com.cybage.model.Author;
import com.cybage.model.Book;
import com.cybage.service.AuthorServiceImpl;
import com.cybage.service.BookServiceImpl;

@Controller
public class BookController {

	@Autowired
	private BookServiceImpl bookService;
	@Autowired
	private AuthorServiceImpl authorService;

	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String authenticate(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password) {
		if (bookService.authenticate(username, password)) {
			return "dashboard";
		} else {

			return "login";
		}
	}

	@GetMapping("/add")
	public String getForm(Model model) {
		model.addAttribute("bookAuthorDto", new BookAuthorDto());
		return "addBook";
	}

	@PostMapping("/addBook")
	public ModelAndView addBook( @ModelAttribute("bookAuthorDto") BookAuthorDto bookAuthorDto) {

		Book book = new Book(bookAuthorDto.getBookId(), bookAuthorDto.getTitle(), bookAuthorDto.getPublisher());
		Author author = new Author(bookAuthorDto.getEmail(), bookAuthorDto.getName(), bookAuthorDto.getMobile(),book);
		bookService.addBook(book);
		authorService.addAuthor(author);
		
		return new ModelAndView("dashboard", "bookList", bookService.getBooks());
	}

	@GetMapping("/delete/{id}")
	public ModelAndView deleteEmployee(@PathVariable int id) {

		return new ModelAndView("dashboard", "bookList", bookService.deleteBook(id));
	}

	@GetMapping("/edit/{id}")
	public String editEmployee(@PathVariable int id, Model model) {
		Book book = bookService.getBookById(id);
		model.addAttribute("book", book);
		return "updateBook";
	}

	@PostMapping("/edit")
	public ModelAndView editEmployee(@Valid @ModelAttribute("book") Book book, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("updateBook", "book", book);
		}
		return new ModelAndView("dashboard", "bookList", bookService.editBook(book));
	}

	@PostMapping("/filter")
	public ModelAndView filterBooks(@RequestParam(name = "search") String search,
			@RequestParam(name = "books") String type) {
		System.out.println("in filter method");
		if (type.equals("title")) {
			return new ModelAndView("dashboard", "bookList", bookService.getBookByTitle(search));
		} else {
			return new ModelAndView("dashboard", "bookList", bookService.getBookByPublisher(search));
		}

	}
	
	@GetMapping("/authors/{id}")
	public ModelAndView getAuthors(@PathVariable int id) {

		return new ModelAndView("authors", "authorList", authorService.getAuthorsByBook(id));
	}


}
