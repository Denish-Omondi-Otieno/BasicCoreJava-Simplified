package a7typecasting;

public class TypeCasting {
	
	public static void main (String [] args) {
		
		short x = 7;
		int y = x;
		// Implicit type casting
		// Type casting is done automatically (Widening)		
		System.out.println(y);
		// (byte 8bit, short 16bit, int 32bit, long 64bit) (Widening)
		// (float 32bit, double 64bit) (Widening) 
		
		float v1 = 10.0f;
		double v2 = v1; // Implicit Casting
		System.out.println(v2);
		
		double v3 = 20.0d;
		float v4 = (float) v3; 
		// Explicit Casting (narrowing)
		// Reference is done through a cast
		System.out.println(v4);
		
		double v5 = 20.123456789d;
		float v6 = (float) v5;
		// Explicit Type casting
		// Leads to lose of precision in very long numbers
		System.out.println(v6);
		
		float g = 10.123f;
		int z = (int)g;
		System.out.println(z);
		// Explicit type casting
		//Truncation happens
	}
	
	

}
