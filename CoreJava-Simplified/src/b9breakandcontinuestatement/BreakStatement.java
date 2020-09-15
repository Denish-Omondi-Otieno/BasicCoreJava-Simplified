package b9breakandcontinuestatement;

public class BreakStatement {
	
	// The break statement 
	// Transfers the flow of control out of the current scope
	
	// We have for loop running from 1 to 10 but
	// We have a break statement applied when the loop value equals to 5
	// The loop will get terminated and 
	// Control will come out of the loop body and get passed to next statement in the program
	
	public static void main(String [] args) {
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
			if (i==5) {
				break;
			}
		}
		
	}

}
