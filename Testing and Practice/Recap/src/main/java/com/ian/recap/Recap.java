package com.ian.recap;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;





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
    
    
    
    default void skillNature() {
        System.out.println("Skill is the best weapon for animals");
    }
}

class Dog implements Animal, Skills {
    
    @Override
    public void animalSound() {
        System.out.println("Bark!");
    }
    
    @Override
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


//singleton class, allow only one intance to be created 
class Singleton {
    
    private static Singleton instance;
    
    private Singleton() {}; //private constructor 
    
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        
        return instance;
    }
}


//===================================================================================


//utility class a class that only contains static methods and fields
class SolveUtils {
    
    public static int add(int a, int b) {
        return a + b;
    }
}


//===================================================================================


//enum class is a class that represents a fixed set of constants 
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}


//===================================================================================


class Parent {
    
    void display() {
        System.out.println("This is method from the parent class");
    }
}

class Child1 extends Parent {
    
    void show() {
        System.out.println("This is from the child class");
    }
}
 

//===================================================================================


//multilevel inheritance a class tha inherits from a class that already inherits from another class 
class Food {
    
    void food() {
        System.out.println("This is from the parent class");
    }
}

class Meat extends Food {
    
    void pork() {
        System.out.println("This is from the meat class");
    }
}

class Viand extends Meat {
    
    void humba() {
        System.out.println("This is from the viand class");
    }
}


//===================================================================================


//hierarchical inheritance multiple classes inherent from a single parent class
class Mammal {
    
    void mommy() {
        System.out.println("This is a mammal");
    }
}

class Cat extends Mammal {
    
    void meow() {
        System.out.println("Meow");
    }
}

class Pig extends Mammal {
    
    void oink() {
        System.out.println("Oink");
    }
}


//===================================================================================


//multiple inheritance is a class that inherit different interfaces 
interface Power {
    
    void rasengan();
    void kagibunshin();
}

interface Attitude {
    
    void introvert();
    void extrovert();
    void ambivert();
}

class Character implements Power, Attitude {
    
    @Override
    public void rasengan() {
        System.out.println("Level 5");
    }
    
    @Override
    public void introvert() {
        System.out.println("Anti social");
    }
    
    @Override
    public void kagibunshin() {
        System.out.println("None");
    }
    
    @Override 
    public void extrovert() {
        System.out.println("None");
    }
    
    @Override
    public void ambivert() {
        System.out.println("None");
    }
}


//===================================================================================


//polymorphism with interface is a class implementing multiple interfaces 
interface Sound {
    
    void sound();
}

class Lion implements Sound {
    
    @Override
    public void sound() {
        System.out.println("Roarrrrr");
    }
}

class Bird implements Sound {
    
    @Override
    public void sound() {
        System.out.println("Tweet tweettttt");
    }
}



//===================================================================================


//try and catch - exception handling 
//try block - this is where you put a code that you feel will give an error
//catch block - catch the error and get whats the reason of the error
//finally block - will always be executed no matter what
//throw keyword - used to explicitly throw an exception 
class ErrorHandling {
    
    void handlingError() {
        
        try {
            int sampleError = 10/0;
            System.out.println(sampleError);
        }
        
        catch (ArithmeticException error) {
            System.out.println("There is an error " + error.getMessage());
        }
        
        finally {
            System.out.println("This block is always getting executed");
        }      
    }
    
    static void throwingError(int age) {
        
        if(age < 18) {
            throw new IllegalArgumentException("Age must be above 18");
        } 
        
        else {
            System.out.println("Legal Age, Accepted!");
        }
    }
}


//===================================================================================


//generics allows you to write flexible and type safety code 
//<T>, <E>, <K, V>
//T - common as general type 
//generic class with type parameter T
class Box<T> {
    
    private T value;
    
    public void set(T value) {
        this.value = value;
    }
    
    public T get() {
        return value;
    }
    
    //generic method it works in any type
    public static <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.println(element);
        }
    }
    
}


//===================================================================================


//bounded type parameters you can restrict the types that can be used in generics 
//extends - allow only a specific type or its subclasses 
//super - 
class Calculator<T extends Number> {  //accepts only Number or its subclasses (Integer, Double, etc)
    
