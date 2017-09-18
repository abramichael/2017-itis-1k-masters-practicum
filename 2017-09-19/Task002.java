// This is our code in Java

/*
	Read Java Code Conventions
*/

//import java.util.Scanner;

public class Task002 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int n = s.length();
		int counter = 0;
		int i = 0;
		char c;
		while (i < n) {
			c = s.charAt(i);
			if (c == 'a' || c == 'A') { // && - and, || - or
				counter += 1;
			}
			i++;
		}
		System.out.println(counter);
		System.out.println("End.");
		
		
	}

}