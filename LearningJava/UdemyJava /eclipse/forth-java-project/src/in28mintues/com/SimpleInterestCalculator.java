package in28mintues.com;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principal; // store value
	BigDecimal interest;// store value

	public SimpleInterestCalculator(String principal, String interest) { // constructor, initiate values by call'g class
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));

	}

	public BigDecimal calculatorTotalValue(int noOfYears) { // a method
		// Total value = principle + principle * interest * noOfYears
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears); // Creating a variable; int to BigDecimal
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));
		return totalValue;
	}

	public String myFunction(String myName) { // a method
		return myName;
	}




}
