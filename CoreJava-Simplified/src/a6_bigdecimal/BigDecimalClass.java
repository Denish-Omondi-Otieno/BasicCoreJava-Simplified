package a6_bigdecimal;

import java.math.BigDecimal;

public class BigDecimalClass {

	public static void main (String [] args) {
		
		double x = 1.05;
		double y = 2.55;
		System.out.println(x+y);
		// Rounding up happens
		// No exact precision, solution is BigDecimal
		
		BigDecimal d1 = new BigDecimal (1.05);
		BigDecimal d2 = new BigDecimal (2.55);
		System.out.println(d1.add(d2));
		// Rounding up becomes more complex
		// Solution is to use a string version of the variables
		
		BigDecimal d3 = new BigDecimal ("1.05");
		BigDecimal d4 = new BigDecimal ("2.55");
		System.out.println(d3.add(d4));
		// String version of the variables disables rounding up
		//The precision is better 
	}
}
