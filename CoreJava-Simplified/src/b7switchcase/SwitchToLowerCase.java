package b7switchcase;

public class SwitchToLowerCase {
	
	public static void main (String [] args) {
		
		String name = "TEAM";
		
		switch (name.toLowerCase()) {
		case "author":
			System.out.println("Denish");
			break;
			
		case "team":
		System.out.println("Java Simplified Coders");
		break;
		
		case "editor":
		System.out.println("Omondi and Otieno");
		break;
		
		default:
			System.out.println("Invalid entry");
			break;
		
		}
		
	}

}
