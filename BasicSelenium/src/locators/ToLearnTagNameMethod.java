package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagNameMethod {

	public static void main(String[] args)  throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		System.out.println(driver.findElements(By.tagName("img")).size());
		System.out.println(driver.findElements(By.tagName("a")).size());
		Thread.sleep(3000);
	
		driver.quit();

	}

}
