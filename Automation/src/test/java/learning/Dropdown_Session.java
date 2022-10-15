package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Session {

	public static void main(String[] args) {
		WebDriver driver=WebDriverManager.chromedriver().create();
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(false);
		//WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		//static dropdown using select
		Select dropDown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		/*List<WebElement> list = dropDown.getOptions();
		for(WebElement li : list)
		{
			String name = li.getText();
			System.out.println(name);
		}*/
		
		
		dropDown.selectByIndex(3);
		Thread.sleep(10000);
		dropDown.selectByValue("INR");
		
		// auto suggestive drop-down
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(10000);
		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for(WebElement option : options)
		{
			String country = option.getText();
			System.out.println(country);
			if(country.equalsIgnoreCase("India"))
					{
				option.click();
				Thread.sleep(10000);
					}
			
		}
		
		
	}
	}

}
