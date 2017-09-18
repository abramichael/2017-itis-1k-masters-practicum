// This is our code in Java

/*
	Read Java Code Conventions
*/

import java.util.Scanner;

public class Task001 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n >= 10000) {
			System.out.println("We offer you ADS");
		}
		else {
			System.out.println("You have " + n + " likes.");
		}
		System.out.println("End.");

		
	}

}