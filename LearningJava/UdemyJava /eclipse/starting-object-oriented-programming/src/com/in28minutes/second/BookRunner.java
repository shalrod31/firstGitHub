package com.in28minutes.second;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComuputerProgramming = new Book(1000);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(1000);

		artOfComuputerProgramming.print();
		effectiveJava.print();
		cleanCode.print();

		System.out.println(artOfComuputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		// artOfComuputerProgramming.setNoOfCopies(1000);
		// effectiveJava.setNoOfCopies(2000);
		// cleanCode.setNoOfCopies(4000);

		artOfComuputerProgramming.increaseNoOfCopies(50);
		effectiveJava.increaseNoOfCopies(50);
		cleanCode.increaseNoOfCopies(50);

		artOfComuputerProgramming.decreaseNoOfCopies(25);
		effectiveJava.decreaseNoOfCopies(25);
		cleanCode.decreaseNoOfCopies(25);

		System.out.println(artOfComuputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

	}
}