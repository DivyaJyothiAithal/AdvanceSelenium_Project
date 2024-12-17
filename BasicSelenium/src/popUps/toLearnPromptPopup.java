package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnPromptPopup {

	public static void main(String[] args) throws InterruptedException{

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		 driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			driver.switchTo().alert().sendKeys("Divya Jyothi");
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
			Thread.sleep(3000);
			driver.quit();

	}

}
