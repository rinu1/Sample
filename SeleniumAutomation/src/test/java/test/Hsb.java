package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testNG.Browser;

public class Hsb extends Browser{
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Hsb hs=new Hsb();
        driver =hs.browserInvoke(driver);
        Thread.sleep(10000);
        System.out.println("Hello");
        hs.topEvents();
	}
	public void topEvents() throws InterruptedException
	{
				driver.get("https://www.espn.in/");
				Thread.sleep(10000);
				driver.manage().window().maximize();
			//	Actions act=Actions();
			//	act.moveToElement(null)
			
				
				
				
				
		List<WebElement> dropdownlinks=driver.findElements(By.xpath("//div[@data-behavior='button_dropdown']/button[@type='button']/ul"));
				for(WebElement league:dropdownlinks)
		{
			String link= league.getText();
			System.out.println(link);
			Thread.sleep(10000);
		}
	}

}
