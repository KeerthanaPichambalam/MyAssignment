package Week2Day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class EditLead {
	
	public static void main(String[] args)
	{
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			
				//enter username, password and enter login button and click on CRM/SFA link
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();

				// click account tab and click create lead menu
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.partialLinkText("Create")).click();
				
				driver.findElement(By.xpath("//input[contains(@id,'LeadForm_companyName')]")).sendKeys("TestLeaf Pvt Ltd");
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("GetLead25");
				driver.findElement(By.xpath("//input[contains(@id,'LeadForm_lastName')]")).sendKeys("GetLastname25");
				driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("GetLocal25");
				driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Testing");
				driver.findElement(By.name("description")).sendKeys("Testing Selenium");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("GetLead24@gmail.com");
				new Select(driver.findElement(By.name("generalStateProvinceGeoId"))).selectByVisibleText("New York");
				driver.findElement(By.name("submitButton")).click();
				
				//edit lead
				driver.findElement(By.linkText("Edit")).click();
				driver.findElement(By.name("description")).clear();
				driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Random important message");
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				
				//get title
				System.out.println(driver.getTitle());
				
				driver.close();
		
	}	

}
