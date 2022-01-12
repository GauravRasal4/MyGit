package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("good");
		System.out.println("User Y");
		System.out.println("Branch Develop 1");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}
}
