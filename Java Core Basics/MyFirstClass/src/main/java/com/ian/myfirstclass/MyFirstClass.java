/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ian.myfirstclass;

/**
 *
 * @author Ian Tagano
 */

class Dog
{
    //this is attributes of the class dog
    //others call this instance variables 
    //but this is an attributes, though they are the same 
    int age;
    String name;
    String breed;
    
    
    //this is methods or in procedural programming this is function
    //it has a return type of void so no return is needed
    void bark()
    {
        System.out.println("arf! arf!");
    }
}


public class MyFirstClass {

    public static void main(String[] args) 
    {
        //this is how you create an object 
        //Dog is the class and d is the object
        //dont forget this when you create new object 
        //object is also called instances
        Dog this_is_test_object1 = new Dog();
        Dog this_is_test_object2 = new Dog();
        
        this_is_test_object1.age = 12;
        this_is_test_object1.breed = "Chow chow";
        this_is_test_object1.name = "browny";
        this_is_test_object1.bark();
        
        this_is_test_object2.age = 23;
        this_is_test_object2.breed = "Askal";
        this_is_test_object2.name = "Pochii";
        
        
        System.out.println(this_is_test_object1.age);
        
        
        
        //this is an example of array
        //using the class as type then pets as the object
        //creating an array of class
        Dog[] pets = new Dog[2];
        
        
        //this is declaring one of the array 
        //and telling the heap to allocate some memory 
        //the allocated memory with the size of class dog
        //will be allocated to the pets[0]
        pets[0] = new Dog();
        pets[0].age = 13;
        
        System.out.println(pets[0].age);
    }
}
