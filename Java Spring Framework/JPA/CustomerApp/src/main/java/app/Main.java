/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.CustomerEntity;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CustomerService;

/**
 *
 * @author Hoang Duy Nhat
 */
public class Main {

    static ClassPathXmlApplicationContext context
            = new ClassPathXmlApplicationContext("beans.xml");
    static CustomerService customerService = context.getBean("customerService", CustomerService.class);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            System.out.println("Select your action: ");
            System.out.println("1- List all the customers to console.");
            System.out.println("2- Find a customer by id.");
            System.out.println("3- Find customers by name.");
            System.out.println("4- Find customers by phone or email.");
            System.out.println("5- List all the customers who are men and years old from 20 to 30.");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    ListOfCustomer();
                    break;
                case 2:
                    System.out.println("Enter the id which you want to look for: ");
                    int id = sc.nextInt();
                    ListOfCustomerById(id);
                    break;
                case 3:
                    System.out.println("Enter the name which you want to look for: ");
                    String name = sc.next();
                    System.out.println();
                    ListOfCustomerByName(name);
                    break;
                case 4:
                    System.out.println("Enter the phone or email which you want to look for: ");
                    String searchText = sc.next();
                    System.out.println();
                    ListOfCustomerByPhoneOrEmail(searchText);
                    break;
                case 5:
                    System.out.println("List of customers who are men and years old from 20 to 30: ");
                    ListOfCustomerByBirthday(LocalDate.of(1990, 01, 01), LocalDate.of(2000, 01, 01));
                    break;
            }

            System.out.println("Continue? (Y/N)");
            choice = sc.next();
            System.out.println();
        }

        //ListOfCustomer();
        //ListOfCustomerById(2);
        //ListOfCustomerByName("en");
        //ListOfCustomerByPhoneOrEmail("@gmail.com");
        //ListOfCustomerByBirthday(LocalDate.of(1990, 01, 01), LocalDate.of(2000, 01, 01));
    }

    private static void ListOfCustomer() {

        List<CustomerEntity> customerList = customerService.getAllCustomer();
        for (CustomerEntity customer : customerList) {
            System.out.println(customer);
        }
    }

    private static void ListOfCustomerById(int id) {
        List<CustomerEntity> customerList = customerService.findById(id);
        for (CustomerEntity customer : customerList) {
            System.out.println(customer);
        }
    }

    private static void ListOfCustomerByName(String name) {
        List<CustomerEntity> customerList = customerService.findByNameLike(name);
        for (CustomerEntity customer : customerList) {
            System.out.println(customer);
        }
    }

    private static void ListOfCustomerByPhoneOrEmail(String searchText) {
        List<CustomerEntity> customerList = customerService.findByPhoneLikeOrEmailLike(searchText, searchText);
        for (CustomerEntity customer : customerList) {
            System.out.println(customer);
        }
    }

    private static void ListOfCustomerByBirthday(LocalDate birthday1, LocalDate birthday2) {
        List<CustomerEntity> customerList = customerService.findByBirthdayBetween(birthday1, birthday2);
        for (CustomerEntity customer : customerList) {
            System.out.println(customer);
        }
    }
}
