package practice;

import java.util.Arrays;

public class InsertionSorting {
	
	public static void insertionSorting(int arr[]) {
		
		for(int i = 1; i<arr.length; i++) {
			
			int current = arr[i];
			int j = i-1;//0
			while(j>=0 && arr[j]>current) {
				
				
				arr[j+1] = arr[j];
				j--;
				
			}
			arr[j+1]=current;
			
			
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int arr[] = {8, 4, 1, 2, 3, 99, -1, 889, 9, 0, 1, -2};
		insertionSorting(arr);
		

	}

}
