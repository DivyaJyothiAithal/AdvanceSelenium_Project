package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toCaptureMessage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/jewelry");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Black & White Diamond Heart")).click();
		driver.findElement(By.id("add-to-cart-button-14")).click();
		Thread.sleep(2000);
		String confmsg=driver.findElement(By.xpath("//p[@class='content']")).getText();
		System.out.println(confmsg);
		Thread.sleep(4000);
		driver.quit();
	}

}

