package Week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
		driver.switchTo().alert().sendKeys("message");
		driver.switchTo().alert().dismiss();
		String test= driver.findElement(By.xpath("(//span[@id='confirm_result'])")).getText();
		System.out.println(test);
		

	}

}
