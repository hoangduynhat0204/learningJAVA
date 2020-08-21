/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.service;

import com.company.entity.Book;
import java.util.List;

/**
 *
 * @author Hoang Duy Nhat
 */
public interface BookServiceIF {
    public List <Book> getBooks();
    public void saveBook(Book theBook);
    public Book getBook(int theId);
    public void deleteBook(int theId);
}
