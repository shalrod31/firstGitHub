package in28minutes.com;

import java.util.Scanner;

public class IfStatementRunner {

	public static void main(String[] args) {
		int i = 26; // declare the variable
		// if the if statement is false it will ignore the block
		// i is 25
		// i is 24
		// i is neither 25 or 24
		Scanner myObj = new Scanner(System.in);

		String a = "v";
		// Enter username and press Enter
		System.out.println("Enter username");
		a = myObj.nextLine();

		if (a.equals("v")) {
			if (i == 25) {
				System.out.println("i = 25");
			} else if (i == 24) { // you can use many else if. the code will stop at the true or match statement
				System.out.println("i = 24");
			} else if (i == 26) { // you can use many else if. the code will stop at the true or match statement
				System.out.println("you know it baby");
			} else {
				System.out.println("i ! = 24 and i ! = 25");
			}
		} else {
			System.out.println(a);

		}

	}

}


