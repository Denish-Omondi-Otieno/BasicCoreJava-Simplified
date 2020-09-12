package a2variables;

public class UnderstandingVariables {
	
	public static void main (String [] args) {
		int value1 = 10;
		int value2 = 20;
		int value3 = (value2-value1);
		int value4 = (value1*value2)-(value3);
		
		System.out.println("The value of value1 is: "+value1);
		System.out.println("The value of value2 is: "+value2);
		System.out.println("The value of value3 equals " +value2+"-"+value1+"="+value3);
		System.out.println("The value of value4 equals " +value1+"*"+value2+"-"+value3+"="+value4);
	}

}
