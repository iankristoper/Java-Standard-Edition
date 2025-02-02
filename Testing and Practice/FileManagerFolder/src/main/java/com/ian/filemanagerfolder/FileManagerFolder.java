package com.ian.filemanagerfolder;


//This is a File manager folder where the user can create file, view file, delete file and others
//


import java.io. *;
import java.util.*;



public class FileManagerFolder {

    public static void main(String[] args) {
        
        FileManager file = new FileManager();
        Scanner scanner = new Scanner(System.in);
        boolean isProgramRunning = true;
        
        while(isProgramRunning) {
            
            System.out.println("Welcome to my own File Folder");
            System.out.println("[1] Create File");
            System.out.println("[2] Edit File");
            System.out.println("[3] Remove File");
            System.out.println("[4] View File");
            System.out.println("[5] View All files");
            System.out.println("[6] Check file Properties");
            System.out.println("[7] Exit Program");
            System.out.println("");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
                case 1:
                    file.createFile(scanner);
                    break;
                    
                case 2:
                    file.editFile(scanner);
                    break;
                    
                case 3:
                    file.removeFile(scanner);
                    break; 
                    
                case 4:
                    file.viewFile(scanner);
                    break;
                    
                case 5:
                    file.viewAllFiles();
                    break;
                    
                case 6:
                    file.checkProperties(scanner);
                    break;
                    
                case 7:
                    isProgramRunning = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
        
        
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
        
        File[] files = folder.listFiles();
        
        if(files != null && files.length > 0) {
            System.out.println("Files in the folder: ");
            
            for(File copy : files) {
                System.out.println(copy.getName());
            }
        } else {
            System.out.println("No files found in the folder");
        }
        
    }
    
    public void checkProperties(Scanner scanner) {
        
        System.out.println("Enter the name of the file to check the properties: ");
        String fileName = scanner.nextLine();
        
        File file = new File(FOLDER_PATH + fileName);
        
        if(file.exists()) {
            System.out.println("Properties of " + fileName + ": ");
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Last Modified: " + new Date(file.lastModified()));
        } else {
            System.out.println("File not found");
        }
        
    }
    
}