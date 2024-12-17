package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class assignmentPrograms26Oct24 {

	public static void main(String[] args) throws IOException, InterruptedException {

////Assignment 1: add 3 products to woodenstreet.com
//		
//		ChromeOptions settings=new ChromeOptions();
//		settings.addArguments("--disable-notifications");
//		
//		//settings.addArguments("--incognito"); // may or may not work
//
//		WebDriver driver =new ChromeDriver(settings);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		driver.get("https://www.woodenstreet.com/");
//		
//		driver.findElement(By.id("search-user1")).sendKeys("home decor for wall");
//		driver.findElement(By.name("serach")).click();	
//		//product 1
//		driver.findElement(By.linkText("Abstract Butterfly Wall Decor")).click();
//		driver.findElement(By.id("button-cart-buy-now")).click();
//		driver.navigate().back();
//		//product 2
//		driver.findElement(By.linkText("Macrame Rope Plant Hanger For Home Decor Set Of 1")).click();
//		driver.findElement(By.id("button-cart-buy-now")).click();
//		driver.navigate().back();
//		
//		//product 3
//		driver.findElement(By.linkText("Decorative Butterfly Tree Wall Art")).click();
//		driver.findElement(By.id("button-cart-buy-now")).click();
//		//driver.navigate().back();
//		
//		String NumberOfItemsInCart=driver.findElement(By.id("cart-total")).getText();
//		System.out.println("Total number of Items in the Cart : "+ NumberOfItemsInCart);
		
		
		
//// Assignment 2: Automating Instagram login retrieving data from properties file
//
//		FileInputStream fis=new FileInputStream("C:\\Users\\Divya Jyothi\\OneDrive\\Desktop\\JAVA Selenium\\Selenium Notes_ AnjaliUnnikrishnan\\Documents\\InstaCredentialsExcel.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//	
//		Sheet sh=wb.getSheet("Facebook");
//		
//		Row r=sh.getRow(1);
//		
//		String url=r.getCell(0).getStringCellValue();
//		String uname=r.getCell(1).getStringCellValue();
//		String pwd=r.getCell(2).getStringCellValue();
//        wb.close();
//        
//        
//        String expectedLoginPage="Login • Instagram";
//		String expectedUsername=uname;
//		String expectedPassword=pwd;
//		
//		//Test Script
//		//Step 1: Launch the browser
//		WebDriver driver =new ChromeDriver();
//		System.out.println("Launch success");
//		
//		driver.manage().window().maximize();
//		System.out.println("maximize success");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		//step 2: enter url and verify
//		driver.get(url);
//		
//		String actualPageTitle=driver.getTitle();
//		if(expectedLoginPage.equals(actualPageTitle))
//		{
//			System.out.println("Insta login page success");
//		}
//		else
//		{
//			System.out.println("Insta login page not success");
//		}
//		
//		//Step 3: enter valid un and pwd
//			
//	WebElement username = driver.findElement(By.name("username"));
//	username.clear();
//	username.sendKeys(uname);
//	
//	String actualUN=username.getAttribute("value");
//	if(actualUN.equals(expectedUsername))
//	{
//		System.out.println("UserName success");
//	}
//	else
//	{
//		System.out.println("UserName not success");
//	}
//	
//		
//	WebElement password = driver.findElement(By.name("password"));
//	password.clear();
//	password.sendKeys(pwd);
//		
//		String actualPWD=password.getAttribute("value");
//		if(actualPWD.equals(expectedPassword))
//		{
//			System.out.println("Password success");
//		}
//		else
//		{
//			System.out.println("Password not success");
//		}
//		
//	
//        
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//       System.out.println("Login success");
//     
		
		
// Assignment 3: Automating Instagram login retrieving data from properties file
		FileInputStream fis=new FileInputStream("C:\\Users\\Divya Jyothi\\OneDrive\\Desktop\\JAVA Selenium\\Selenium Notes_ AnjaliUnnikrishnan\\Documents\\Instacredentials.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("URL");
		String uname=prop.getProperty("UNAME");
		String pwd=prop.getProperty("PWD");
		
		String expectedLoginPage="Login • Instagram";
		String expectedUsername=uname;
		String expectedPassword=pwd;

		//Test Script
		//Step 1: Launch the browser
		WebDriver driver =new ChromeDriver();
		System.out.println("Launch success");
		
		driver.manage().window().maximize();
		System.out.println("maximize success");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//step 2: enter url and verify
		driver.get(url);
		
		String actualPageTitle=driver.getTitle();
		if(expectedLoginPage.equals(actualPageTitle))
		{
			System.out.println("insta login page success");
		}
		else
		{
			System.out.println("insta login page not success");
		}
		
		//Step 3: enter valid un and pwd
			
	WebElement username = driver.findElement(By.name("username"));
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
	
		
	WebElement password = driver.findElement(By.name("password"));
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
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
			System.out.println("Login success");
		
		
		
       System.out.println("Closing the Browser success");
		Thread.sleep(2000);
		driver.quit();
	}

}
