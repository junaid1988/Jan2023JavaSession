package assignments;

public class Employee {

	String EmpName;
	String position;
	int empID;
	char gender;
	boolean empStatus;
	String DepName;
	String location;
	double salary;
	static final String COMPANY_NAME = "Tesla";
	static final String ceo = "Elon Mask";

	public static void main(String[] args) {

		Employee emp1 = new Employee();

		System.out.println(emp1.DepName);
		System.out.println(emp1.position);
		System.out.println(emp1.empID);
		System.out.println(emp1.gender);
		System.out.println(emp1.empStatus);
		System.out.println(emp1.DepName);
		System.out.println(emp1.location);
		System.out.println(emp1.salary);
		System.out.println(COMPANY_NAME);
		System.out.println(ceo);

		emp1.EmpName = "Adrain";
		emp1.position = "QA Engineer";
		emp1.empID = 4503;
		emp1.gender = 'm';
		emp1.empStatus = true;
		emp1.DepName = "IT";
		emp1.location = "California";
		emp1.salary = 120000;

		System.out.println(emp1.EmpName+" "+emp1.position+" "+ emp1.empID+" "+emp1.gender + " "
		+ emp1.empStatus +" "+ emp1.location +" "+ emp1.salary +" "+ Employee.COMPANY_NAME +" "+Employee.ceo);
		
		
		Employee emp2 = new Employee();
		emp2.EmpName = "Mohini";
		emp2.position = "Finance Manager";
		emp2.empID = 3452;
		emp2.gender = 'f';
		emp2.empStatus = true;
		emp2.DepName = "Finance Department";
		emp2.location = "San Jose";
		emp2.salary = 1100000;
		
		System.out.println(emp2.EmpName+" "+emp2.position+" "+ emp2.empID+" "+emp2.gender + " "
		 + emp2.empStatus +" "+ emp2.location +" "+ emp2.salary +" "+ Employee.COMPANY_NAME +" "+Employee.ceo);
		
		
		Employee emp3 = new Employee();
		emp3.EmpName = "Akshay";
		emp3.position = "Admin Officer";
		emp3.empID = 1234;
		emp3.gender = 'm';
		emp3.empStatus = true;
		emp3.DepName = "Admin Department";
		emp3.location = "San Francisco";
		emp3.salary = 800000;
		
		System.out.println(emp3.EmpName+" "+emp3.position+" "+ emp3.empID+" "+emp3.gender + " "
		 + emp3.empStatus +" "+ emp3.location +" "+ emp3.salary +" "+ Employee.COMPANY_NAME +" "+Employee.ceo);
		

	}

}
