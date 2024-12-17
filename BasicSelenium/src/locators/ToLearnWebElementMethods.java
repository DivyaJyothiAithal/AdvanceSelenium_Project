package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Rectangle;

public class ToLearnWebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//Test case of 30 sept
		
		driver.get("https://demo.vtiger.com/vtigercrm/ ");
		
		//clear()
		WebElement userTF=driver.findElement(By.id("username"));
		userTF.clear();
		
		//sendkeys()
		userTF.sendKeys("Divya");
		WebElement pwdTF=driver.findElement(By.id("password"));
		pwdTF.clear();
		pwdTF.sendKeys("123456789");
		Thread.sleep(3000);		
		
		//submit()
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		
		//Test cases of 01 Oct 2024
		/*
		driver.get("https://www.actitime.com/");
		WebElement tryFreeButton=driver.findElement(By.linkText("Try Free"));
		
		//getText()
		System.out.println("Text of the button: "+tryFreeButton.getText());
		
		//getAttribute()
		System.out.println("Attribute value: "+tryFreeButton.getAttribute("href"));
		
		//getTagname()
		System.out.println("Tagname: "+tryFreeButton.getTagName());
		
		//getcssValue()
		String bgColor=tryFreeButton.getCssValue("background-color");
		String fgColor=tryFreeButton.getCssValue("color");
		String cursor=tryFreeButton.getCssValue("cursor");
		
		System.out.println("Background color: "+bgColor);
		System.out.println("Foreground color: "+fgColor);
		System.out.println("Cursor: "+cursor);

		//getSize()
		Dimension btnSize=tryFreeButton.getSize();
		System.out.println("Dimension: "+btnSize);
		System.out.println("Height: "+btnSize.getHeight());
		System.out.println("Width: "+btnSize.getWidth());
		
		//getLocation()
		Point btnposition=tryFreeButton.getLocation();
		System.out.println("Location : "+btnposition);
		System.out.println("Location X : "+ btnposition.getX());
		System.out.println("Location Y : "+btnposition.getY());
		
		//getRect()
         Rectangle btnSizePos=tryFreeButton.getRect();
         System.out.println("Dimension: "+btnSizePos.getDimension());
 		System.out.println("Height: "+btnSizePos.getHeight());
 		System.out.println("Width: "+btnSizePos.getWidth());
		
 		System.out.println("Location : "+btnSizePos.getPoint());
		System.out.println("Location X : "+ btnSizePos.getX());
		System.out.println("Location Y : "+btnSizePos.getY());
		*/
		
		//Assignment
	/*	driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(5000);
		//<a href="/register" class="ico-register">Register</a>
		WebElement registerButton=driver.findElement(By.linkText("Register"));
		System.out.println("Backgrouond color : "+ registerButton.getCssValue("background"));
		System.out.println("Foregrouond color : "+ registerButton.getCssValue("color"));
		*/
		Thread.sleep(1000);
		driver.quit();
	}

}
