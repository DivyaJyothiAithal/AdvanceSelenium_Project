package TestNgPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class myPracticeTestNg {
	WebDriver driver;
	@BeforeSuite
	public void methodOne()
	{
		Reporter.log("Database connectivity established",true);
		
	}
	@BeforeClass
	public void methodTwo()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Reporter.log("Launch successful",true);
	}
@BeforeMethod 
	public void methodThree()
	{
	Reporter.log("Method Execution started",true);
	}

@AfterMethod
	public void methodFour()
	{
		Reporter.log("Method Ended started",true);
	}
@Test(priority=5, invocationCount = 2)
	public void methodFive()
	{
	Reporter.log("Method Five started",true);
	}
@Test(priority=4, dependsOnMethods = {"methodEight","methodSeven"})
	public void methodSix()
	{
	Reporter.log("Method Six started",true);
	}
@Test(enabled = true)
	public void methodSeven()
	{
	Reporter.log("Method Seven started",true);
	}
@Test	(priority = 3,threadPoolSize = 3)
	public void methodEight()
	{
	Reporter.log("Method Eight started",true);
	}

@AfterClass
	public void methodNine() throws InterruptedException
	{
	Reporter.log("Driver disconnected",true);
	Thread.sleep(5000);
	//driver.close();
	driver.quit();
	
	}
@AfterSuite
	public void methodTen()
	{
		Reporter.log("Database connectivity disconnected",true);
	}


}
