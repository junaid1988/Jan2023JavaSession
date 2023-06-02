package practice;

public class LoginPageTest {

	public static void main(String[] args) {
		
		
		//registration:
		LoginPage lp = new LoginPage("pooja@gmail.com", "pooja@123");
		
		//login
		lp.doLogin(lp.getUserName(), lp.getPassword());

	}

}
