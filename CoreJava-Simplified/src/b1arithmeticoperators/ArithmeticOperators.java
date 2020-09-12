package b1arithmeticoperators;

public class ArithmeticOperators {
	
	public static void main (String [] args) {
		int x = 20;
		int y = 4;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x*y);
		
		System.out.println(x%y);
				
		System.out.println(x++); 
		//Post fix increment
		System.out.println(x); 
		//Results of post fix
		
		System.out.println(++x);
		//Prefix increment 
		
		System.out.println(y--);
		//Post fix decrement
		System.out.println(y);
		
		System.out.println(--y);
		//Prefix decrement
		
	}

}
