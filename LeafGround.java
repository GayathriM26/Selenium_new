package Week1.day1;

import java.time.Duration;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String Title= driver.getTitle();
		System.out.println("The Title is "+  Title);
		driver.navigate().back();
		Boolean disablebtn = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if(disablebtn==true)
		{
			System.out.println("Button is disabled : "+disablebtn);
		}
		WebElement p = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		Point po = p.getLocation();
		System.out.println("The position of submit button are : "+po);

		WebElement save = driver.findElement(By.xpath("//span[text()='Save']"));	
		String bgc = save.getCssValue("background-color");
		String bgch = Color.fromString(bgc).asHex();
		System.out.println("The Background color of Save button is : "+bgch);
		WebElement submitbtn = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		int sbtn_Height = submitbtn.getSize().getHeight();
		int sbtn_Weight = submitbtn.getSize().getWidth();
		System.out.println("The Height of the Submit button is : "+sbtn_Height);
		System.out.println("The Width of the Submit button is : "+sbtn_Weight);
		Thread.sleep(1000);
		driver.close();

	}

}
