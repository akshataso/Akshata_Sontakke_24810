package com.cybage.controller;

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

import com.cybage.model.Book;

import com.cybage.service.BookServiceImpl;

@Controller
public class BookController {

	@Autowired
	private BookServiceImpl bookService;

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
		model.addAttribute("book", new Book());
		return "addBook";
	}

	@PostMapping("/addBook")
	public ModelAndView addBook(@Valid @ModelAttribute("book") Book book, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return new ModelAndView("addBook", "book", book);
		}

		return new ModelAndView("dashboard", "bookList", bookService.addBook(book));
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

}
