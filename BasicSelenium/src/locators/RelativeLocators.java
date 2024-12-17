package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchTF=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchTF.sendKeys("Books");
		WebElement searchBTN=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(searchTF));
		searchBTN.click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
