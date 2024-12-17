package testngpracticeprograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class toWriteATSofMTFacebook {

	public static void main(String[] args) throws IOException, InterruptedException {
		
				
		FileInputStream fis=new FileInputStream("C:\\Users\\Divya Jyothi\\OneDrive\\Desktop\\JAVA Selenium\\Selenium Notes_ AnjaliUnnikrishnan\\Documents\\FBcredentials.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("URL");
		String uname=prop.getProperty("UNAME");
		String pwd=prop.getProperty("PWD");
		
		String expectedLoginPage="Log in to Facebook";
		String expectedUsername=uname;
		String expectedPassword=pwd;
		
		//Test Script
		//Step 1: Launch the browser
		WebDriver driver =new EdgeDriver();
		System.out.println("Launch success");
		
		driver.manage().window().maximize();
		System.out.println("maximize success");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//step 2: enter url and verify
		driver.get(url);
		
		String actualPageTitle=driver.getTitle();
		if(actualPageTitle.equals(actualPageTitle))
		{
			System.out.println("Fb login page success");
		}
		else
		{
			System.out.println("Fb login page not success");
		}
		
		//Step 3: enter valid un and pwd
			
	WebElement username = driver.findElement(By.id("email"));
	username.clear();
	username.sendKeys(uname);
	
	String actualUN=username.getAttribute("value");
	if(actualUN.equals(expectedUsername))
	{
		System.out.println("UserName success");
	}
	else
	{
		System.out.println("UserName not success");
	}
	
		
	WebElement password = driver.findElement(By.id("pass"));
	password.clear();
	password.sendKeys(pwd);
		
		String actualPWD=password.getAttribute("value");
		if(actualPWD.equals(expectedPassword))
		{
			System.out.println("Password success");
		}
		else
		{
			System.out.println("Password not success");
		}
		
		String expectedHomePageTitle="(20+) Facebook";
		driver.findElement(By.id("loginbutton")).click();
		String actualHomepageTitle=driver.getTitle();
		if(actualHomepageTitle.equals(expectedHomePageTitle))
		{
			System.out.println("Login success");
		}
		else
		{
			System.out.println("Login not success // May be due to captcha page");
		}
		

		System.out.println("Closing the Browser success");
		Thread.sleep(20000);
		driver.quit();

	}

}
