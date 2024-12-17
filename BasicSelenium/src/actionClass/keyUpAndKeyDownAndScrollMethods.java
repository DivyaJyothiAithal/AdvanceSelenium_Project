package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyUpAndKeyDownAndScrollMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//KeyUp KeyDown
		//WebElement srchTF=driver.findElement(By.id("small-searchterms"));
		//act.click(srchTF).keyDown(Keys.SHIFT).sendKeys("MOBILES").keyUp(Keys.SHIFT).perform();
		
		//Scroll
		WebElement customService=driver.findElement(By.xpath("//h3[text()='Customer service']"));
	    
		//Scroll up by Amount
		act.scrollByAmount(0, 200).perform();
		Thread.sleep(3000);
		
		//Scroll to Element
		act.scrollToElement(customService).perform();
		
		Thread.sleep(6000);
		driver.quit();
	}

}
