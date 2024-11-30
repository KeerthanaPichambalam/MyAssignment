package Week3Day1Assignments;

public class SingleInheritanceLoginTestData extends SingleInheritanceTestData {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleInheritanceLoginTestData child = new SingleInheritanceLoginTestData();
		
		child.navigateToHomePage();
		
		child.enterCredentials(child.enterUsername(), child.enterPassword());
		

	}
	
	public String enterUsername() {
		return "Testleaf2024";
	}
	public String enterPassword() {
		return "crms@123";
	}

}
