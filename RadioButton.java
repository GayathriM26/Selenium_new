package Week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement brw = driver.findElement(By.xpath("//label[text()='Chrome']"));
		brw.click();
		String bname = brw.getText();
		System.out.println("Browser selected is : "+bname);
		WebElement city = driver.findElement(By.xpath("//label[text()='Chennai']"));
		city.click();
		WebElement unselrad = driver.findElement(By.xpath("//label[text()='Chennai']"));
	unselrad.isSelected();
		Boolean b = unselrad.isSelected();
		System.out.println(b);
		WebElement defbrw = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		String db = defbrw.getText();
		System.out.println("The default select radio button is : " +db);
		 WebElement agegroup = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet'])[2]"));
			Boolean bw = agegroup.isSelected();
			System.out.println(bw);
			Thread.sleep(2000);
		    if(b==false)
				System.out.println("Age group radio button is already selected");
				else
			{
				driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet'])[2]")).click();
			}
		    Thread.sleep(1000);
			driver.close();
		
		

	}

}
