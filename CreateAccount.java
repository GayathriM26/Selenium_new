package Week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 driver.findElement(By.partialLinkText("Create Account")).click();
		 driver.findElement(By.id("accountName")).sendKeys("TESTAPPROVE1");
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 WebElement Industry= driver.findElement(By.name("industryEnumId"));
		 Select ob=new Select(Industry);
		 ob.selectByIndex(3);
		 WebElement ownerShip=driver.findElement(By.name("ownershipEnumId"));
		 Select ob1=new Select(ownerShip);
		 ob1.selectByVisibleText("S-Corporation");
		 WebElement source=driver.findElement(By.id("dataSourceId"));
		 Select ob2=new Select(source);
		 ob2.selectByValue("LEAD_EMPLOYEE");
		 WebElement market= driver.findElement(By.id("marketingCampaignId"));
		 Select ob3=new Select(market);
		 ob3.selectByIndex(6);
		 WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select ob4=new Select(state);
		 ob4.selectByValue("TX");
		 driver.findElement(By.className("smallSubmit")).click();
		 String ob5= driver.findElement(By.className("tabletext")).getText();
		 System.out.println(ob5);
		 Thread.sleep(1000);
		 driver.close();
		 
		 
		 
		
		
		
		

	}

}
