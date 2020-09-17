package b7_switchcase;

public class SwitchCase2 {
	
	public static void main(String [] args ) {
		
		char x = 'b';
		
		switch(x) {
		case 'a':
		case 'A':
			// Strings are case sensitive
			// To have the same output for selection a & A 
			// We create case 'a' and case 'A'
			
			System.out.println("The value of x is a");
			break;
			
		case 'b':
		case 'B':
			System.out.println("The value of x is b");
			break;
			
		case 'c':
		case 'C':
			System.out.println("The value of x is c");
			break;
			
			default:
				System.out.println("The value of x is other than a,b,c");
				break;
		}
	}

}
