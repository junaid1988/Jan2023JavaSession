package javasessions;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {
		
		int a[] = {12, 13, 14, 15, 16,};
		double s[] = {12.34, 10.12, 6.32, 8.23};
		char c[] = {'a', 'e', 'i', 'o', 'u'};
		int b[] = new int[5];
		
		
		String browsers[] = {"chrome", "firefox", "ie", "edge", "safari"};
		for(int i =0; i<browsers.length; i++) {
			System.out.println(browsers[i]);
			
			if(browsers[i].equals("ie")) {
				System.out.println("This is deprecated");
			}
		}
		
	

	}

}
