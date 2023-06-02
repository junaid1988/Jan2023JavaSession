package javasessions;

import java.util.ArrayList;

public class Concept {

	// WAF
	// supply a browser name: String: chrome/ff/safrai/ie
	// businesd logic: launch the browser

	public boolean launchBrowser(String browserName) {
		System.out.println("browser name :" + browserName);
		boolean flag = true;

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");

			break;
		case "firefox":
			System.out.println("launch firefox");

			break;
		case "safari":
			System.out.println("launch safari");

			break;
		case "ie":
			System.out.println("launch ie");

			break;

		default:
			System.out.println("browser not found...plz pass the right browser" + browserName);
			flag = false;
			break;
		}
		return flag;

	}

	public void testing() {
		System.out.println("test method");
		return;
	}

	// WAF
	// supply input parameter: Company name(String): IBM, MS, Google
	// return: the list of employee of the company: ArrayList<String>

	public ArrayList<String> getEmpList(String compName) {
		System.out.println("company name is: " + compName);

		ArrayList<String> empList = new ArrayList<String>();// pc=0

		if (compName.equalsIgnoreCase("IBM")) {
			empList.add("Rakesh");
			empList.add("Mike");
			empList.add("Abhi");
			empList.add("Azam");

		} else if (compName.equalsIgnoreCase("MS")) {
			empList.add("Mohini");
			empList.add("Ana");
			empList.add("Amit");

		} else if (compName.equalsIgnoreCase("google")) {
			empList.add("Mukesh");
			empList.add("Sham");
			empList.add("Anand");

		} else {
			System.out.println("company name not found.. please pass the right company name");
		}
		return empList;

	}

	public static void main(String[] args) {

		Concept c = new Concept();

		ArrayList<String> ibmList = c.getEmpList("IBM");
		System.out.println(ibmList);
		
		ArrayList<String> msList = c.getEmpList("MS");
		System.out.println(msList);
		
		ArrayList<String> googleList = c.getEmpList("Google");
		System.out.println(googleList);
		
		ArrayList<String> mtsList = c.getEmpList("MTS");
		System.out.println(mtsList);

		boolean isLaunched = c.launchBrowser("opera");
		if (isLaunched) {
			System.out.println("enter the url....");
		} else {
			System.out.println("don't enter the url...");
		}

	}

}
