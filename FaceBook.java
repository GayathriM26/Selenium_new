package Week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class FaceBook {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.partialLinkText("Create new account")).click();
       // driver.findElement(By.id("u_3_b_Ss")).sendKeys("Tabrej");
		driver.findElement(By.name("firstname")).sendKeys("Kishaanth");
		driver.findElement(By.name("lastname")).sendKeys("Khan");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("Kishaanth.khan@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Kishaanth.khan@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Welcome123");
		Thread.sleep(1000);
		WebElement day= driver.findElement(By.id("day"));
		Select ob1= new Select(day);
		ob1.selectByIndex(5);
		Thread.sleep(1000);
		WebElement month=driver.findElement(By.id("month"));
		Select ob2=new Select(month);
		Thread.sleep(3000);
		ob2.selectByVisibleText("Aug");
		Thread.sleep(3000);
		WebElement year=driver.findElement(By.id("year"));
		Select ob3=new Select(year); 
		ob3.selectByValue("1999");
		//Thread.sleep(3000);
		//WebElement radio=driver.findElement(By.id("u_3_5_rG"));
		//radio.click();
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.close();
				
		
		
		
				
}
}
