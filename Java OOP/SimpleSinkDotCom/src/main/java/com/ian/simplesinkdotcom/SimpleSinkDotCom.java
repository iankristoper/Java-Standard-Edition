/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ian.simplesinkdotcom;

/**
 *
 * @author Ian Tagano
 */




class SimpleDotCom
{
    //INSTANCE VARIABLES
    int[] locationCells;
    int numberOfHits = 0;
    
    //SETTER METHOD 
    public void setLocationCells(int[] location)
    {
        locationCells = location;    
    }
    
    //METHOD FOR CHECKING IF THE PROGRAM IS WORKING
    public String checkYourself(String stringGuess)
    {
        int guess = Integer.parseInt(stringGuess);   //CONVERT STRING NUMBER TO INTEGER
        String result = "guess";
        
        //ITERATION FOR CHECKING CELLS
        for(int cell : locationCells)
        {
            if(guess == cell)
            {
                result = "Hit";
                numberOfHits++;
                
                //AUTOMATICALLY GET OUT OF THE LOOP
                break;          
            }
        }
        
        if(numberOfHits == locationCells.length)
        {
            result = "kill";
        }
        
        //THIS WILL RETURN TO THE CALLER
        return result;
    }
    
}





public class SimpleSinkDotCom 
{
    public static void main(String[] args) 
    {
        SimpleDotCom sample = new SimpleDotCom();
        int[] location = {1,2,3};
        
        sample.setLocationCells(location);
        
        String userGuess = "6";
        String result = sample.checkYourself(userGuess);
        System.out.println(result);
    }
}
