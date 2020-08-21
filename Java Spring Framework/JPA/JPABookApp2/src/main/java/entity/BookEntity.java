package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    
    // setup relationship
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private CategoryEntity category;
    
    //Setup relationship with bookdetails
    @OneToOne()
    @PrimaryKeyJoinColumn
    private BookDetailsEntity bookDetails;

    public BookEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public BookDetailsEntity getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(BookDetailsEntity bookDetails) {
        this.bookDetails = bookDetails;
    }
    
    @Override
    public String toString(){
        return 
                "Book ID: " + id +"\n" +
                "Book Name: " + name +"\n" +
                "Author: " + author + "\n" +
                "Category Name: " + category.getName() +"\n" +
                "ISBN: " + bookDetails.getIsbn() + "\n"+
                "Number Of Page: " + bookDetails.getNumberOfPage() +"\n" +
                "Price: " + bookDetails.getPrice() +"\n" +
                "Published Date: " + bookDetails.getPublishedDate() +"\n";
    }
}