    public double add(T number1, T number2) {
        return number1.doubleValue() + number2.doubleValue();
    }
}


//===================================================================================


//multithreading a technique where multiple threads run independently within the same process 
//improves efficiency by running multiple operations at the same time 
//Key Idea: Multiple threads execute simultaneously, often on different CPU cores.
//Example in Real Life: A restaurant where one chef is cooking, another is preparing ingredients, and a waiter is serving food—all happening at the same time.


//concurrency will handle multiple tasks, ensuring they execute correctly and efficiently.
//Goal: Manages shared resources between multiple threads safely to avoid issues like race conditions.
//Key Idea: Not necessarily executing at the same time, but managing multiple tasks properly.
//Example in Real Life: Two people editing the same document. The system ensures no one overwrites the other's changes.

class Task1 extends Thread {
    
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Task 1: " + i);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Task2 extends Thread {
    
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Task 2: " + i);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


//===================================================================================


//java io - manage the reading and writing of different data 

//writing to a file (basic)
class WriteExample {
    
    public void writerMethod() {
        
        try {
            
            FileWriter writer = new FileWriter("writer.txt");
            
            writer.write("Hello this is from the java.io");  //write data on the created file
            writer.close();  //close the file   
            
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    } 
    
    //✔ Creates a file if it doesn’t exist
    //✔ Writes "Hello, Java I/O!" into example.txt
}

//reading from a file (basic)
class ReaderExample {
    
    public void readerMethod() {
        
        try {
            
            FileReader reader = new FileReader("example.txt");
            
            int character;
            
            while((character = reader.read()) != -1) { //read until the end of the file
                System.out.print((char) character);                
            }
            
            reader.close();   
            
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
    
    //✔ Reads content of example.txt and prints it
    //✔ Uses .read() to read characters one by one
}

//using bufferreader for effiecient reading 
class BufferReader {
    
    public void bufferReader() {
        
        try {
            
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            
            while((line = reader.readLine()) != null) {  //read each line 
                System.out.println(line);
            }
            
            reader.close();  
            
        } catch(IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}

//using bufferedwriter 
class BufferWriter {
    
    public void bufferWriter() {
        
        try {
            
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt",true)); //append mode 
            
            writer.writer("This is an appended line");
            writer.newline(); //add a new line 
            writer.close();
            
            System.out.println("Data appended successfully");
            
        } catch(IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
    
    //✔ Writes multiple lines efficiently
    //✔ Uses .newLine() to add a new line
    //✔ true in FileWriter("example.txt", true) means it will append instead of overwrite
}

//using the file class
class FileExample {
    
    public void fileIO() {
        
        File file = new File("example.txt");
        
        if(file.exists()) {
            System.out.println("File existing in the directory");
        } else {
            System.out.println("File does not exist");
        }
    }
    
    public void fileCreate() {
        
        try {
            
            File file = new File("example.txt");
            
            if(file.createNewFile()) {
                System.out.println("File is created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
            
        } catch(IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}

    

















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
        
        
        //for class inheritance 
        Child1 child = new Child1();
        child.display();  //inheret from the parent class 
        child.show();   //from the child class 
        
        
        //for polymorphism with interface
        Sound animalSound;
        
        animalSound = new Lion();
        animalSound.sound();
        
        animalSound = new Bird();
        animalSound.sound();  
        
        
        //for generics 
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello can I request for a 100000000000000 amount of money");
        System.out.println(stringBox.get());
        
        Box<Integer> intBox = new Box<>();
        intBox.set(1000000000);
        System.out.println(intBox.get());
        
        //using the generic method 
        String[] names = {"Ian", "Rhina"};
        Integer[] numbers = {1, 2, 3};
        
        showArray(names);
        showArray(numbers);
        
        Calculator<Integer> calcuInt = new Calculator<>();
        calcuInt.add(10, 12);
        
        Calculator<Double> calcuDouble = new Calculator<>();
        System.out.println(calcuDouble.add(13.5, 4.3));
        
        
        //multithreading 
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        
        t1.start();
        t2.start();
        
        
        //concurrency
   
        
    }
    
    //generic methods you can used this to any type 
    public static <T> void showArray(T[] element) {
        for(T copy : element) {
            System.out.println(copy);
        }
    }
}
