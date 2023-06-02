package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		
		int i = 1;
		System.out.println(i);
		
		// Constant time:  Big O(1)
		
		String name = "Tom";
		System.out.println(name); //Big O(1)
		
		int n = 10;
		for(int p =1; p<=n; p++) {
			System.out.println(p);
		}
		// 1 + n + n + ==> 3n+1 --> linear equation
		// 3n+1 ==> 3n --> 0(n)
		
		// 1 to 100
		int k = 1;
		int q = 0;
		while(k<=100) {
			System.out.println("hi");
			System.out.println(k);
			System.out.println(q);
			k++;
			q++;
		}
		System.out.println("-----------------");
		// 1 + 1 + n + n + n + n + n + n => 6n+2 => 2(3n+1) => 2(3n) => 6n ==> 0(n)
		
		// Nest loop
		//00 01 02 03 04 
		//10 11 12 13 14 
		//20 21 22 23 24 
		//30 31 32 33 34 
		
		for(int m=0; m<=3; m++) {
			for(int h=0; h<=4; h++) {
				System.out.print(m+""+h+" ");
			}
			System.out.println();
		}
		
		/// 
		
		
		for(int m=0; m<=9; m++) {
			for(int h=0; h<=9; h++) {
				
				for(int d = 0; d<=9; d++) {
					System.out.print(m+ ""+ h +""+ d + " ");
					
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
