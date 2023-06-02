package OOP_Encapsulation;

public class AmazonLogin {

	public static void main(String[] args) {
		
		//Registration
		LoginPage lp = new LoginPage("poja@gmail.com", "@123");
		
		//Login
		lp.doLogin(lp.getUserName(), lp.getPassword());
		
		//reset pwd:
		lp.setPassword("azam@123");
		lp.doLogin(lp.getUserName(), lp.getPassword());
		
		//Azam -- seller
		
		
		
		
		
		

	}

}
