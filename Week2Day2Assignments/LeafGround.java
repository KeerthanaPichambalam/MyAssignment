package Week2Day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		if(driver.getTitle().equalsIgnoreCase("dashboard"))
			System.out.println("Title matched");
		else
			System.out.println("title not matched");
		driver.navigate().back();
		
		boolean buttonDisabled = driver.findElement(By.xpath("(//button[contains(@name,'j_idt88')])[2]")).isEnabled();
		if(buttonDisabled)
			System.out.println("the button is enabled");
		else
			System.out.println("the button is disabled");
		
		System.out.println("location is "+driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
		System.out.println("back ground color is "+driver.findElement(By.xpath("(//button[contains(@name,'j_idt88')])[4]")).getCssValue("background-color"));
		System.out.println("height and width is "+driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']//following::span")).getSize());
		driver.close();
	}

}
