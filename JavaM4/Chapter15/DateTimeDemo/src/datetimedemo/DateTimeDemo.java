/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author Hoang Duy Nhat
 */
public class DateTimeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Code that use now() method
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDate);
        System.out.println(currentTime);
        System.out.println(currentDateTime);
        
        LocalDate halloween1 = LocalDate.of(2020, Month.MAY, 15);
        System.out.println(halloween1);
        
        LocalDate halloween2 = LocalDate.of(2015,10,31);
        System.out.println(halloween2);
        
        LocalTime startTime = LocalTime.of(22,02);
        System.out.println(startTime);
        
        LocalDateTime startDateTime = LocalDateTime.of(2015,10,31,14,32);
        System.out.println(startDateTime);
        
        LocalDate halloween3 = LocalDate.parse("2015-10-31");
        LocalTime startTime4 = LocalTime.parse("02:32:45");
        System.out.println(startTime4);
        
        int year = currentDate.getYear();
        System.out.println(year);
        
        if(currentDate.compareTo(halloween3) > 0){
            System.out.println("halloween :))))");
        }
    }

}
