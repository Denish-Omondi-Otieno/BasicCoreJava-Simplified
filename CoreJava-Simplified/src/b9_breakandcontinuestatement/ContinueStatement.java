package b9_breakandcontinuestatement;

public class ContinueStatement {
	
	// Sometimes if the programmer wants to skip a few statements inside the loop 
	// In such cases, continue statements are used 
	// Generally, the continue statement ends the current iteration of the loop
	
	// We have for loop running from 1 to 10 
	// We can observe that we have skipped println statement for number 5
	// Why? Because when the value of variable i==5 
	// Java skips post continue statements for the particular iteration in a loop
	// Which makes it to jump to the next iteration and skip the current iteration
	
	public static void main (String [] args) {
			for (int i = 1; i <= 10; i++) {

				if (i == 5) {
					continue;
				}
				System.out.println(i);
			}

		}
	}


