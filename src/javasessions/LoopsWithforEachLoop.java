package javasessions;

import java.util.Arrays;

public class LoopsWithforEachLoop {

	public static void main(String[] args) {

		int a[] = new int[4];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		for(int e : a) {
			System.out.println(e);
		}
		
		System.out.println(a[2]);
		
		String emp[] = new String[5];//0-4
		emp[0] = "Pooja";
		emp[1] = "Amit";
		emp[2] = "Anand";
		emp[3] = "Rakesh";
		emp[4] = "Mohini";
		
		for(String e : emp) {
			System.out.println(e);
			if(e.equals("Amit")) {
				System.out.println("he is a developer");
				break;
			}
		}
		
		Object employee[] = new Object[5];//0-4
		employee[0] = "Ahmad";
		employee[1] = 30;
		employee[2] = 45.35;
		employee[3] = 'm';
		employee[4] = true;
		
		System.out.println(Arrays.toString(employee));
		
		System.out.println("-----------------");
		
		for(Object e : employee) {
			System.out.println(e);
		}
		
		System.out.println("----------");
		
		int ar[] = new int[4];
		ar[0] =  10;
		ar[1] =  20;
		ar[2] =  30;
		ar[3] =  40;
		
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
		
		// Default value will be zero o
		
		int pr[] =  new int[4];
		System.out.println(pr[0]);
		pr[0] = 1000;
		System.out.println(pr[0]);
		
		System.out.println("--------");
		
		int test[] = {10, 20, 40, 55, 66, 77, 88, 909};
		System.out.println(test.length);
		
		System.out.println(test[0]);
		System.out.println(test[7]);
		//System.out.println(test[8]);//ArrayIndexOutOfBoundsException
		
		test[0] = 400;// 0(1)
		System.out.println(test[0]);
		
		//test[8] = 600;
		//System.out.println(test[8]); //ArrayIndexOutOfBoundsException
		
		test[3] = 99;
		System.out.println(test[3]);
		System.out.println(Arrays.toString(test));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
