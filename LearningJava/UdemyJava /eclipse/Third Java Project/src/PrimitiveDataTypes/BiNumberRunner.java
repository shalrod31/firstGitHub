package PrimitiveDataTypes;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3); // call the class

		System.out.println(numbers.add()); // result: 5
		System.out.println(numbers.multiply()); // result: 6

		numbers.doubleValue(); // double each value below

		System.out.println(numbers.getNumber1()); // result: 4
		System.out.println(numbers.getNumber2()); // result: 6

	}

}
