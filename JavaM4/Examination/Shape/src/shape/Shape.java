/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Hoang Duy Nhat
 */
public abstract class Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private String color;
    private boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    abstract public double getArea();
    
    abstract public double getPerimeter();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Color:" + getColor() + "\n");
        sb.append("Filled:" + isFilled() + "\n");
        return sb.toString();
    }
    
    
    
}
