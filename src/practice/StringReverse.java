package practice;

public class StringReverse {
	
	//Selenium --> muineleS
	//A --> A
	
	public static String reverseString(String st) {
		
		if(st.length() == 1) {
			return st;
		}
		String rev = "";
		for(int i = st.length()-1; i>=0; i--) {
			
			rev = rev + st.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		
		System.out.println(reverseString("Selenium"));
		System.out.println(reverseString("A"));
		System.out.println(reverseString("AA"));
		System.out.println(reverseString("Selenium testing java lang"));
		System.out.println(reverseString(null));




		

	}

}

