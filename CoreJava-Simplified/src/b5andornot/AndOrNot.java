package b5andornot;

public class AndOrNot {
	public static void main(String[] args) {

		// And
		// if and only if all conditions are true
		// The output will be true
		boolean x = true;
		boolean y = false;

		if (x && y) {
			System.out.println("Condition is true");
		} else {
			System.out.println("Condition is false");
		}

		// OR
		// If any of the operands is true
		// The general condition is true
		boolean a = true;
		boolean b = false;

		if (a || b) {
			System.out.println("Condition is true");
		} else {
			System.out.println("Condtion is false");
		}

		// Using operators to perform activities
		// On && and ||
		int c = 6;
		int d = 7;
		if ((c > d) && (c == d)) {
			System.out.println("Condition is true");
		} else {
			System.out.println("Condition is false");
		}

		// !
		// Not inverse the results
		int e = 6;
		int f = 7;
		if (!((e > f) && (e == f))) {
			System.out.println("Condition is true");
		} else {
			System.out.println("Condition is false");
		}

		// Real life application
		// Case of marriage
		// Note marriage age is 18 years in this case
		int ageofboy = 21;
		int ageofgirl = 17;

		if ((ageofboy >= 21) && (ageofgirl >= 18)) {
			System.out.println("Can get married");

		} else {
			System.out.println("Wait for legal age");
		}
	}
}
