package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionSession extends Browser {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		ActionSession acts= new ActionSession();
		driver=acts.browserinvoke(driver);
		driver.get("https://www.espn.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	WebElement sport1=	driver.findElement(By.xpath("//li[@class='sports menu-cricket']/a"));
	
	Actions act= new Actions(driver);
		act.moveToElement(sport1).build().perform();
		Thread.sleep(8000);
		List<WebElement> Sublinks=driver.findElements(By.xpath("//li[@class='sub']/a"));
		for(WebElement link:Sublinks)
		{
			String linkname=link.getText();
			System.out.println(linkname);
			
		}
		}
		
		
		

	}

