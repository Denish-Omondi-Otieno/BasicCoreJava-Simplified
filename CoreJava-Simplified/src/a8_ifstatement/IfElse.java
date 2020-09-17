package a8_ifstatement;

public class IfElse {

	public static void main(String[] args) {
		int x = 6;
		if (x == 5) {
			System.out.println("x is equal to " + x);
		} else if (x > 5) {
			System.out.println("x is greater than 5" + ", x is: " +x);
		}
		else {
			System.out.println("x is less than" + x); 
		}
	}
}
