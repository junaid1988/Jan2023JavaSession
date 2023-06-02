package practice;

public class WorkerTest {

	public static void main(String[] args) {
		
		//POST -- Create 
		Worker w = new Worker("Azam", 30, 12.33, "Kabul", "Afghanistan");
		
		//GET -- Retrieve
		System.out.println(w.getName());
		System.out.println(w.getAge());
		System.out.println(w.getSalary());
		System.out.println(w.getCity());
		System.out.println(w.getCountry());
		
		
		//PUT -- Update
		System.out.println("------------");
		w.setAge(32);
		w.setSalary(14.33);
		
		System.out.println(w.getName());
		System.out.println(w.getAge());
		System.out.println(w.getSalary());
		System.out.println(w.getCity());
		System.out.println(w.getCountry());
		
//		
//		w.setName("Tom");
//		w.setAge(30);
//		w.setSalary(12.33);
//		w.setCity("Kabul");
//		w.setCountry("Afghanistan");
//		
//		System.out.println(w.getName());
//		System.out.println(w.getAge());
//		System.out.println(w.getSalary());
//		System.out.println(w.getCity());
//		System.out.println(w.getCountry());
//		
	

	}

}
