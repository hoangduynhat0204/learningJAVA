/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Book extends Product{
    private String author;
    Book() {
        super();
        author="";
        count++;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Author:   " + author + "\n";
    }
    
}
