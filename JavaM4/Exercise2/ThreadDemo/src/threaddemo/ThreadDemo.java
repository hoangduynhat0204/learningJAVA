/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

import java.util.logging.Logger;

/**
 *
 * @author Hoang Duy Nhat
 */
public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CounterEvenNumber c1 = new CounterEvenNumber("Even Number");
        c1.start();

        CounterOddNumber c2 = new CounterOddNumber("Odd Number");
        c2.start();
    }

}

class CounterEvenNumber extends Thread {
    
    String threadName;
    
    public CounterEvenNumber(String threadName){
        this.setName(threadName);
    }

    @Override
    public void run() {
        runCounter(this.getName());
    }

    public void runCounter(String name) {
        for (int i = 0; i <= 20; i++) {
            /*if (i % 2 == 0) {
                System.out.println(name + " : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CounterEvenNumber.class.getName());
                }
            }*/
            if(threadName.equalsIgnoreCase("Even Number")){
                
            }
        }

    }
}

/*class CounterOddNumber extends Thread {
    
    String threadName;
    
    public CounterOddNumber(String threadName){
        this.setName(threadName);
    }
    
    @Override
    public void run() {
        runCounter(this.getName());
    }

    public void runCounter(String name) {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(name + " : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CounterOddNumber.class.getName());
                }
            }
        }

    }
}*/