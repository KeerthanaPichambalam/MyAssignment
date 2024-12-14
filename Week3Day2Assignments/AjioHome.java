package Week3Day2Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioHome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		//select men and fashion bags checkbox and get the no. of items 
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='Men']/following::label")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[contains(@aria-label, 'Items Found')]")).getText();
		System.out.println(text);
		
		//get list of brands and print
		List<WebElement> Brands = driver.findElements(By.xpath("//div[@class='brand']"));
		for(WebElement ele:Brands) {
			System.out.print(ele.getText()+" ");
		}
		System.out.println();
		//get list of bag names and print
				List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
				for(WebElement bag:bagNames) {
					System.out.print(bag.getText()+" ");
				}


	}

}