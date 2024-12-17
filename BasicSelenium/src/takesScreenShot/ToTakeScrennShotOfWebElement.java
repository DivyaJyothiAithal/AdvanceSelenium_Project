package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScrennShotOfWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	/*
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);

		WebElement youtubeLogo=driver.findElement(By.id("logo-icon"));
		File temp=youtubeLogo.getScreenshotAs(OutputType.FILE);
		File permanent=new File("./errorShots/YouTubeLogo1.png");
		FileHandler.copy(temp, permanent);
		*/
		//Assignment udemy logo ScreenShot
		driver.get("https://www.udemy.com/");
		Thread.sleep(3000);

		WebElement UdemyLogo=driver.findElement(By.xpath("//a[contains(@class,'desktop-header_flex-middle__JjTaI')]"));
		File temp=UdemyLogo.getScreenshotAs(OutputType.FILE);
		File permanent=new File("./errorShots/UdemyLogo.png");
		FileHandler.copy(temp, permanent);
		
		Thread.sleep(3000);
		driver.quit();

		
	}

}
