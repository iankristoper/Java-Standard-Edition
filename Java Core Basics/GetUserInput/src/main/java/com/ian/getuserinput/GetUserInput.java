/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ian.getuserinput;




//THE PROGRAM STARTS HERE 



//this is importing the java package this is from the java standard libary
//it is part of the java SE API
//then Scanner is one of the classes of the java util package
//scanner is for reading input from the user 
import java.util.Scanner;


//a class with a GetUserInput 
public class GetUserInput 
{
    //this is the main method where everything is operating
    public static void main(String[] args) 
    {
        //creating a scanner object 
        //this will read the input from the keyboard
        //this object now can access whats inside the scanner class
        Scanner input_reader = new Scanner(System.in);
        
        
        //the input_reader is stored in string in order for each
        //type of the user it will be stored 
        System.out.print("Enter some words: ");
        String words = input_reader.nextLine();
        
        
        //this is also the same as the above code 
        System.out.print("Enter some numbers: ");
        int numbers = input_reader.nextInt();
       
        
        //printing out the data
        System.out.println("You entered: " + words);
        System.out.println("You entered: " + numbers);
        
        
        //this will release all the resource that the scanner object used 
        //the scanner object will no longer available beyond this line
        input_reader.close();
        
        
        //this line of code will make an error because the compiler dont know
        //what is the input reader is
        System.out.println("ENTER FUCKING WORDS: ");
        int copy = input_reader.nextInt();
        
        System.out.println(copy);
        
    }
}
