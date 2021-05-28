package MyProject.TestCases.TestCasesForWeb;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import MyProject.TestCases.Pages.LoginPage;

public class ValidLoginCredentials {
	LoginPage loginpage;
	@BeforeClass
	@Parameters({"Browser"})
	public void Init(String Br)
	{
		loginpage=new LoginPage(Br);
		
	}
	
	@Test(priority=1)
	public void TestLoginWithValidCrdentials()
	{
		
		loginpage.DoLogin("Admin", "admin123");
		
	}
}
