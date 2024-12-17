package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.shoppersstack.com/products_page/18");
		driver.manage().window().maximize();
		
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		
		String ParentID=driver.getWindowHandle();
		
		Set<String> windowhandles=driver.getWindowHandles();
		windowhandles.remove(ParentID);
		Thread.sleep(2000);
		for(String WinHandle:windowhandles)
		{
		driver.switchTo().window(WinHandle);
		driver.close();
		Thread.sleep(2000);
		}

		Thread.sleep(2000);
		
		driver.quit();
	}

}
