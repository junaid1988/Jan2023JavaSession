package practice;

public class ReverseString {
	
	public static String reverseString(String st) {
		
		String rev = "";
		for(int i = st.length()-1; i>=0; i--) {
			
			rev = rev +st.charAt(i);
		}
		return rev;
	}
	


	public static void main(String[] args) {
		
		String reverse = reverseString(" I like Java o/p");
		System.out.println(reverse);
		
		

	}

}
