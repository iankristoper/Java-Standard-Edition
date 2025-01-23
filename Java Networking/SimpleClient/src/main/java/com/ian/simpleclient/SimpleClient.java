package com.ian.simpleclient;



import java.io.*;
import java.net.*;




public class SimpleClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Server says: " + reader.readLine()); // Read server message
            writer.println("Hello from Client Fuckshit!"); // Send a message to server

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

