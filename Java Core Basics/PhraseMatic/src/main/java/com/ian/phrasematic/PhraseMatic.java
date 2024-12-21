/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ian.phrasematic;

/**
 *
 * @author Ian Tagano
 */
public class PhraseMatic 
{
    public static void main(String[] args) 
    {
       //this is 3 sets of array strings
       //an array of strings
       String[] first_list = {"Hey", "Love", "shut", "Nahhh"};
       String[] second_list = {"Kiss", "Hug", "Fly"};
       String[] third_list = {"Bear", "Dog", "Cat"};
       
       
       //this is to determine how much words are in the list
       //using the length you can determine the number of words in the string array
       int first_length = first_list.length;
       int second_length = second_list.length;
       int third_length = third_list.length;
       
       
       //this is to generate 3 random numbers
       int rand1 = (int) (Math.random() * first_length);
       int rand2 = (int) (Math.random() * second_length);
       int rand3 = (int) (Math.random() * third_length);
       
       
       //now this is to build a phrase
       String phrase = first_list[rand1] + " " + second_list[rand2] + " " + third_list[rand3];
       
       
       //now to print the phrase 
       System.out.println("What we need is a " + phrase);
       
    }
}
