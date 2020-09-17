package a5_floatdatatype;

public class FloatDataTypes {
	public static void main (String []args) {
	
		int value1 = 10/6;
		//Occupies 32 bits of memory
		//Truncates everything after the decimal point
		//Preferred over byte and short
		
		float value2 = 10f/6f;
		//f donates float value
		//Occupies 32 bits of memory too but not as precise as double
		
		double value3 = 10d/6d;
		//d donates double data type
		//Occupies 64bits of memory
		//Is more precise
		
		System.out.println("value1 = " + value1);
		System.out.println("Value2 = " + value2);
		System.out.println("Value3 = " + value3);
	}

}
