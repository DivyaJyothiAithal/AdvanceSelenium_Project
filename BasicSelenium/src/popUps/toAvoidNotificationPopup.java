package popUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class toAvoidNotificationPopup {

	public static void main(String[] args) {
// here we avoid Notification popup before even launching the browser
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--disable-notifications");
		
		//settings.addArguments("--incognito"); // may or may not work

		WebDriver driver =new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.easemytrip.com/");

	}

}
