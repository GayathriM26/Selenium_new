package Week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) throws Throwable {
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.partialLinkText("CRM/SFA")).click();
	 driver.findElement(By.partialLinkText("Create Lead")).click();
	 WebElement company=driver.findElement(By.xpath("(//input[@id='createLeadForm_companyName'])"));
	 company.sendKeys("ABCLimited");
	WebElement input=driver.findElement(By.xpath("(//input[@id='createLeadForm_firstName'])"));
	//input=driver.sendKeys("Keerthika");
	input.sendKeys("Keerthika");
	WebElement lstname=driver.findElement(By.xpath("(//input[@id='createLeadForm_lastName'] )"));
	lstname.sendKeys("Vel");
	WebElement fistlocal=driver.findElement(By.xpath("(//input[@id='createLeadForm_firstNameLocal'] )"));
	fistlocal.sendKeys("Keerthu");
	driver.findElement(By.name("departmentName")).sendKeys("ComputerScience");
	driver.findElement(By.name("description")).sendKeys("editlead assignment");
	Thread.sleep(3000);
	driver.findElement(By.name("primaryEmail")).sendKeys("keerthika@gmail.com");
	WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
	Select ob= new Select(state);
	ob.selectByVisibleText("Indiana");
	Thread.sleep(2000);
	driver.findElement(By.name("submitButton")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Edit")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("cleared and save");
	driver.findElement(By.name("submitButton")).click();
String title=driver.findElement(By.id("viewLead_companyName_sp")).getText();
System.out.println("The company name is "+ title);

Thread.sleep(2000);

driver.close();	
	
	
}
	
}
