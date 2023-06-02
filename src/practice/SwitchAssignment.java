package practice;

public class SwitchAssignment {

	public static void main(String[] args) {
		
		String browsers[] = {"chrome", "firefox", "safari", "edge", "ie"};
		
		for(int i=0; i<browsers.length; i++) {
			System.out.println(browsers[i]);
		
		switch (browsers[i]) {
		case "chrome":
			System.out.println("google");
			
			break;
		case "firefox":
			System.out.println("mozilla");
			
			break;
		case "safari":
			System.out.println("apple");
			
			break;
		case "edge":
			System.out.println("microsoft");
			
			break;
		case "ie":
			System.out.println("microsoft");
			
			break;

		default:
			System.out.println("Browsers not found");
			break;
		}
		
		
	
		}
	}

}
