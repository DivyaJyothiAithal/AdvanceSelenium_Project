package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class advanceXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("(//input[@type='text' and @placeholder='Search for Products...'])[2]")).sendKeys("icecreams"+Keys.ENTER);
		
	    String price =	driver.findElement(By.xpath("//h3[text()='Frozen Dessert - Trixy Cheese Cake']/../../../..//span[text()='₹126']")).getText();
		System.out.println("Price of the product is : "+ price);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
