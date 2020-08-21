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
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return (this.getLength() + this.getWidth())*2;
    }

    @Override
    public String toString() {
        String shapeInfor = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Width:" + getWidth()+ "\n");
        sb.append("Length:" + getLength()+ "\n");
        return sb.toString();
    }
    
    
}
