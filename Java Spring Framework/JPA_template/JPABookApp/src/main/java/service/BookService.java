package service;

import entity.BookEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepo;
    
    public List<BookEntity> getAllBook(){
        List<BookEntity> bookList =(List<BookEntity>)bookRepo.findAll();
        return bookList;
    }
    public BookEntity addNewBook(BookEntity book){
        BookEntity newBook = bookRepo.save(book);
        return book;
    }
    
    public List<BookEntity> findByPriceBetween(double price1, double price2){
        return bookRepo.findByPriceBetween(price1, price2);
    }
    
    public List<BookEntity> findByAuthorLike(String author){
        author = "%" + author + "%";
        return bookRepo.findByAuthorLike(author);
    }
    
    public List<BookEntity> findByAuthorLikeAndPrice(String author, double price){
        author = "%" + author + "%";
        return bookRepo.findByAuthorLikeAndPrice(author, price);
    }
    
    public List<BookEntity> findByNameLikeOrAuthorLikeOrCategoryLike(String name, String author, String category){
        name = "%" + name + "%";
        author = "%" + author + "%";
        category = "%" + category + "%";
        return bookRepo.findByNameLikeOrAuthorLikeOrCategoryLike(name, author, category);
    }
}
