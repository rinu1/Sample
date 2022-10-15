package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicsLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=WebDriverManager.chromedriver().create();
	
driver.get("https://phptravels.com/demo/");
Thread.sleep(1000);
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Rinu");
{
	
	driver = WebDriverManager.chromedriver().create();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("msdd")).click();
	Thread.sleep(10000);
	List<WebElement> lists = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li/a"));
	int count = lists.size();
	System.out.println(count);
	for(WebElement list : lists)
	{
		String name = list.getText();
		System.out.println(name);
		if(name.contentEquals("English"))
		{
			list.click();
			Thread.sleep(10000);
		}
	}
}


	}

}
