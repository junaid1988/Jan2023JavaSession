package practice;

public class Student {
	
	public int studentMarks(String studentName) {
		System.out.println("Student marks");
		int marks = 0;
		if(studentName.equals("Azam")) {
			marks =90;
		}
		else if(studentName.equals("Ahmad")) {
			marks = 100;
			
		}
		else if(studentName.equals("Zabi")) {
			marks = 80;
			
		}
		else if(studentName.equals("Omid")) {
			marks = 10;
		}
		else {
			System.out.println("student not found... plz pass the right student"+studentName);
		}
		return marks;
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		int m1 = s.studentMarks("Azam");
		System.out.println(m1);
		
		int m2 = s.studentMarks("Omid");
		System.out.println(m2);
		
		int m3 = s.studentMarks("Zabi");
		System.out.println(m3);
		
		int m4 = s.studentMarks("Jan");
		System.out.println(m4);

	}

}
