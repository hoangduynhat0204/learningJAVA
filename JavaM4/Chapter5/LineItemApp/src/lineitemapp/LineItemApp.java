package lineitemapp;

import business.LineItem;
import business.Product;
import data.ProductDB;

public class LineItemApp {

    public static void main(String[] args) {
        //create a line item - buy  5 java books
        Product p = ProductDB.getProduct("java");
        LineItem lineItem = new LineItem(p, 8);
        
        //print Line Item
        String message = "LINE ITEM DETAILS" + "\n" +
                "Product Code: " + lineItem.getProduct().getCode() + "\n" +
                "Produc Description: " + lineItem.getProduct().getDescription() + "\n" +
                "Price: " + lineItem.getProduct().getPrice() + "\n" +
                "Total:" + lineItem.getTotalFormatted();
        System.out.println(message);
    }
    
}
