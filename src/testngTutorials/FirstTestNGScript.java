package testngTutorials;

import org.testng.annotations.Test;
pushing error

public class FirstTestNGScript {
	
	@Test(priority = 1, description = "this test is for login")
	public void loginApplication()
	{
		System.out.println("First Test nu testNG");
		
	}
	@Test(priority = 2)
	public void selectItems()
	{
		System.out.println("select Items");
		
	}
	@Test(priority = 3)
	public void checkOut()
	{
		System.out.println("scheckout");
		
	}


}
