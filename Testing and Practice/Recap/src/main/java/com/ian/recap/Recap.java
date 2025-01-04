
package com.ian.recap;





//regular class that can be instantiated to create objects 
class ConcreteClassSample {
    
    String normalVariable;
    
    public void normalMethod() {     
        System.out.println("This is an example of conrecte class ");
    }
    
}


//abstract class cannot be instantiated it can serve as a base class for other classes
//abstract methods - no body (need to override if you used an abstract method 
//concrete methods - yes body
abstract class AbstractClassSample {
    
    abstract void abstractMethod();
    
    void display() {
        System.out.println("This is normal method or concrete method ");
    }
    
}






public class Recap {

    public static void main(String[] args) {
        
        ConcreteClassSample concreteObject = new ConcreteClassSample();
        
        
    }
}
