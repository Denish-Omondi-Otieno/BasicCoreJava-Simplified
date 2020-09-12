package a7typecasting;

public class TypeCastingExercise {
	
	public static void main (String [] args) {
		
		// (a+b) squared = ((a*a) + 2ab + (b*b))
		
		// When you need a higher precision double is better
		int a = 25;
		float b = 46.789f;
		double value = (a*a) + 2*(a*b) + (b*b);
		System.out.println(value);
		
		// Get the results with the final value as int
		// Explicit type casting
		// Truncation happens
		int c = 25;
		float d = 46.789f;
		int value2 = (int)((c*c) + 2*(c*d)+ (d*d));
		System.out.println(value2);
		
	}

}
