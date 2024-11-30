package Week3Day1Assignments;

public class TextField extends WebElement{
	
	public void getText() {
		System.out.println("Subclass getText method is called");
	}
public static void main(String[] args) {
	TextField textfield = new TextField();
	textfield.click();         
	textfield.setText("TextField"); 
	textfield.getText();		  
	
}

}
