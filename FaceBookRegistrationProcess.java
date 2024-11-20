package Week2Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FaceBookRegistrationProcess {
	public static void main(String[] args)  {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("To"); //ToEnterFirstName
		driver.findElement(By.name("lastname")).sendKeys("Test"); //ToEnterLastName
		driver.findElement(By.name("reg_email__")).sendKeys("qwerty@gmail"); //ToEnterEmail
		driver.findElement(By.name("reg_passwd__")).sendKeys("Asdfgh123"); //ToEnterPassword
		
		WebElement daydrop = driver.findElement(By.id("day"));
		Select dob=new Select(daydrop);
		dob.selectByValue("1"); //ToSelectDay
		
		WebElement monthdrop = driver.findElement(By.id("month"));
		Select mon=new Select(monthdrop);
		mon.selectByVisibleText("Jan"); //ToSelectMonth
		
		WebElement yeardrop = driver.findElement(By.id("year"));
		Select year=new Select(yeardrop);
		year.selectByValue("1999"); //ToSelectYear
		
		driver.findElement(By.xpath("//input[@value='1']")).click(); //ToSelectGender
		driver.findElement(By.name("websubmit")).click();

		
		
	}
}
