package javasessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		
		// ArrayList -- default class
		// create the object ArrayList
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());// pc=0 vc=10
		
		ar.add(100);//0
		ar.add(200);//1
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		ar.add(500);//4
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
		//System.out.println(ar.get(5));//IndexOutOfBoundsException
		//System.out.println(ar.get(-1));//IndexOutOfBoundsException
		
		ar.add(600);//5
		System.out.println(ar.get(5));
		
		ar.add(12.33);
		ar.add(true);
		ar.add('m');
		ar.add("testing");
		System.out.println(ar.size());
		
		// generics ArrayList
		
		ArrayList<Integer> markList = new ArrayList<Integer>();//vc=10, vp=0
		markList.add(100);
		markList.add(200);
		System.out.println(markList.size());
		
		ArrayList<Double> bmiList = new ArrayList<Double>();
		bmiList.add(10.12);
		bmiList.add(100.00);
		
		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("safari");
		browserList.add("opera");
		
		System.out.println(browserList.size());
		
		System.out.println(browserList.get(1));
		
		System.out.println(browserList);
		
		//print all the values from ArrayList
		
		for(int i=0; i<browserList.size(); i++) {
			System.out.println(browserList.get(i));
			if(browserList.get(i).equals("chrome")) {
				System.out.println("google");
			}
		}
		System.out.println("---------");
		//for each loop
		
		for(String e : browserList) {
			System.out.println(e);
		}
		
		
		// emp info: name, age, salary, string, string, char, true
		
		ArrayList<Object> empInfoList = new ArrayList<Object>();
		empInfoList.add("Riya");
		empInfoList.add("Sniha");
		empInfoList.add(30);
		empInfoList.add(45.55);
		empInfoList.add("California");
		empInfoList.add('f');
		empInfoList.add(true);
		
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
