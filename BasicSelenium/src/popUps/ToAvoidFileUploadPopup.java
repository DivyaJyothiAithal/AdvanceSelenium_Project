package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAvoidFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		//here  if we didnt upload file using button  then after registering a popup window will come giving
		//us option to upload
		
		// but here we dont click on button .... and before popup comes only we r uploading file
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).sendKeys("C:\\Users\\Divya Jyothi\\OneDrive\\Desktop\\Qspiders\\Payment Reciept_1.pdf");
		
		Thread.sleep(10000);
		driver.quit();
		
	}

}
