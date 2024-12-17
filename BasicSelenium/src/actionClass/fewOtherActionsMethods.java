package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fewOtherActionsMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		/*
		//TestCase:  Click And Hold
		//Navigate to sbi, enter pwd, click and hold
		//after 3 sec release
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin/");
		driver.findElement(By.id("password")).sendKeys("123456");
		Actions act=new Actions(driver);
				
		WebElement eyeIcon=driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		act.clickAndHold(eyeIcon).perform();
		Thread.sleep(3000);
//release
		act.release(eyeIcon);
		*/
		/*
		//Test case : mouse over
		driver.get("https://www.woodenstreet.com");
		WebElement matt=driver.findElement(By.linkText("Mattresses"));
		act.moveToElement(matt).perform();
		*/
		
		//test case
		//drag and drop
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement Norway= driver.findElement(By.id("box101"));
		WebElement SouthKorea = driver.findElement(By.id("box105"));
		WebElement UnitedSt = driver.findElement(By.id("box103"));
		
		WebElement Washington = driver.findElement(By.id("box3"));		
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement Oslo = driver.findElement(By.id("box1"));
		
		act.dragAndDrop(Seoul, SouthKorea).perform();
		Thread.sleep(2000);
		act.dragAndDrop(Washington, UnitedSt).perform();
		Thread.sleep(2000);
		act.dragAndDrop(Oslo, Norway).perform();
		
		Thread.sleep(3000);
		driver.quit();

		
		
		
	}

}
