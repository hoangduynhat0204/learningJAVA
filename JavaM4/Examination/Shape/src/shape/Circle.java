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
public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    

    @Override
    public double getArea() {
        return this.getRadius()*this.getRadius()*3.14;
    }

    @Override
    public double getPerimeter() {
        return 2*this.getRadius()*3.14;
    }

    @Override
    public String toString() {
        String shapeInfor = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Radius:" + getRadius() + "\n");
        return sb.toString();
    }
    
    
}
