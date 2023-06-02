package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//1. with new keyword
		int a[] = new int[4];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		//System.out.println(a[4]); //ArrayIndexOutOfBoundsException
		//System.out.println(a[-1]); //ArrayIndexOutOfBoundsException
		
		int len = a.length;
		System.out.println(len);
		int hi = len-1;
		System.out.println(hi);
		int li = 0;
		System.out.println(li);
		
		//to print all the values from the array: use for loop
		
		for(int i=0; i<4; i++) {
			System.out.println(a[i]);
		}
		
		// without for loop
		System.out.println(a); //[I@515f550a
		System.out.println(Arrays.toString(a));
		
		//double array:
		double d[] = new double[2];
		d[0] = 12.34;
		d[1] = 10.15;
		System.out.println(d[0] + d[1]);
		
		
		// String array:
		
		String emp[] = new String[3];
		emp[0] = "Pooja";
		emp[1] = "Sniha";
		emp[2] = "Rakesh";
		
		System.out.println("total of emp : " + emp.length);
		System.out.println(Arrays.toString(emp));
		
		for(int k = 0; k<emp.length; k++) {
			System.out.println(emp[k]);
			if(emp[k].equals("Sniha")) {
				System.out.println("Sniha salary is : "+1000);
				
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
