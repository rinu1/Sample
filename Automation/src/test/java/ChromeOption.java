import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import learning.Browser;

public class ChromeOption extends Browser{
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
	ChromeOption co=new ChromeOption();
	driver=co.browserinvoke(driver);
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--incognito");
	option.addArguments("headless");
	option.addArguments("start-maximized");
	option.addArguments("-disable-notifications");
	driver.get("https://www.espn.in/cricket/");
	
	Thread.sleep(7000);
		
	}

}
