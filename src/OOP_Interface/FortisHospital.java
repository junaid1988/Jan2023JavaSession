package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {
	
	//int min_fee = 50;

	//US
	@Override
	public void physioServices() {
		System.out.println("FH-----physioServices");
		
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH----cardioServices");
		
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH-----dentalServices");
	
		
	}
	
	
    //UK
	@Override
	public void neuroServices() {
		System.out.println("FH------neuroServices");
		
		
	}

	@Override
	public void pediaServices() {
		System.out.println("FH------pediaServices");
		
		
	}
    
	//India
	@Override
	public void oncologyServices() {
		System.out.println("FH-----oncologyServices");
		
	}
    
	
	@Override
	public void orthoServices() {
		System.out.println("FH--------orthoServices");
		
	}
    
	//common
	@Override
	public void emergencyServices() {
		System.out.println("FH---------emergencyServices");
		
	}
	
	//individual
	public void medicalTraining() {
		System.out.println("FH--------medicalTraining");
	}
	
	public void medicalClaim() {
		System.out.println("FH-------medicalClaim");
	}

	@Override
	public void covidVaccinationCamp() {
		System.out.println("FH--------covidVaccinationCamp");
		
	}
	
	//method hiding:
	public static void billing() {
		System.out.println("FH---billing");
	}
	
	@Override
	public void medicalTest() {
		System.out.println("FH Medical test");
	}


	
	
	
	

}
