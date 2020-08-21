package service;

import entity.BookDetailsEntity;
import entity.BookEntity;
import entity.CategoryEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BookDetailsRepository;
import repository.BookRepository;
import repository.CategoryRepository;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepo;
    @Autowired
    CategoryRepository categoryRepo;
    @Autowired
    BookDetailsRepository bookDetailsRepo;
    
    public List<BookEntity> getAllBook(){
        return (List<BookEntity>)bookRepo.findAll();
    }
    public CategoryEntity getCategoryByName(String name){
        return categoryRepo.findByName(name);
    }
    public BookEntity addNewBook(BookEntity book){
        BookDetailsEntity bookDetails = book.getBookDetails();
        book.setBookDetails(null);
        
        BookEntity newBook= bookRepo.save(book);
        
        //Save bookdetail
        bookDetails.setId(newBook.getId());
        bookDetailsRepo.save(bookDetails);
        
        return bookRepo.findById(newBook.getId());
    }
}
