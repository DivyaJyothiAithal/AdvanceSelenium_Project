package TestNgPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class toLearnPriorityMethods {
	@Test(priority = 1)
	public void CreateAccount()
	{
		
		Reporter.log("Account Created", true);
	}
	
	@Test(priority = 2)
	public void editAccount()
	{
		
		Reporter.log("Account edited", true);
	}
	@Test(priority = 3)
	public void deleteAccount()
	{
	
		Reporter.log("Account deleted", true);
	}
}
