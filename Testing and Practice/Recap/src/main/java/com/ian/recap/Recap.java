
package com.ian.recap;





//regular class that can be instantiated to create objects 
class ConcreteClassSample {
    
    String normalVariable;
    
    public void normalMethod() {     
        System.out.println("This is an example of conrecte class ");
    }
    
}


//===================================================================================


//abstract class cannot be instantiated it can serve as a base class for other classes
//abstract methods - no body (need to override if you used an abstract method 
//concrete methods - yes body
abstract class AbstractClassSample {    
    
    abstract void abstractMethod();
    
    void display() {
        System.out.println("This  is normal method or concrete method ");
    }
    
}

//class that extends the abstract class
//the inside method has its own implementation of the abstract method 
class InheritAbsract extends AbstractClassSample {
    
    @Override
    void abstractMethod() { 
        System.out.println("This is own implementation of abstract method");
    }
    
}

class inheritAbstract2 extends AbstractClassSample {
    
    @Override
    void abstractMethod() {
        System.out.println("This is another implementation of abstract method");
    }
}


//===================================================================================


//interface class a blueprint for classes that contains abstract methods and static or defaults 
interface Animal {
    
    void animalSound();
    
    default void animalNature() {
        System.out.println("The nature of the animal is to breathe");
    }
}

interface Skills {
    
    void animalSkills();
    
    default void skillNature() {
        System.out.println("Skill is the best weapon for animals");
    }
}

class Dog implements Animal, Skills {
    
    public void animalSound() {
        System.out.println("Bark!");
    }
    
    public void skillNature() {
        System.out.println("Biting, Running, Sharp sense");
    }
    
}


//===================================================================================


//static inner class is same as inner class but it is a static it doesnt have access to the instance variable or methods of the outer class.
class Outer {
    
    static int number = 10;
    
    static class InnerStaticClass {
        
        public void innerMethod() {
            System.out.println("Can access only the static member or the outer class which is " + number);
        }
    }
}


//===================================================================================


//nested class is a type of group class that is tightly coupled together the inner class has access both static and instance member of the outer class 
class OuterClass {
    
    private String messages = "Hello this is from the outer class";
    
    class InnerClass {
        
        String text = "hhis is from the Inner class";
        
        void displayMessage() {
            System.out.println(messages);
        }
    }
} 


//===================================================================================


//local inner class is a class defined inside a method or a block, its scope is only limited to that scope only 
class OuterClass2 {
    
    void printMessage() {
        class LocalInnerClass {
            void innerMessage() {
                System.out.println("This is from local class");
            }
        }
        
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.innerMessage();
    }
}


//===================================================================================


//anonymous class a class with no name 
class OuterClass3 {
    
    void greet() {
        System.out.println("This is from inner class");
    }
}


//===================================================================================


public class Recap {

    public static void main(String[] args) {
        
        //for regular class 
        ConcreteClassSample concreteObject = new ConcreteClassSample();  
        concreteObject.normalMethod();
        
        
        //for static nested class 
        Outer.InnerStaticClass staticObject = new Outer.InnerStaticClass();
        staticObject.innerMethod();
        
        
        //for inner class 
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayMessage();
        
        
        //for local inner class 
        OuterClass2 outer2 = new OuterClass2();
        outer2.printMessage();
        
        
        //for anonymous class 
        OuterClass3 outer3 = new OuterClass3() {
            
            @Override 
            void greet() {
                System.out.println("This is from anonymous class ");
            }
        };
        
        outer3.greet();
        
    }
}
