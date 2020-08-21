/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productviewer;

import java.text.NumberFormat;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Product {
    private String code;
    private String description;
    private double price;
    
    public Product() {
        code="";
        description="";
        price=0.0;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code= code;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getFormattedPrice(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    public Product(String code, String description, double price){
        this.code = code;
        this.description = description;
        this.price = price;
    }
    public String toPrint() {
        String message = "Code: " + code + "\n" +
                         "Description: " + description + "\n" +
                         "Price" + getFormattedPrice() + "\n";
        return message;
    }

    @Override
    public String toString() {
        return description;
    }
    
}
