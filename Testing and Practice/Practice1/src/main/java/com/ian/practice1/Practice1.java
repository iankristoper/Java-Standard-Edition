package com.ian.practice1;







interface Vehicle 
{
        void start();
        void stop();
}



//subclass methods that inherit the vehicle interfaca
class Car implements Vehicle 
{    
        @Override 
        public void start() 
        {
                System.out.println("Car starts...");
                System.out.println("Car starts...");
                System.out.println("Car starts...");
                System.out.println("Car starts...");
        }
    
    
        @Override 
        public void stop() 
        {
                System.out.println("Car stops...");
        }
    
}
        

//subclass methods that inherit the vehicle interface
class Bike implements Vehicle
{
        @Override 
        public void start()
        {
                System.out.println("Bike starts...");
        }
        
        
        @Override 
        public void stop()
        {
                System.out.println("Bike stops...");
        }
}






public class Practice1 
{

        public static void main(String[] args) 
        {
         
       
        }
}
