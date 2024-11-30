package Week3Day1Assignments;

public class Button extends WebElement {
	public void submit() {
		System.out.println("Subclass method submit is called");
	}
	
	
	public static void main(String[] args) {
		Button button = new Button();
		button.click();           
		button.setText("Button"); 
		button.submit();		  	
		

	}

}
