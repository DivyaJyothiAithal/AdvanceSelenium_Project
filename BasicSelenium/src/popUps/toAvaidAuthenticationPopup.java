package popUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class toAvaidAuthenticationPopup {

	public static void main(String[] args) {
	
		// here we avoid Authintication popup even before it appears

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
