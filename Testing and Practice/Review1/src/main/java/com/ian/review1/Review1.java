package com.ian.review1;

import java.util.Scanner;



class Calculator
{
    //methods for addition
    public static int add(int a, int b)
    {
        return a + b;
    }
    
    //methods for subtraction
    public static int subtract(int a, int b)
    {
        return a - b;
    }
    
    //methods for division
    public static double divide(double a, double b)
    {
        if(b == 0)
        {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        
        return a / b;
    }
    
    //methods for multiplication
    public static int multiply(int a, int b)
    {
        return a * b;
    }
            
}





public class Review1 
{
        private static int getValidInteger(Scanner scanner)
        {
            while(!scanner.hasNextInt())
            {
                System.out.println("Invalid input, please input an integer");
                scanner.next();
            }
            
            return scanner.nextInt();
        }
        
        
        private static char getValidOperator(Scanner scanner)
        {
            String input = scanner.next();
            while (input.length() != 1 || "+-*/".indexOf(input.charAt(0)) == -1) 
            {
                System.out.print("Invalid operator. Please enter one of +, -, *, /: ");
                input = scanner.next();
            }
             
            return input.charAt(0);
             
        }
        
        private static double performOperation(int num1, int num2, char operator)
        {
            switch(operator)
            {
                case '+':
                    return Calculator.add(num1, num2);
                    
                case '-':
                    return Calculator.subtract(num1, num2);
                    
                case '*':
                    return Calculator.multiply(num1, num2);
                    
                case '/':
                    return Calculator.divide(num1, num2);
                    
                default: 
                    throw new IllegalArgumentException("Unexpected Operator: " + operator);                                           
                    
            }
        }
    
    
    
    //THIS IS THE MAIN FUNCTION 
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Welcome to my simple calculator!");
        
        
        
        boolean continueCalculation = true;
        
        while(continueCalculation)
        {
            System.out.print("Enter first number: ");
            int num1 = getValidInteger(scanner);
            
            
            System.out.print("Enter an operator ( + - / * )");
            char operator = getValidOperator(scanner);
            
            
            System.out.print("Enter second number: ");
            int num2 = getValidInteger(scanner);
            
            
            
            try 
            {
                double result = performOperation(num1, num2, operator);
                System.out.println("The result is:  " + result);
            }
            catch (ArithmeticException e) 
            {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            continueCalculation = scanner.next().equalsIgnoreCase("yes");
        }
        
        System.out.println("Calculator is closing. Goodbye!");
        scanner.close();
        
    }
}
