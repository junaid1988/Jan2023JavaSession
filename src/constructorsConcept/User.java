package constructorsConcept;

public class User {
	
	String firstName;
	String lastName;
	String emailId;
	String phone;
	String password;
	String city;
	
	//AC:
	//user can be created if you have :
	// FN, LN
	//FN, LN, emailId
	//FN
	//FN, LN, password
	//FN, LN, emailId, phone, password, city
	
	//method: int taxCal(name) -- business logic
	//const: no business logic --only for object creation - restriction of object
	// - to initiaize the class vars with initial values
	

	

	public User(String firstName, String lastName) {
	
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User(String firstName, String lastName, String emailId) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public User(String firstName) {
		
		this.firstName = firstName;
	}

	public User(String firstName, String lastName, String emailId, String phone) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
	}

	public User(String firstName, String lastName, String emailId, String phone, String password, String city) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.password = password;
		this.city = city;
	}
	
      public static void main(String[] args) {
    	  
    	  User u1 = new User("Ankit");
    	  System.out.println(u1.firstName+ " "+ u1.lastName);
    	  u1.lastName = "Agarwal";
    	  System.out.println(u1.firstName+ " "+ u1.lastName);
    	  
    	  User u2 = new User("Ferdows", "Azam", "ferdwos@gmail.com", "9167485757", "aba@gmail", "Kabul");
    	  System.out.println(u2.phone);
    	  System.out.println(u2.firstName+" "+u2.lastName+" "+u2.emailId+" "+ u2.phone+" "+u2.password+" "+u2.city);
    	  
    	  u2.city = "Kunduz";
    	  u2.phone = "9167865654";
    	  u2.password = "and@123";
    	  
    	  System.out.println(u2.firstName+" "+u2.lastName+" "+u2.emailId+" "+ u2.phone+" "+u2.password+" "+u2.city);
    	  
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
