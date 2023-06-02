package OOP_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launch browser");
		checkBrowserVersion();
		checkOSCompability();
		checkRAM();
		checkCPU();
		System.out.println("browser is launched");
		
		
	}
	private void checkBrowserVersion() {
		System.out.println("check Browser Version");
		
	}
	private void checkOSCompability() {
		System.out.println("Check compability ");
		
	}
	private void checkRAM() {
		System.out.println("Check RAM");
		
	}
	private void checkCPU() {
		System.out.println("Check CPU");
		
	}

}
