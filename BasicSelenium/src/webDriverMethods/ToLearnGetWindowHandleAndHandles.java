package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandleAndHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.shoppersstack.com/products_page/18");
		driver.manage().window().maximize();
		
		Thread.sleep(30000);
		//driver.navigate().to(new URL("https://www.amazon.in/"));//throws  MalformedURLException
		
		driver.findElement(By.id("compare")).click();
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
