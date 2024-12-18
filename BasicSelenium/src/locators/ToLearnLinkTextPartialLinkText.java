package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLinkTextPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Computers")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
