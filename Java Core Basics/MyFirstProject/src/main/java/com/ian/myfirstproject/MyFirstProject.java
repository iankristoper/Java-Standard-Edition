package com.ian.myfirstproject;


//this is the class of this program
//it has a name of MyFirstProject
public class MyFirstProject 
{
    //this is the method of the class which has a void return type
    //it has "main" name
    //it has arguments of string of array with the name of args
    //inside the main is all the fun begins
    public static void main(String[] args) 
    {
        int beernumber = 99;
        String word = "Bottles";
        
        while(beernumber > 0)
        {
            if(beernumber == 1)
            {
                word = "bottle";
            }
            
            
            System.out.println(beernumber + " " + word + " of beer on the wall");
            System.out.println(beernumber + " " + word + " of beer");
            System.out.println("Take one down!");
            System.out.println("Pass it around");
            beernumber--;       
            
        }//ending for the while loop     
    } //ending for the main method 
} //ending for the class 
