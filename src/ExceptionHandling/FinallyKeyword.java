package ExceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		System.out.println("hi");
		
		try {
		int i = 9/3;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
		}
		catch(NullPointerException e) {
			System.out.println("AE is coming");
		}
		
		finally {
			System.out.println("byee ---- finally block");
		}
		

	}

}
