package javasessions;

public class ForLoopConcept {

	public static void main(String[] args) {
		
		for(double d = 1.1 ; d<=5.1;  d++)
		{
			System.out.println(d);
		}
		System.out.println("................");
		
		for(int w = 1; w<=100; w++) {
		
			if(w % 2 == 0) {
				System.out.println(w);
			}
			
		}
		// use cases of while loops
		// when number of iterations are not fixed - while loop
		// total links /images on the  page
		// webtable pagination 1.2.3.4....next
		//webelement is loading on the page
		// page load time out
		//calendar: 10, 1 hr, 2 hr , 30 mins
		
		
		// Use cases of for loop
		//When number of iterations are fixed -- for loop
		// month/days drop down --> 1 to 12
		// category options
		// Array / Arraylist
		// Excel file -- test data -- rows -- 1 to rowSize();
		// Country drop down -- 1 to 230 --> if name = Brazil -- break;
		//Read data -- JSON/XML
		// Read data from DB - SQL -- rows/column
		
		
		// do while loop
		int e = 1;
		do {
			//e++;
			System.out.println(e);
			//e++; 
			//break;
		}
		while(e <= 10);
		e++;
		
		
		
		// Use cases of do while loop
		//1. webtable pagination -- check if element is already present in the table - click on i
		//2. go and check the element first and then start   do while loop
		//3. calendar: 
		

	}

}
