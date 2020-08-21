/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productviewer;

/**
 *
 * @author Hoang Duy Nhat
 */
public class ProductDB implements ProductReader{

    @Override
    public Product getProduct(String code) {
        Product product = new Product();

        product.setCode(code);
        if (code.equalsIgnoreCase("java")) {
            product.setDescription("Murach Java Programing");
            product.setPrice(57.5);
        } else if (code.equalsIgnoreCase("jsp")) {
            product.setDescription("Murach Java Servlet JSP");
            product.setPrice(57.5);
        } else if (code.equalsIgnoreCase("mysql")) {
            product.setDescription("Murach SQL");
            product.setPrice(54.4);
        } else {
            System.out.println("No product matches this product code.");
        }

        return product;
    }

    @Override
    public String getProducts() {
        return "This method hasn't been implemented yet.";
    }
}
