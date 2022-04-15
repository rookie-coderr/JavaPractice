package javaLessons;

import java.util.Scanner;

public class arrayMin {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter array length");
		int number = sc.nextInt();

		int arr[] = new int[number];
		int minn = Integer.MAX_VALUE;
		
		System.out.println("Enter "+ number+" values of array");
		
		for(int i=0;i<number;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<minn) {
				minn = arr[i];
			}
		}
		
		System.out.println(minn);
		sc.close();
	}

}
