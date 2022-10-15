package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testNG.Browser;

public class Table extends Browser{
public static WebDriver driver;
		
		public void Tablepage()
		{
		driver.get("https://www.espn.in/cricket/table/series/19451/season/2022/icc-womens-t20-world-cup-qualifier");
		}
		public void Dropdown()
		{
		System.out.println("Leagues in Dropdown");
		List<WebElement> urls=driver.findElements(By.xpath("//tbody/tr/td/a[@name='&lpos=19451:standings:team']"));
		for(WebElement leagueurl:urls)
		{
			String name=leagueurl.getText();
			System.out.println(name);
		}
		}
		public void Tabledata() throws InterruptedException
		{
		List<WebElement> Team=driver.findElements(By.xpath("//thead[@class='standings-categories']/tr/th"));
		for(WebElement team:Team)
		{
			System.out.print(team.getText()+" ");
			Thread.sleep(500);
		}
				
		List<WebElement> TableTeam=driver.findElements(By.xpath("//tbody/tr[@class='standings-row']"));
		for(WebElement table:TableTeam)
		{
			String name=table.getText();
			System.out.println(name);
			Thread.sleep(1000);
			System.out.println();
		}
	 }
	}	