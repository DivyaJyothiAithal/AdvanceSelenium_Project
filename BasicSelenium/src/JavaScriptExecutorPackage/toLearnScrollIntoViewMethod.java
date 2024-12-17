package JavaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnScrollIntoViewMethod {

	public static void main(String[] args) throws InterruptedException {
		/*
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		WebElement indianFlag = driver.findElement(By.xpath("//div[text()='India']"));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", indianFlag);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView(false)", indianFlag);
		
		
		*/
		//Assignment
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
//https://www.worldometers.info/geography/flags-of-the-world/ 
//https://www.countries-ofthe-world.com/flags-of-the-world.html