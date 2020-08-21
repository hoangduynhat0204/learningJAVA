/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Scanner;

/**
 *
 * @author Hoang Duy Nhat
 */
public class ShapeApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Shape Application: ");
        Scanner scanner = new Scanner(System.in);

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Select your action: ");
            System.out.println("1- : Input a circle and calculate the area and perimeter.");
            System.out.println("2- : Input a circle and calculate the area and perimeter.");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    Circle circle = new Circle();
                    System.out.println("Input Circle Color: ");
                    circle.setColor(scanner.nextLine());
                    System.out.println("Circle is filled?  ");
                    circle.setFilled(Boolean.parseBoolean(scanner.nextLine()));
                    System.out.println("Input Circle radius: ");
                    circle.setRadius(Double.parseDouble(scanner.nextLine()));
                    System.out.println("The Area of the circle is: " + circle.getArea());
                    System.out.println("The Perimeter of the circle is: " + circle.getPerimeter());
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle();
                    System.out.println("Input Rectangle Color: ");
                    rectangle.setColor(scanner.nextLine());
                    System.out.println("Rectangle is filled?  ");
                    rectangle.setFilled(Boolean.parseBoolean(scanner.nextLine()));
                    System.out.println("Input Rectangle length: ");
                    rectangle.setLength(Double.parseDouble(scanner.nextLine()));
                    System.out.println("Input Rectangle width: ");
                    rectangle.setWidth(Double.parseDouble(scanner.nextLine()));
                    System.out.println("The Area of the Rectangle is: " + rectangle.getArea());
                    System.out.println("The Perimeter of the Rectangle is: " + rectangle.getPerimeter());
                    break;

                default:
                    System.out.println("Invalid operation");
                    break;
            }
            System.out.println("Continue? (Y/N)");
            choice = scanner.next();
            System.out.println();

        }

    }
}
