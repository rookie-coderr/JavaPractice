package virtualKeyProjectWithPath;

import java.nio.file.*;
//import java.nio.file.Files;
//import java.nio.file.Path;
import java.io.*;
import java.util.*;
	
public class FileOperations {
	
//	List<String> fileList = new ArrayList<String>(List.of("demo1","demo2","demo3","demo4"));
	static final String path = "C:\\Users\\riagrawal\\Desktop\\javaPractice\\javaLessons\\src\\virtualKeyProjectWithPath\\virtualKeyRepositoryFiles\\";
	
	FileOperations(){
		System.out.println("WELCOME TO COMPANY LOCKER’S VIRTUAL KEY FOR YOUR REPOSITORIES!!");
		System.out.println("DEVELOPED BY – RICHA AGRAWAL");
		System.out.println();  // adding extra space
	}
	
	public void welcomeScreen(){     // Displaying menu options
		System.out.println("1. Show Files");
		System.out.println("2. More options");
		System.out.println("3. Exit");
		
	}
	
	public void showFiles() {        // Displaying list of files in directory
		
		File file = new File(path);
		String[] ListofFiles = file.list();
		Arrays.sort(ListofFiles);
		
		System.out.println("Below is the file list - ");
		for(String i : ListofFiles) {
			System.out.println(i);
		}
	}
	
	
	public void moreOptions() {    
		
		int choice = displayOptions();
		
		switch(choice) {
			case 1:
				addFile();
				break;
			case 2:
				searchFile();
				break;
			case 3:
				deleteFile();
				break;
			case 4:
				welcomeScreen();
				break;
			default:
				System.out.println("Invalid input sub menu");
	    }
	}
	
	private int displayOptions() {
		
		System.out.println("1. Add file\n2. Search file\n3. Delete file\n4. Back ");
		System.out.println("\nEnter your choice: ");
		Boolean isValid = false;
		int choice = 0;
		while(!isValid) {
			try{
				Scanner userInput = new Scanner(System.in);
				choice = userInput.nextInt();
				isValid = true;
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input");
			}
		}
		
		return choice;
	}
	

	public void addFile() {         // Adding file in the directory
		
		String Fname = getfileName();
		String location = path+Fname+".txt";
		
		File file = new File(location);
		
		try {
			Boolean flag = file.createNewFile();
//			System.out.println(flag);
			if(flag) {
				System.out.println("File added successfully" );
//				fileList.add(Fname);
			}
			else System.out.println("File already exists");
		} catch (IOException e) {
			System.out.println("File addition unsuccessful");
			e.printStackTrace();
		}

		moreOptions();
		
	}
	
	public void searchFile() {     //Searching for a file in the directory
		 
		String Fname = getfileName();
		String location = path+Fname+".txt";
		
		File file = new File(location);
		
		if(!(file.exists())) {
			System.out.println("File not found");
		}
		else {
			System.out.println("File found at - " + file.getAbsolutePath());
		}
			moreOptions();
		
	}
	
	public void deleteFile() {    // Deleting a file from the directory
		
		String Fname = getfileName();
		String location = path+Fname+".txt";
		
		File file = new File(location);
		
		if(file.delete()) {
			System.out.println("File removed successfully");
		}
		else System.out.println("File not found");
		moreOptions();
		
	}
	
	public String getfileName() {    //Getting file name from user
		
		System.out.println("Enter file name :");
		
		Boolean isValidInput = false;
		String Fname = null; 
		
		while(!isValidInput) {
			try{
				Scanner fileName = new Scanner(System.in);
				Fname =  fileName.nextLine();
				isValidInput = true;
 			}
			catch (InputMismatchException e) {
				System.out.println("Please enter valid file name");
			}
		}
		
		return Fname;
	}

}



