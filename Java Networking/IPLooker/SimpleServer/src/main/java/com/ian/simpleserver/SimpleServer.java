package com.ian.simpleserver;



import java.io.*;
import java.net.*;




public class SimpleServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Server is waiting for a client...");

            Socket socket = serverSocket.accept(); // Wait for a connection
            System.out.println("Client connected: " + socket.getInetAddress());

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            writer.println("Hello from Server!"); // Send a message to client

            String clientMessage = reader.readLine(); // Read client's message
            System.out.println("Client says: " + clientMessage);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

