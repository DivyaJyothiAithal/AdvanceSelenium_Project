package myFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnFrameMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.dream11.com/");
		/*
		 * driver.switchTo().frame(0);
		 * driver.findElement(By.id("regEmail")).sendKeys("986754321");
		 */

		/*
		 * driver.switchTo().frame("send-sms-iframe");
		 * driver.findElement(By.id("regEmail")).sendKeys("986754321");
		 */
		/*
		 * driver.switchTo().frame(driver.findElement(By.
		 * xpath("//iframe[@title=\"Iframe Example\"]")));
		 * driver.findElement(By.id("regEmail")).sendKeys("986754321");
		 */
		
		//switch inside frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("986754321");
		
		//switch outside frame ,  back to main page   else driver control will be inside frame and u wont be able to perform any actions on outer pages
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("About Us")).click();
		
	Thread.sleep(2000);
		driver.quit();
		
	}

}
