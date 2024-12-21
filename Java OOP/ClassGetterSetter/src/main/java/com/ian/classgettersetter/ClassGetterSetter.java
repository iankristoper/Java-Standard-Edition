

package com.ian.classgettersetter;

/**
 *
 * @author Ian Tagano
 */



//this is the class code
class Human
{
    //this is private attribute it cannot be accessed easily
    //the user cannot access these attributes
    private int salary;
    private String name;
    
    //this is the setter 
    //when you call this method anything you give to this amount
    //will be also the amount on the private attribute respectively
    //and to set setter method you need to declare it in public
    public void setter(int amount)
    {
        salary = amount;
    }
    
    
    //this is also the getter
    //the function of this part is for getting the value and give it to the user
    //when making getter method you need to declare it in public
    public int getter()
    {
        return salary;
    }
    
    
    //this is the normal method 
    //this is the checker for the private attribute enabling for unpredicted inputs
    void checker()
    {
        if(salary >= 100000)
        {
            System.out.println("This human is fucking rich");
        }
        else 
        {
            System.out.println("This human is normal");
        }
    }
    
    
}



public class ClassGetterSetter 
{
    public static void main(String[] args) 
    {
        //this is declaring an array man with a Human type
        //now the man instance is an array type
        //and it has 5 elements
        Human[] man = new Human[5];
        
        //now creating a human object and assign it to the 2 elements
        man[0] = new Human();   //used in below program
        man[1] = new Human();   //not used
        
        
        //this is the usage of the first element
        //putting value to the setter and check it using the checker method
        man[0].setter(100000);
        man[0].checker();
        
    }
}
