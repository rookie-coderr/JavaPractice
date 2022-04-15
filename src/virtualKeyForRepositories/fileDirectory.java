package virtualKeyForRepositories;

import java.util.*;

public class fileDirectory {
	
	List<String> fileList = new ArrayList<String>(List.of("demo1","demo2","demo3","demo4"));
	
	fileDirectory(){
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
		
		Collections.sort(fileList);
		
		System.out.println("Below is the files list - ");
		for(String i : fileList) {
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

		fileList.add(Fname);
		System.out.println("File added successfully");
		moreOptions();
		
	}
	
	public void searchFile() {     //Searching for a file in the directory
		 
		String Fname = getfileName();
		int index = fileList.indexOf(Fname);
		
		if(index==-1) {
			System.out.println("File not found");
		}
		else System.out.println("File is found at position " + (index+1));
		moreOptions();
		
	}
	
	public void deleteFile() {    // Deleting a file from the directory
		
		String Fname = getfileName();
		
		if(fileList.remove(Fname)) {
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
