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

        int[] durations = new int[numberOfTimers];

        
        // Collect all durations first
        for (int i = 0; i < numberOfTimers; i++) {
            System.out.print("Enter duration of timer " + (i + 1) + " in seconds: ");
            durations[i] = scanner.nextInt();
            scanner.nextLine();
        }

        
        // Create and start threads for all timers
        Thread[] threads = new Thread[numberOfTimers];
        for (int i = 0; i < numberOfTimers; i++) {
            int timerNumber = i + 1;
            int duration = durations[i];
            threads[i] = new Thread(() -> runTimer(timerNumber, duration));
            threads[i].start();
        }

        
        // Wait for all timers to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("A thread was interrupted.");
            }
        }

        System.out.println("All timers have completed!");
        scanner.close();
    }
    

    // Run timer method
    public static void runTimer(int timerNumber, int duration) {
        System.out.println("Timer " + timerNumber + " started with " + duration + " seconds.");

        for (int i = duration; i >= 0; i--) {
            System.out.println("Timer " + timerNumber + ": " + i + " seconds remaining");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Timer " + timerNumber + " was interrupted.");
                Thread.currentThread().interrupt();
                break;
            }
        }

        System.out.println("Timer " + timerNumber + " has finished!");
    }
}
