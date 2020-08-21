/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.controller;

import com.company.entity.Book;
import com.company.service.BookServiceIF;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Hoang Duy Nhat
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookServiceIF bookService;

    @GetMapping(value = "/list")
    public String listBooks(HttpServletRequest request, Model theModel) {
	List<Book> books = bookService.getBooks();
        PagedListHolder pagedListHolder = new PagedListHolder(books);
		int page = ServletRequestUtils.getIntParameter(request, "p", 0);
		pagedListHolder.setPage(page);
		pagedListHolder.setPageSize(5);
		theModel.addAttribute("pagedListHolder", pagedListHolder);
                
	return "index";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
	Book theBook = new Book();
	theModel.addAttribute("book", theBook);
	return "book-form";
    }

    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book theBook) {
	bookService.saveBook(theBook);
	return "redirect:/book/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("bookId") int theId,
	    Model theModel) {
	Book theBook = bookService.getBook(theId);
	theModel.addAttribute("book", theBook);
	return "book-form";
    }

    @GetMapping("/delete")
    public String deleteBook(@RequestParam("bookId") int theId) {
	bookService.deleteBook(theId);
	return "redirect:/book/list";
    }
}
