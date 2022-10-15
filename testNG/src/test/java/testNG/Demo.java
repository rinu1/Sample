package testNG;

import org.testng.annotations.Test;

public class Demo {
	@Test(enabled=false)
	public void firstTest()
	{
		System.out.println("Hello");
	}
	@Test
	public void secondTest()
	{
		System.out.println("Bye");
	}

}
