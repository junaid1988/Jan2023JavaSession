package doubtSession;

import java.util.Arrays;

public class DeleteArrayElement {

	public static void main(String[] args) {
		
		int p[] = {1, 2, 3, 4, 5, 22, 31, 43, 2};// Delete array element
		
		int q[] = new int[p.length-1];
		
		int count = 0;
		for(int e : p) {
			if(!(e == 4)) {
				q[count] =e;
				count++;
			}
		}
		System.out.println(Arrays.toString(q));
		
		
		int a[] = {1, 2, 3, 4, 5, 22, 31, 43, 2};
		int b[] = new int[a.length];
		
		int c=0;
		for(int e : a) {
			b[c] = e;
			c++;
		}
		System.out.println(Arrays.toString(b));
	

	}

}
