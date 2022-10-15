package learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightE2E {
	public static WebDriver driver;
	static String Place1="Bengaluru (BLR)";
	static String Place2="Chennai (MAA)";
	public static void dropdown(String City) throws InterruptedException
	{
		
	List<WebElement> Place=driver.findElements(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
    for(WebElement place2:Place)
     {
    String place=place2.getText();
    if(place.equalsIgnoreCase(City)) {
	place2.click();
	Thread.sleep(4000);
}
}
}

	public static void main(String[] args) throws InterruptedException {
		driver=WebDriverManager.chromedriver().create();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	    Thread.sleep(2000);
	
		//Autosuggest Country
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[2]/a")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(10000);
		dropdown(Place1);
		Thread.sleep(10000);
		dropdown(Place2);
		
		String s= new String();
		s="karti";
		

}}
