package practice;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		
		
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		System.out.println(a[2]);
		System.out.println(Arrays.toString(a));
		int len=a.length;
		System.out.println(len);
		int hi = len-1;
		System.out.println(hi);
		int li = 0;
		System.out.println(li);
		
		for(int i=0; i<4; i++) {
			System.out.println(a[i]);
		}
	

	}

}
