package Week2Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Keerthana's Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select ind=new Select(industry);
		ind.selectByIndex(2);
		
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select own=new Select(ownership);
		own.selectByVisibleText("S-Corporation");
		
		
		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sour=new Select(source);
		sour.selectByValue("LEAD_EMPLOYEE");
		
		WebElement market = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select mark=new Select(market);
		mark.selectByIndex(5);
		
		WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select sta=new Select(state);
		sta.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	
		String title = driver.getTitle();
		System.out.println("page Title is : "+title);
		driver.close();
		
	}

}
