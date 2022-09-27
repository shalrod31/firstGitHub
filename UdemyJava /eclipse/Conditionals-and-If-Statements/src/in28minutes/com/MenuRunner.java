package in28minutes.com;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Type obj = new Type (argument);

		System.out.print("Enter Number1: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter Number2: ");
		int number2 = scanner.nextInt();

		System.out.println("Choices Available are: ");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");

		System.out.print("Enter Choice: ");
		int choice = scanner.nextInt();

		System.out.println("Your Choices are ");
		System.out.println("Number1: " + number1);
		System.out.println("Number2: " + number2);
		System.out.println("Choice: " + choice);

		if (choice == 1) {
			System.out.println("Result: " + (number1 + number2));
		} else if (choice == 2) { // you can use many else if. the code will stop at the true or match statement
			System.out.println("Result: " + (number1 - number2));
		} else if (choice == 3) { // you can use many else if. the code will stop at the true or match statement
			System.out.println("Result: " + (number1 / number2));
		} else if (choice == 4) { // you can use many else if. the code will stop at the true or match statement
			System.out.println("Result: " + (number1 * number2));
		} else {
			System.out.println("Invaild Operation");
		}
	}

}
