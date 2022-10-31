package ABCD;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest3 
{
    /**
     * Rigorous Test :-)
     * 
     * 
     */
	
	@BeforeTest
	
	public void ServerConnection()
	{
		System.out.println("server connection made");
	}
	
	@AfterTest
	
	public void beforeTest()
	{
		System.out.println("clear cookies");
	}
	@Test
	
	public void carLoanlogin()
	{
		System.out.println("carLoanlogin");
	}
	
	@Test
	
	public void carLoanHomepage()
	{
		System.out.println("carLoanHomePage");
	}
	
	@Test
	
	public void carLoanlogout()
	{
		System.out.println("carLoanlogout");
	}
	@AfterMethod
	
	public void LoanSuccessful()
	{
		System.out.println("loan successful");
	}

}
