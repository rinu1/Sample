package learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 extends Browser{
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Assignment1 a=new Assignment1();
		driver=a.browserinvoke(driver);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys("CARROT");
		Thread.sleep(7000);
	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	//
	int count=1;
	for(int i=1;i<5;i++) 
	{
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	}
	count++;
	System.out.println("Carrot is Added 5 times");
	
	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10000));
	//wait.until(null)
	Thread.sleep(10000);
	}
}


