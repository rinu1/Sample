package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EspnLaunch {

	public static void main(String[] args) {
		WebDriver driver=WebDriverManager.chromedriver().create();
driver.get("https://www.espn.in/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//div[@class=button-button-filter]")).click();

	}

}
