
package app;

import entity.BookDetailsEntity;
import entity.BookEntity;
import entity.CategoryEntity;
import java.time.LocalDate;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;

public class Main {
    private static ClassPathXmlApplicationContext context=
            new ClassPathXmlApplicationContext("beans.xml");
    private static BookService bookService = 
            context.getBean("bookService", BookService.class);
    public static void main(String[] args){
//        listAllBook();
//        addNewBook();
    }
    private static void addNewBook(){
        System.out.println("Add New Book");
        BookEntity book= new BookEntity();
        book.setName("MySQL");
        book.setAuthor("iViettech");
        //Get category entity
        CategoryEntity category = bookService.getCategoryByName("Database");
        book.setCategory(category);
        
        //Enter boook Details
        BookDetailsEntity bookDetails = new BookDetailsEntity();
        bookDetails.setIsbn("1700-1-1");
        bookDetails.setNumberOfPage(600);
        bookDetails.setPrice(52.5);
        bookDetails.setPublishedDate(LocalDate.of(2018, 01, 01));
        book.setBookDetails(bookDetails);
        
        //Save book to database
        BookEntity newBook= bookService.addNewBook(book);
    
        if(newBook!=null){
            System.out.println(newBook);
        }
    }
    private static void listAllBook(){
        System.out.println("List all book");
        List<BookEntity> bookList = bookService.getAllBook();
        
        for(BookEntity book: bookList){
            String message =
                    "Book ID: " + book.getId() +"\n" +
                    "Book Name: " + book.getName() +"\n" +
                    "Author: " + book.getAuthor() + "\n" +
                    "Category Name: " + book.getCategory().getName() +"\n" +
                    "ISBN: " + book.getBookDetails().getIsbn() + "\n"+
                    "Number Of Page: " + book.getBookDetails().getNumberOfPage() +"\n" +
                    "Price: " + book.getBookDetails().getPrice() +"\n" +
                    "Published Date: " + book.getBookDetails().getPublishedDate() +"\n";
            
            System.out.println(message);
        }
        
    }
}
