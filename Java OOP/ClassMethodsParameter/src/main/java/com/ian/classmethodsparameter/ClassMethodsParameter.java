
package com.ian.classmethodsparameter;

/**
 *
 * @author Ian Tagano
 */


//this is the class
class Name
{  
    //attributes
    int age;
    String name;
     
    //method with parameter
    void name_check(int data)
    {
        if(data < 18)
        {
            System.out.println("Employee is underage");
        }
        else
        {
            System.out.println("Employee is acceptable");
        }
    }
}




public class ClassMethodsParameter 
{
    public static void main(String[] args) 
    {
        //creating 2 instance
        Name Ian = new Name();
        Name Rhina = new Name();
        
        //instance 1 details
        Ian.age = 18;
        Ian.name = "Ian";
        Ian.name_check(Ian.age);
        
        //instance 2 details
        Rhina.age = 12;
        Rhina.name = "Rhina";
        Rhina.name_check(Rhina.age);
    }
}
