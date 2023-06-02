package javasessions;

public class SwitchCaseExamples {

	public static void main(String[] args) {
		
		// byte short int, char, String -- valid
		// not valid - long, float, double, boolean
		short s = 10;
		
		switch (s) {
		case 10:
			System.out.println("10");
			break;

		default:
			break;
		}
		
		String stName = "Mahesh";
		int marks = 0;
		switch (stName) {
		case "Tom":
			System.out.println("tom passed");
			marks = 100 - 20;
			
			break;
		case "Peter":
			System.out.println("peter passed");
			marks=100;
			
			break;
		case "Naveen":
			System.out.println("naveen passed");
			marks=100;
			
			break;

		default:
			System.out.println("student not found " +stName);
			marks = -1;
			break;
		}
		System.out.println(marks);
		
		if(marks >=0) {
			System.out.println("print the marks sheet");
		}
		else {
			System.out.println("no need to print");
		}

	}

}
