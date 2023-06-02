package assignments;

public class Student {

	public static void main(String[] args) {
		
		String studentName = "Azam";
		int marks =0;
		
		switch (studentName) {
		case "Azam":
			marks = 90;
			System.out.println("Azam passed");
			
			break;
		case "Mukesh":
			marks = 80;
			System.out.println("Mukesh passed");
			
			break;
		case "Mohini":
			marks = 100;
			System.out.println("Mohini passed");
			
			break;
		case "Amit":
			marks = 20;
			System.out.println("Amit failed");
			
			break;

		default:
			System.out.println("student not found.. plz pass the right student ");
			break;
		}

	}

}
