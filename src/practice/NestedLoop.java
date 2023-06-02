package practice;

public class NestedLoop {

	public static void main(String[] args) {
		
		for(int i =0; i<=5; i++) {
			for(int j=0; j<=5; j++) {
				System.out.print(i+ "" +j+ " "); //00 01 02 03 04 05
				                                 //10 11 12 13 14 15
			}
			
			System.out.println();
			
		}
		
		for(char ch = '0'; ch<='9'; ch++) {
			System.out.println(ch + " = " + (byte)ch);
		}
		
		byte t1 = 065;
		System.out.println(t1);

	}

}
