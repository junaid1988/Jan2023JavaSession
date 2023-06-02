package practice;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launch -- browser");
		
		checkBrowserVersion();
		checkOSCompatibility();
		checkRAM();
		checkCPU();
		
		System.out.println("browser is launched");

		
	}
	
	private void checkBrowserVersion() {
		System.out.println("check  Browser Version");
	}
	
	private void checkOSCompatibility() {
		System.out.println("checkOSCompatibility");
	}
	
	private void checkRAM() {
		System.out.println("check RAM");
	}
	
	private void checkCPU() {
		System.out.println("check CPU");
	}

}
