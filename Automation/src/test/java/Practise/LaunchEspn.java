package Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import learning.Browser;

public class LaunchEspn extends Browser {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
	LaunchEspn le=new LaunchEspn();
	driver=le.browserinvoke(driver);
	driver.get("https://www.espn.in/cricket/");
	driver.manage().window().maximize();
	le.Articles();
	}

public void Articles() throws InterruptedException, AWTException
	{
	List<WebElement>links=driver.findElements(By.xpath("//section[@id='news-feed']/article/section/a"));
	System.out.println(links.size());
	for(WebElement link:links)
	{
		String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);

	//	String url=driver.getCurrentUrl();
	//	r.keyRelease(KeyEvent.VK_CONTROL);
		String url=link.getAttribute("href");
		link.sendKeys(url);
		System.out.println(url);
		driver.navigate().back();
	
		//espn-5links each should open in new tab
			}
	}

}
