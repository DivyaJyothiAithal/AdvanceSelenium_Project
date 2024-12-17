package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClickMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
	
		Actions act=new Actions(driver);
		act.contextClick().perform();
		
		WebElement srchBtn=driver.findElement(By.id("APjFqb"));
		act.contextClick(srchBtn).perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
