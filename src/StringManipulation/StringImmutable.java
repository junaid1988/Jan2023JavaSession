package StringManipulation;

public class StringImmutable {

	public static void main(String[] args) {
		
		//Immutable class:
		String s = "Selenium";
		
		String t = s + "Hello";
		System.out.println(t);
		System.out.println(s);
		
		String st = "Java";
		System.out.println(st + "Python");// it creates an new entry inside the memory
		System.out.println(st);
		
		st = st + "Automation";
		System.out.println(st);//JavaAutomation
		
		String u = "Java";//it doesn't create any entry but referred by u
		
		//mutable classes:
		//StringBuilder(JDK 1.5) faster and StringBuffer(JKD 1.0):
		StringBuilder sb = new StringBuilder("Testing");
		sb.append("Automation");
		System.out.println(sb);
		
		String pop = "      submit    ";
		pop = pop.trim();
		
	


	}

}
