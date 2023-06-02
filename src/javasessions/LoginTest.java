package javasessions;

public class LoginTest {

	public static void main(String[] args) {
		
		if(LoginPage.forgotPwdLinkExist()) {
			System.out.println("change ur pwd");
			
			LoginPage obj = new LoginPage();
			obj.doLogin("azam@gmail.com", "kbl@123");
		}
		
		

	}

}
