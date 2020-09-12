package a9stringbasics;

public class StringBasics {
	public static void main (String [] args) {
		String var = "Hello World \u00BB";	
		System.out.println(var);
		//\u00BB is a unicode
		
		String var1 = "10";
		String var2 = "20";
		System.out.println(var1 + var2);
		// The + is an overloaded operator
		// In this its concatenating var1 and var 2
		
		int var3 = 30;
		String var4 = "40";
		System.out.println(var3 + var4);
		// Int var 3 is type casted into String
		// Then concatenated
		
		int var5 = 50;
		String var6 = "60";
		System.out.println(var5 + 10 + var6 + "This");
		//Int var5 is added into int 10
		//The results is concatenated to String var6 and "This" 
		
	}

}

