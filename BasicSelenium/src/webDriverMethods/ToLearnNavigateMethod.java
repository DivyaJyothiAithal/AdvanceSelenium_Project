package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigateMethod {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//driver.navigate().to(new URL("https://www.amazon.in/"));//throws  MalformedURLException
		
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/?hl=en");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(4000);
		driver.quit();

		
	}

}
