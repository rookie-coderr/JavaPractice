package javaLessons;

import java.util.Scanner;

public class arrayReverse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array length");
		int number = sc.nextInt();

		int arr[] = new int[number];
		
		System.out.println("Enter "+ number+" values of array");
		
		for(int i=0;i<number;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<number/2;i++) {
			int temp = arr[i];
			arr[i] = arr[number-1-i];
			arr[number-1-i] = temp;
		}
		
		for(int i=0;i<number;i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
		
	}

}
