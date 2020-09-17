package b7_switchcase;

public class SwitchCase1 {
	
	public static void main (String [] args) {
		
		int x = 2;
		switch (x) {
		// The switch statement is not a replacement for the if else
		
		case 1:
			System.out.println("The value of x is 1");
			break;
			// Always apply breaks 
			// It breaks the flow 
		case 2:
			System.out.println("The value of x is 2");
			break;
		case 3:
			System.out.println("The value of x is 3");
			break;
			default:
				System.out.println("The value of x is other than 1,2,3");
				break;
		}
		
	}
	
	}
