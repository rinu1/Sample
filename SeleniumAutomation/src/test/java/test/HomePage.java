package test;

import org.openqa.selenium.WebDriver;

import testNG.Browser;

public class HomePage extends Browser{
	public static WebDriver driver;

	public static void main(String[] args) {
	    HomePage ho=new HomePage();	
		driver=ho.browserInvoke(driver);

	}
	

}
