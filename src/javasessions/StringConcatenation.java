package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a = 10;
		int b= 20;
		System.out.println(a+b);
		
		String x = "Hello";
		String y = "Selenium";
		
		System.out.println(x+y);
		System.out.println(a+x);
		System.out.println(a+b+x+y); // 30helloSelenium
		System.out.println(x+y+a+b); // helloSelenium1020
		System.out.println(x+y+(a+b)); // HelloSelenium30
		System.out.println(a+b+x+y+a+b); //30helloSelenium1020
		System.out.println(a+b+x+y+(a+b));//30HelloSelenium30
		
		double c = 12.33;
		double d = 23.44;
		System.out.println(x+y+c+d);//helloSelenium12.3323.44
		System.out.println(x+y+a+b+c+d); //HelloSelenium102012.3323.44
		
		char g ='m';
		char p = 'n';
		
		String l = "testing";
		String u = "automation";
		System.out.println(l+u);
		System.out.println(l+u+g+p);
		
		char t1 ='a'; //97
		char t2 = 'b'; // 98
		
		System.out.println(t1+t2); //97+98 = 195
		
		char t3 = 'z'; // 122
		System.out.println(t1+t2+t3);
		
		System.out.println(t1); // a
		System.out.println(t2-t1); // 1
		
		System.out.println('a');// a
		System.out.println('a'+'a');// 195
		System.out.println("a+b"); //a+b
		
		//ASCII Value
		//a-b: 97 to 122 
		//A-Z: 65 to 90
		//0-9: 48 to 57
		
		System.out.println('$'+'a'); // 36+97
		System.out.println((byte)'a'); //97
		System.out.println((byte)'$'); //36
		System.out.println((int)'a');//97
		
		
		int s1 = 100;
		int s2 = 300;
		System.out.println("The value of s1 i:"+s1);
		System.out.println("The value of s2 i:"+s2);
		System.out.println("The sum is: " +(s1+s2));
		
				
				

	}

}
