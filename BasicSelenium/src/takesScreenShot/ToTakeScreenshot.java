package takesScreenShot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		/*
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		TakesScreenshot tks= (TakesScreenshot) driver;
		File temp=tks.getScreenshotAs(OutputType.FILE);
		File permanent=new File("./errorShots/youtube1.png");
		FileHandler.copy(temp, permanent);
		*/
		//Assignment Amazon HomePage ScreenShot
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		TakesScreenshot tks= (TakesScreenshot) driver;
		File temp=tks.getScreenshotAs(OutputType.FILE);
		File permanent=new File("./errorShots/Amazon.png");
		FileHandler.copy(temp, permanent);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
