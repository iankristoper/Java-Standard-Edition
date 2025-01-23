package com.ian.iplooker;



import java.net.InetAddress;
import java.net.UnknownHostException;


public class IPLooker {

    public static void main(String[] args) {
        
        try {
            
            String websiteName = "google.com";
            
            InetAddress IP = InetAddress.getByName(websiteName);
            System.out.println("IP address of " + websiteName + ": " + IP);
                     
        } catch(UnknownHostException e) {
            
            System.out.println("Host not found: " + e.getMessage());
        }
        
    }
}

//IP address of google.com: google.com/142.251.220.142
