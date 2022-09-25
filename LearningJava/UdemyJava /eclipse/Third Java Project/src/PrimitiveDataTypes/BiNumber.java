package PrimitiveDataTypes;

public class BiNumber {

	private int number1; // store the values

	private int number2;// store the values

	public BiNumber(int number1, int number2) {// initiate the values
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getNumber1() { // get value number1
		return number1;
	}

	public void setNumber1(int number1) { // set value number1
		this.number1 = number1;
	}

	public int getNumber2() { // get value number2
		return number2;
	}

	public void setNumber2(int number2) { // set value number2
		this.number2 = number2;
	}

	public int add() { // the "add" method
		return number1 + number2;
	}

	public int multiply() { // the "multiply" method
		return number1 * number2;
	}

	public void doubleValue() { // the "doubleValue method
		this.number1 *= 2;
		this.number2 *= 2;
	}
}
