package b8_loops;

public class WhileLoop {

	// In While loop, boolean expression is evaluated before the execution of code 
	// If the boolean expression is evaluated as true 
	// The execution of code starts 
	// if the expression is evaluated as false 
	// Block of code inside while loop will not be executed
	
	// Syntax while (boolean expression)
	//               loop code here
	
	public static void main(String[] args) {
		int i = 1;
		while (i <= 101) {
			System.out.println(i);
			i++;
		}

	}

}
