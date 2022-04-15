package virtualKeyForRepositories;

import java.util.*;

public class mainMenuScreen{

	public static void main(String[] args) {
		
		fileDirectory screen = new fileDirectory();
		screen.welcomeScreen();
		Boolean quit = true;
		int choice = 0;
		while(quit) {
			try {
				Scanner userChoice = new Scanner(System.in);
				System.out.println("\nEnter your choice: ");
				choice = userChoice.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("Invalid Input..Try again!!");
				continue;
			}
			
			switch(choice) {
				case 1 :
					screen.showFiles();
					break;
				case 2:
					screen.moreOptions();
					break;
				case 3:
					System.out.println("\nProgram closed!!");
					quit = false;
					break;
				default :
					System.out.println("Invalid input..Try again!!");
				}
		}
	}
	
}
