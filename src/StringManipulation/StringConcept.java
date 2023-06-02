package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {
		
		//String is the most frequently used data type in programming language
		//String literals
		String s = "Hello";
		String s1 = "Hello";
		String s2 = "hello";
		
		System.out.println(s==s1);//true
		System.out.println(s1==s2);
		
		//String  objects with new keyword
		
		String st = new String("Java");
		String st1 = new String("Hello");
		
		System.out.println(s==st1);//false
		System.out.println(s.equals(st1));//true
		
		
		String st2 = new String("Hello");
		
		String test = new String("Selenium");//1 ----> HEAP
		test.intern(); //1 --->SCP(String Constant Pool)
		String t1 = "Selenium";//0
		
		//total numbers of object =>2
		
		String st4 = new String();//1 object created without any value
		System.out.println(st4.length());
		

		
		int i = 10;
		int j = 10;
		int k = 10;

	}

}
