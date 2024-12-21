package com.ian.phone_number_formatter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 *
 * @author Ian Tagano
 */

public class Phone_Number_Formatter 
{
    
    public static String formatPhoneNumber(String phoneNumber)
    {
        // Remove all non-digit characters from the phone number
        String digitsOnly = phoneNumber.replaceAll("\\D", "");
        
        String regex = "(\\d{3})(\\d{3})(\\d{4})";
        String replacement = "($1) $2-$3";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(digitsOnly);
        
        
        if (matcher.matches()) 
        {
            return matcher.replaceAll(replacement);
        } 
        else 
        {
            // If the phone number doesn't match the expected format, return it as is
            return phoneNumber;
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        String phoneNumber = scanner.nextLine();

        String formattedPhoneNumber = formatPhoneNumber(phoneNumber);
        System.out.println("Formatted phone number: " + formattedPhoneNumber);

        scanner.close();
    }
}
