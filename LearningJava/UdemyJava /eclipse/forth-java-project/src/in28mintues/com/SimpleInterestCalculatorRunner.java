package in28mintues.com;

import java.math.BigDecimal;//right click to import java.math; this file is already in java

public class SimpleInterestCalculatorRunner { // the class

	public static void main(String[] args) { // the argument to start the class; populated by eclipse

		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5"); // create code runner
																								// name: calculator;
																								// SimpleInterestCalculator
																								// calls the class and
																								// method
		// "new SimpleInterestCalculator(("4500.00", "7.5");" is an constructor which
		// initialize class object

		System.out.println(calculator.myFunction("Shalece Thompson")); // this is an instance of the calculator calling
																		// a string method called "myFunction"

		BigDecimal totalValue = calculator.calculatorTotalValue(5); // 5 years; create another object code runner name:
																	// totalValue created in the calculator

		System.out.println(totalValue); // result: 6187.50000; calling "totalValue" answer
	}

}
