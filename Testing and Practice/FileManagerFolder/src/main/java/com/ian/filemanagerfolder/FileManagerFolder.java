package com.ian.filemanagerfolder;


//This is a File manager folder where the user can create file, view file, delete file and others
//


import java.io. *;
import java.util.*;



public class FileManagerFolder {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
    }
}






//class for the data 
//it incorporates encapsulation
class FileData {
    
    private String name;
    
    public FileData(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}





//class for the methods and functionality
class FileManager {
    
    private static final String FOLDER_PATH = "./files/"; //directory for managing files
    private File folder;
    
    public FileManager() {
        folder = new File(FOLDER_PATH);
        
        if(!folder.exists()) {
            folder.mkdirs();   //create the folder if it doesnt exists  
        }
    }
    
    
    public void createFile(Scanner scanner) {
        
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        
        File newFile = new File(FOLDER_PATH + fileName);
        
        try {
            if(newFile.createNewFile()) {
                System.out.println("File created successfully: " + fileName);
            } else {
                System.out.println("File already exists");
            }
        } catch(IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
        
        
    }  
    
    public void editFile(Scanner scanner) {
        
        System.out.print("Enter the name of the file to edit: ");
        String fileName = scanner.nextLine();
        
        File file = new File(FOLDER_PATH + fileName);
        
        if(file.exists()) {
            System.out.print("Enter the new content for the file name (type 'exit' to finish): ");
            StringBuilder newContent = new StringBuilder();
            String line;
            
            while(!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
                newContent.append(line).append("\n");
            }           
            
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(newContent.toString());
                System.out.println("File edited successfully");
            } catch(IOException e) {
                System.out.println("An error occured: " + e.getMessage());
            }
            
        } else {
            System.out.println("File not found");
        }
        
    }
    
    public void removeFile(Scanner scanner) {
        
        System.out.print("Enter the file to be removed: ");
        String fileName = scanner.nextLine();
        
        File file = new File(FOLDER_PATH + fileName);
        
        if(file.exists()) {
            if(file.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Error deleting the file");
            }         
        } else {
            System.out.println("File not found");
        }
        
    }
    
    public void viewFile(Scanner scanner) {
        
        System.out.print("Enter file to view: ");
        String fileName = scanner.nextLine();
        
        File file = new File(FOLDER_PATH + fileName);
        
        if(file.exists()) {
            try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
                
                String line;
                
                System.out.print("Contents of " + fileName + ": ");
                
                while((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch(IOException e) {
                System.out.println("An error occured: " + e.getMessage());
            }
        } else {
            System.out.println("File not found");
        }
    }
    
    public void viewAllFiles() {
        
        
    }
    
    public void checkProperties() {
        
    }
    
}