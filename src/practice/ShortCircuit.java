package practice;

public class ShortCircuit {

	public static void main(String[] args) {
		
		int b = 100;
		int c = 40;
		int d = 130;
		int e = 60;
		
		if(b>c && b>d) {
			System.out.println("b is greatest");
			
		}
		else if(c>d && c>e) {
		System.out.println("c is greatest");
			
		}
		else if(d>e) {
			System.out.println("d is greatest");
		}
		else {
			System.out.println("e is greatest");
		}

	}

}
