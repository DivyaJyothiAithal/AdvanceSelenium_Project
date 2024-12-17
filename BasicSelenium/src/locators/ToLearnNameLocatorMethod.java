package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNameLocatorMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(20000);
		
	WebElement findelem=driver.findElement(By.id("FirstName"));
findelem.sendKeys("Divya Jyothi");

driver.findElement(By.id("LastName")).sendKeys(" ");

driver.findElement(By.id("Email")).sendKeys("DJ@gmail.com ");

driver.findElement(By.id("Company")).sendKeys("Google ");

Thread.sleep(3000);
driver.quit();

	}

}
