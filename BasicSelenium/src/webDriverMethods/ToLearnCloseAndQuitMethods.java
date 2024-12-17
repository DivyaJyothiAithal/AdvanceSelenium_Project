package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCloseAndQuitMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/18");
		try {
			Thread.sleep(10000);
		
		driver.findElement(By.id("compare")).click();
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
