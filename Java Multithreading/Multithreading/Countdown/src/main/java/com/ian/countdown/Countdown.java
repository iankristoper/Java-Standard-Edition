package com.ian.countdown;
 



/*
    Create a program with multiple threads, each displaying a countdown timer.
*/



import java.util.Scanner;



public class Countdown {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of timers: ");
        int numberOfTimers = scanner.nextInt();
        scanner.nextLine();
        
        Thread[] threads = new Thread[numberOfTimers];
        
        
        //loop for creating threads 
        for(int i = 0; i < numberOfTimers; i++) {    
            
            System.out.print("Enter duration of timer " + (i + 1) + " in seconds: ");
            int duration = scanner.nextInt();
            scanner.nextLine();;sdd
            
            int timerNumber = i + 1; 
            
            
            //create new thread for each timer 
            threads[i] = new Thread(() -> runTimer(timerNumber, duration));
            threads[i].start();           
        }
        
        
        //wait for all timers to finish
        for(Thread copy : threads) {          
            try {
                copy.join();
            } catch(InterruptedException e) {
                System.out.println("A thread was interrupted.");
            }           
        }
        
        
        System.out.println("All timers have completed!");
        scanner.close();
        
    }
    
    
    //runtimer method
    public static void runTimer(int timerNumber, int duration) {
        
        System.out.println("Timer " + timerNumber + " started with " + duration + " seconds.");
        
        for(int i = duration; i >= 0; i--) {
            
            System.out.println("Timer " + timerNumber + ": " + i + " seconds remaining");
            
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Timer " + timerNumber + " was interrupted.");
                Thread.currentThread().interrupt();
                break;              
            }
        }
        
        System.out.println("Timer " + timerNumber + " has finished!");
        
    }
}
