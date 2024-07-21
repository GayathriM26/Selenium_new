package Week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		// driver.findElement(By.pa
				 driver.findElement(By.partialLinkText("Leads")).click();
		 driver.findElement(By.partialLinkText("Find Leads")).click();
		 driver.findElement(By.partialLinkText("Phone")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.name("phoneNumber")).sendKeys("99");
		 Thread.sleep(1000);
		 driver.findElement(By.partialLinkText("Find Leads")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.partialLinkText("10113")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.partialLinkText("Delete")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.partialLinkText("Find Leads")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.name("id")).sendKeys("10113");
		 Thread.sleep(1000);
		 driver.findElement(By.partialLinkText("Find Leads")).click();
		 Thread.sleep(3000);
		 driver.close();
		 
		 
		 
		 
		 
	}
}