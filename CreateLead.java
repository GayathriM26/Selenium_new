package Week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public static void main(String[] args) throws Throwable {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 driver.findElement(By.partialLinkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TESTK");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("APPROVVE");
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("LEAD");
		 driver.findElement(By.name("submitButton")).click();
		 Thread.sleep(3000);
		 String compname= driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println("The Title is "+ compname);
		 Thread.sleep(3000);
		driver.close();
	}
}
