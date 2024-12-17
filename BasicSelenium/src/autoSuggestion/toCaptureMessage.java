package autoSuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toCaptureMessage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.get("https://demowebshop.tricentis.com/black-white-diamond-heart");
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Jewelry")).click();
		driver.findElement(By.partialLinkText("Black & White Diamond Heart")).click();
		driver.findElement(By.id("add-to-wishlist-button-14")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='The product has been added to your ']")).getText());

		Thread.sleep(3000);
		driver.quit();
	}

}
