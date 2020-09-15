package b8loops;

public class DoWhileLoop {
	
	// In Java Do While loop 
	// The expression is evaluated at the end of the loop 
	// So even if the expression returns false 
	// Statements inside the code block will be executed at least once
	
	// Syntax
	
	//            do{ // body of loop
	//               }while (condition);
	
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}

}
