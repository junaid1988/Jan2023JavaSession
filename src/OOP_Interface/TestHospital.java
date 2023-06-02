package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		
		fh.cardioServices();
		fh.dentalServices();
		fh.neuroServices();
		fh.emergencyServices();
		fh.oncologyServices();
		fh.medicalTraining();
		fh.medicalClaim();
		fh.orthoServices();
		fh.pediaServices();
		fh.physioServices();
		fh.medicalRD();
		fh.medicalTest();
		
		System.out.println(USMedical.min_fee);// this is best to have interface variables 
		System.out.println(fh.min_fee);
		System.out.println(FortisHospital.min_fee);
		//top casting: child class object can be referred by parent class reference variable
		
		USMedical us = new FortisHospital();
		us.physioServices();
		us.cardioServices();
		us.dentalServices();
		us.emergencyServices();
		us.medicalTest();
		
		WHO wh =new FortisHospital();
		wh.covidVaccinationCamp();
		
		//down casting: NA
		
		//calling static method:
		USMedical.billing();
		FortisHospital.billing();

	}

}
