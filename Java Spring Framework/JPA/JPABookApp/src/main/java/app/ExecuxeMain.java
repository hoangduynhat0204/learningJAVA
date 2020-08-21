/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.BookEntity;
import java.time.LocalDate;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

/**
 *
 * @author Hoang Duy Nhat
 */
public class ExecuxeMain {

     static ClassPathXmlApplicationContext context
            = new ClassPathXmlApplicationContext("beans.xml");
     static BookService bookService = context.getBean("bookService", BookService.class);

    public static void main(String[] args) {
        
        addNewBook();
    }
    
    private static void ListOfBook(){
        
        List<BookEntity> bookList = bookService.getAllBook();
        for(BookEntity book:bookList){
            System.out.println(book);
        } 
    } 
    private static void addNewBook(){
        System.out.println("Add New Book Function");
        BookEntity book = new BookEntity();
        book.setName("Servlet");
        book.setAuthor("Joe Murach");
        book.setCategory("Programming");
        book.setIsbn("1111111");
        book.setNumberOfPage(400);
        book.setPrice(49);
        book.setPublishedDate(LocalDate.of(2000, 10, 10));
        
        BookEntity newBook = bookService.addNewBook(book);
        
        if(newBook != null){
            System.out.println(newBook);
        } else{
            System.out.println("Insert Failed");
        }
    }
    
//    private static void editBook(){
//        int id = 2;
//        
//        BookEntity book = bookService.updateBook();
//    }
}
