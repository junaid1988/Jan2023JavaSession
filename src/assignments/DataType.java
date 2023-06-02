package assignments;

public class DataType {

	public static void main(String[] args) {
		
		//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		
		System.out.println("Hello"); //Hello
		System.out.println("Junaidullah Azam"); // Junaidullah 	Azam
		
		
		//2. Write a Java program to print the sum of two numbers.
		
		int a = 74;
		int b = 36;
		System.out.println(a+b);//110
		
		//3. Write a Java program to divide two numbers and print on the screen
		
		System.out.println(130/3); //43
		System.out.println(5/3); //1
		System.out.println(59/3);//19
		System.out.println(26/2);//13
		
		//5. Write a Java program to compute the specified expressions and print the output. Go to the editor
		System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));//2.1888888888889
		
		//Try to concat "Hello Selenium" with a character 't'
		
		String s1 = "Hello Selenium";
		char c ='t';
		System.out.println(s1+c); //HelloSeleniumt
		
		//7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
		int i = 100;
		int j = 200;
		int k = 3400;
		System.out.println("Your total amount is: "+(i+j+k)); //Your total amount is:3700
		
		//8.Print the ASCII value of the character 'h'.
		System.out.println((byte)'h');// ASCII Value h =104
		
		//Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		int A = 3;
		
		
		System.out.println(3+(byte)A); // 103
		
		//Write a program to find the square of the number 3.9
		
		float d = 3.9f;
		System.out.println(d*d);
		
		
		
		
		
		
	

	}

}
