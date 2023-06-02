package practice;

import java.util.Arrays;

public class BubbleSort {
	//20, 32, 10, 20, 12, 89
	
	public static void bubbleSort(int arr[]) {
		boolean flag = false;
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j =1; j<arr.length-1; j++) {
				
				if(arr[j] < arr[j-1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					flag = true;
				}
			}
			if(!flag || flag == false) {
				break;
			}
		}
	}
	
	
	
	

	public static void main(String[] args) {
		
		int arr[] = {20, 32, 10, 20, 12, 89, 34, 10, 15};
		int arr1[] = {20, 32, 10, 20, 12, 89};
		int arr2[] = {-1, -40, 20, 32, 10, 20, 12, 89};
		int arr3[] = {20, 32, 10, 20, 12, 89, 0, 23, };
		int arr4[] = {20, 32, 10, 20, -1,  12, 89};
		bubbleSort(arr);
		bubbleSort(arr1);
		bubbleSort(arr2);
		bubbleSort(arr3);
		bubbleSort(arr4);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		

	}

}
