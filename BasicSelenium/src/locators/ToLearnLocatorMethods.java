package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLocatorMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(20000);
		
	WebElement findelem=driver.findElement(By.id("small-searchterms"));
findelem.sendKeys("Books");

Thread.sleep(3000);
driver.quit();
	}

}
