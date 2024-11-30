package Week3Day1Assignments;

public class SingleInheritanceTestData {
	
	public void enterCredentials(String Username,String Password) {
		System.out.println("Welcome "+Username+" reset password "+Password);
	}
	
	public void navigateToHomePage() {
		System.out.println("Navigated to New page");
	}
	
	public static void main(String[] args) {
		SingleInheritanceTestData parent = new SingleInheritanceTestData();
		parent.navigateToHomePage();
		parent.enterCredentials("Testleaf123","33srfes");
		
	}

}
