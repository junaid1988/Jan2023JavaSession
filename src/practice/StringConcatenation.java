package practice;

public class StringConcatenation {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
		
		String x = "Java";
		String y = "Selenium";
		
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+(a+b));
		System.out.println(a+b+x+y+a+b);
		
		char c = 'b';
		char c1 = 'd';
		System.out.println(c+c1);
		System.out.println(c);
		
		System.out.println((byte)'u');
		
		int s1 = 100;
		int s2 = 300;
		System.out.println("The value of s1 is: "+s1);
		System.out.println("The value of s2 is: "+s2);
		System.out.println("The sum is: "+(s1 + s2));
		
		

	}

}
