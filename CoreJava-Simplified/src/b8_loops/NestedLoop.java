package b8_loops;

public class NestedLoop {
	
	// A nested loop is a loop within a loop
	// An inner loop within the body of an outer one. 
	
	// In this program, the inner loop and the outer loop are initialized to 1
	// The outer loop’s condition is  i <= 3 whereas  for inner loop is j <= 3
	// Here outer loop iterates 3 times  
	// For each iteration of the outer loop
	// The inner loop executes three times.
	
	public static void main(String [] args) {
		
		for (int i = 1; i<=3; i++) {
			for (int j = 1; j<=3; j++) {
				System.out.println("value of i: " + i + "and value of j: " + j);
			}
		}
		
	}

 }
