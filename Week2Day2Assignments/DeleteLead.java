package Week2Day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();

			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.partialLinkText("Create")).click();
			driver.findElement(By.xpath("//input[contains(@id,'LeadForm_firstName')]")).sendKeys("GetLead28");
			driver.findElement(By.xpath("//input[contains(@id,'LeadForm_lastName')]")).sendKeys("GetLastname27");
			driver.findElement(By.xpath("//input[contains(@id,'LeadForm_companyName')]")).sendKeys("TestLeaf Pvt Ltd");
			driver.findElement(By.name("submitButton")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			WebElement lead1 = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a"));
			String getLeadID = lead1.getText();
			System.out.println("Lead ID in first row is "+getLeadID);
			lead1.click();
			driver.findElement(By.className("subMenuButtonDangerous")).click();
			
					driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
					driver.findElement(By.name("id")).sendKeys(getLeadID);
					driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
					String acutalText = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
					System.out.println("Actual Text in the page is "+acutalText);
					
					if(acutalText.equals("No records to display"))
						System.out.println("lead id Deleted successfully");
					else
						System.out.println("lead id not deleted");
					
					driver.close();

	}
}
