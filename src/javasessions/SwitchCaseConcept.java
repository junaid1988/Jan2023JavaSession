package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "chrome";

		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			if (5 > 3) {
				System.out.println("5 is greater than 3");
			}

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
		case "opera":
			System.out.println("launch opera");

			break;

		default:
			System.out.println("Please pass the right browser......");
			break;
		}
		
		//QA, Stage, UAT, DEV, PROD
		
		String envName = "azam";
		switch (envName.toLowerCase().trim()) {
		case "qa":
			System.out.println("run test on QA");
			
			break;
		case "stage":
			System.out.println("run test on stage");
			
			break;
		case "uat":
			System.out.println("run test on UAT");
			
			break;
		case "dev":
			System.out.println("run test on DEV");
			
			break;
		case "prod":
			System.out.println("run test on PROD");
			
			break;

		default:
			System.out.println("Please pass the right envirenment");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		

		char ch = 'e';
		switch (ch) {
		case 'a':
			System.out.println(ch+ " : is a vowel ");

			break;

		case 'e':
			System.out.println(ch+ " : is a vowel ");

			break;
		case 'i':
			System.out.println(ch+ " : is a vowel ");

			break;
		case 'o':
			System.out.println(ch+ " : is a vowel ");

			break;
		case 'u':
			System.out.println(ch+ " : is a vowel ");

			break;

		default:
			System.out.println(ch+ " : is a constant ");
			break;
		}

	}

}
