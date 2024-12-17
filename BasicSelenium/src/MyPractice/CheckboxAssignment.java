package MyPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Thread.sleep(2000);
		int totNum=driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println("Tot num of Checkboxes: "+totNum);
		driver.quit();
}
}
