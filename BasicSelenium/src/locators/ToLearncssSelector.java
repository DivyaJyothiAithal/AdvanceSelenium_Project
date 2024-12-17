package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearncssSelector {

	public static void main(String[] args) throws InterruptedException {
	
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.id("small-searchterms")).sendKeys("Computers");// Always first search direct locators, if not go for cssSlector/xpath
			driver.findElement(By.cssSelector("input[value='Search']")).click();
			Thread.sleep(3000);
		
			driver.quit();
	}

}
