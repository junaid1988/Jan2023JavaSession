package javasessions;

public class Student {
		
		//WAF
		//create a methed -- getStudentMarks
		// pass parameter: studentName(String)
		//return the student marks --> int
		
		public int getStudentMarks(String studentName) {
			
			System.out.println("getting marks for: "+studentName);
			int marks =0;
			
			if(studentName.equalsIgnoreCase("Riya")){
				marks=90;
				
			}
			else if(studentName.equalsIgnoreCase("Vikash")){
				marks=100;
				
			}
			else if(studentName.equalsIgnoreCase("Neetu")){
				marks=80;
				
			}
			else if(studentName.equalsIgnoreCase("Naveen")){
				marks=10;
				
			}
			else {
				System.out.println("no student found .. please pass the right student"+ studentName);
			}
			return marks;
			
			
		}	
			
			public static void main(String[] args) {
				
				Student s1 = new Student();
				int m1 = s1.getStudentMarks("Riya");
				System.out.println(m1);
				
				int m2 = s1.getStudentMarks("Naveen");
				System.out.println(m2+60);
				
				if(m2>=0) {
					System.out.println("print the mark sheet");
				}
				
				int m3 = s1.getStudentMarks("Tom");
				System.out.println(m3);
				
				if(m3>=0) {
					System.out.println("print the mark sheet");
				}
			
		}
		
		

	

}
