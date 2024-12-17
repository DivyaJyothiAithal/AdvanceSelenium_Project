package JavaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnScrollByToMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Flowers",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Images']")).click();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//div[contains(text(),'GlobalRose Fresh Red Roses - Perfect ...')]")).click();
				break;
			}
			catch(Exception e)
			{
				jse.executeScript("window.scrollBy(0,500);");
			}
		}
	
	Thread.sleep(3000);
	driver.quit();
	}

}
//https://www.countries-ofthe-world.com/flags-of-the-world.html 
