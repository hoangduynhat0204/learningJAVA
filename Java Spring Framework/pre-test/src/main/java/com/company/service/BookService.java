/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service;

import com.company.entity.Book;
import com.company.repository.BookRepositoryIF;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hoang Duy Nhat
 */
@Service
public class BookService implements BookServiceIF{
    
    @Autowired
    BookRepositoryIF bookRepositoryIF; 

    @Override
    public List<Book> getBooks() {
        return (List)bookRepositoryIF.findAll();
    }

    @Override
    public void saveBook(Book theBook) {
        bookRepositoryIF.save(theBook);
    }

    @Override
    public Book getBook(int theId) {
        Optional<Book> bookOpt = bookRepositoryIF.findById(theId);
	return bookOpt.isPresent() ? bookOpt.get() : null;
    }

    @Override
    public void deleteBook(int theId) {
        bookRepositoryIF.deleteById(theId);
    }
    
}
