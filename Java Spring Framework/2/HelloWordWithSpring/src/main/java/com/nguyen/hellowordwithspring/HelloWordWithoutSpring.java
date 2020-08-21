/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nguyen.hellowordwithspring;

import com.nguyen.service.AccountService;
import com.nguyen.service.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author XV
 */
public class HelloWordWithoutSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("helloword.xml");
        HelloWord helloWord = context.getBean("helloword", HelloWord.class);
        System.out.println(helloWord.getName());

        AccountService accountService = context.getBean("accountService", AccountServiceImpl.class);
        System.out.println("Thong tin truoc khi chuyen khoan");
        System.out.println(accountService.getAccount(0));
        System.out.println(accountService.getAccount(1));

        System.out.println("Thuc hien chuyen 10 Dong tu Account 0 sang Account 1");
        accountService.transfer(0, 1, 10);

        System.out.println("Thong tin sau khi chuyen khoan");
        System.out.println(accountService.getAccount(0));
        System.out.println(accountService.getAccount(1));
    }

}
