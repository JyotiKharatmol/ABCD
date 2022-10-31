package ABCD;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest2 
{
    
	@BeforeMethod
	
	public void homeLoanlogin()
	{
		System.out.println("homeLoanlogin");
	}
	@Test
	
	public void homeLoanlogout()
	{
		System.out.println("homeLoanlogout");
	}
	@Test
	public void homeLoanHomePage()
	{
		System.out.println("homeLoanHomePage");
	}

}
