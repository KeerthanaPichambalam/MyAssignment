package Week3Day1Assignments;

public class CheckButtonBox extends Button {
	
	public void clickCheckButton() {
		System.out.println("grandchild Subclass method clickSubmitButton is called");
	}
	

public static void main(String[] args) {
	// TODO Auto-generated method stub
	CheckButtonBox grandchild = new CheckButtonBox();
	//calling grandparent (WebElement) methods
	grandchild.click();
	grandchild.setText("grandchild CheckBoxButton" );
	//calling parent (Button) methods
	grandchild.submit();
	//calling own methods
	grandchild.clickCheckButton();

}

}
