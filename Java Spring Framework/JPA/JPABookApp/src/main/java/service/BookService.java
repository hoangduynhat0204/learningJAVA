/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.BookEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BookRepository;

/**
 *
 * @author Hoang Duy Nhat
 */
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepo;
    
    public List<BookEntity> getAllBook(){
        List<BookEntity> bookList = (List<BookEntity>)bookRepo.findAll();
        return bookList;
    }
    
    public BookEntity addNewBook(BookEntity book){
        BookEntity newBook = bookRepo.save(book);
        return book;
    }
    
    public Optional<BookEntity> getBookById(int id){
        return bookRepo.findById(id);
    }
//    public BookEntity updateBook(){
//        return
//    }
}
