

package com.ian.classmethodsreturntype;

/**
 *
 * @author Ian Tagano
 */



//header for handling the inputs
import java.util.Scanner;


//this is the class 
//inside the class has 2 methods with 2 paramaters
//you can put many parameter as you want in your methods
class Calculator
{
    int addition(int data1, int data2)
    {
        return data1 + data2;
    }
    
    int subtraction(int data1, int data2)
    {
        return data1 - data2;
    }
    
    //and so on...
}

public class ClassMethodsReturnType {

    public static void main(String[] args) 
    {
        //declare new object for input
        Scanner input = new Scanner(System.in);
        
        //configure the input for the user
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter another number: ");
        int number2 = input.nextInt();
        
        
        //below where the class is being used
        
        
        //creating instances and declaring new objects
        Calculator add = new Calculator();
        Calculator minus = new Calculator();
        
        
        //i used the new created instances the add and minus
        //they can now access whats inside the class 
        //so i access the addition and subtraction then i used the 
        //number1 and number2 which holds data that came from the user
        //but the add and minus method will return some result
        //so i store it directly to result1 and result2
        //i only use 1 line of code for optimization
        int result1 = add.addition(number1, number2);
        int result2 = minus.subtraction(number1, number2);
        
        
        //then print the result
        System.out.println("Sum: " + result1);
        System.out.println("Difference: " + result2);
    }
}
