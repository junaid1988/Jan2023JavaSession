package practice;

public class ForLoopAssignment {

	public static void main(String[] args) {
		
		String browsers[] = {"chrome", "firefox", "safari", "edge", "ie"};
		
		for(int i=0; i<browsers.length; i++) {
			System.out.println(browsers[i]);
			
			if(browsers[i].equals("chrome")) {
				System.out.println("google created");
				
			}
			else if(browsers[i].equals("firefox")) {
				System.out.println("mozilla created");
			}
			else if(browsers[i].equals("safari")) {
				System.out.println("apple created");
				
			}
			else if(browsers[i].equals("edge")) {
				System.out.println("microsoft created");
			}
			else if(browsers[i].equals("ie")) {
				System.out.println("microsoft created");
			}
			
		}

	}

}
