package app;

import entity.BookEntity;
import java.time.LocalDate;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

public class Main {
    static ClassPathXmlApplicationContext context
            = new ClassPathXmlApplicationContext("beans.xml");
     static BookService bookService = context.getBean("bookService", BookService.class);

    public static void main(String[] args) {
        
        ListBookByPriceBetween(40, 50);
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
    
    private static void ListBookByAuthorLike(String author){
        List<BookEntity> ListBook = bookService.findByAuthorLike(author);
        for(BookEntity book:ListBook){
            System.out.println(book);
        } 
    }
    
    private static void ListBookByPriceBetween(double price1, double price2){
        List<BookEntity> ListBook = bookService.findByPriceBetween(price1, price2);
        for(BookEntity book:ListBook){
            System.out.println(book);
        } 
    }
    
    private static void ListBookByNameLikeOrAuthorLikeOrCategoryLike(String searchText){
        List<BookEntity> ListBook = bookService.findByNameLikeOrAuthorLikeOrCategoryLike(searchText, searchText, searchText);
        for(BookEntity book:ListBook){
            System.out.println(book);
        } 
    }
}
