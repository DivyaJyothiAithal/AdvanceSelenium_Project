package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/?hl=en");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcdf");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("abcdefghtj343"); 
		//Thread.sleep(30000);
		driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
		
		Thread.sleep(5000);
		driver.quit(); 

	}

}
