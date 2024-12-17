package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class ToLearnXPath {

	public static void main(String[] args) throws InterruptedException {
	
		//5 TEST CASES
		WebDriver driver =new ChromeDriver();
		//WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//TESTCASE 1
		/*
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='search']")).sendKeys("DWAPARA");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'DWAPARA')]")).click();	
		Thread.sleep(50000);
		driver.quit();	
		*/
		
		//TESTCASE 2
		/*
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("dj_bairi@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("abcd");
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(5000);
		driver.quit();
		*/
		//TESTCASE 3
		/*
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcdf");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("abcdefghtj343"); 
		//Thread.sleep(30000);
		driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
		
		Thread.sleep(5000);
		driver.quit(); 
		*/
		
		//TESTCASE 4
		/*
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy')]")).click();
		
		Thread.sleep(3000);
		driver.quit(); 
		*/
		
		//TESTCASE 5
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.linkText("Black & White Diamond Heart")).click();
		driver.findElement(By.id("add-to-cart-button-14")).click();
	
		Thread.sleep(3000);
		driver.quit(); 
	}

}
