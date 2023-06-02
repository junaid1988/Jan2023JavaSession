package StringManipulation;

import ExceptionHandling.MyException;

public class StringReverse {
	
	//Interview Question
	//Selenium --->muineleS
	//A-->A
	
	public static String reverseSring(String st) {
		
		if(st == null) {
			System.out.println("null values can not reversed...plz pass the right value");
			throw new MyException("NULL VALUES");
		}
		if(st.length()== 1) {
			return st;
		}else if(st.length() == 0) {
			System.out.println("plz pass the right value not the blank value");
			//return st
			return "-1";
			
		}
		String rev = "";
		for(int i = st.length()-1; i>=0; i--) {
			
			rev = rev + st.charAt(i);
			
		}
		return rev;
		
	}

	public static void main(String[] args) {
		
		System.out.println(reverseSring("Selenium"));
		System.out.println(reverseSring("A"));
		System.out.println(reverseSring("AA"));
		System.out.println(reverseSring("Selenium testing java lang"));
		//System.out.println(reverseSring(null));
		System.out.println(reverseSring(""));
		
		
		//"java python selenium"
		//"muineles nohtyp avaj"
		
		String m = "selenium";
		StringBuilder sb = new StringBuilder("selenium");
		System.out.println(sb.reverse());




		
	

	}

}
