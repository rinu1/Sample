package learning;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public WebDriver driver;
	
	
	public WebDriver browserinvoke(WebDriver driver)
	{
		this.driver=driver;
		driver=WebDriverManager.chromedriver().create();
		return driver;
		
	}
		
		

	}


