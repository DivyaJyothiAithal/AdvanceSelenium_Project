package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("https://www.shoppersstop.com/coverstory-printed-cotton-sweetheart-neck-womens-a-line-dress/p-A24COV7BC0102PI/colorChange/A24COV7BC0102PI_PINK?size=A24COV7BC0102PI004");
		driver.get("https://www.shoppersstack.com/products_page/18"); //org.openqa.selenium.ElementClickInterceptedException
		//driver.findElement(By.xpath("//input[@placeholder='Enter your PIN code']")).sendKeys("123456");
		//driver.findElement(By.xpath("//div[(text()='Check')]")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("123456");
		WebElement checkBtn=driver.findElement(By.id("Check"));
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
				
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		checkBtn.click();
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
