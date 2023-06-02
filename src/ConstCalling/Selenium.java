package ConstCalling;

public class Selenium implements Google {

	@Override
	public void search() {
		System.out.println("this is selenium search");
		
		System.out.println(Google.count);
	
		
	}

}
