
package com.ian.classmethods;

/**
 *
 * @author Ian Tagano
 */


class Dog 
{
    int age;
    String name;
    
    
    void bark()
    {
        if(age > 10)
        {
            System.out.println("arf arf");
        }
        else 
        {
            System.out.println("yip yip");
        }
    }
}



public class ClassMethods {

    public static void main(String[] args) 
    {
        
        Dog jaguar = new Dog();
        Dog browny = new Dog();
        
        jaguar.age = 20;
        jaguar.name = "Jaguar";
        jaguar.bark();
        
        browny.age = 3;
        browny.name = "Browny";
        browny.bark();
    }
}
