package JavaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnHiddenDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		///*     Hidden Element
		driver.get("https://www.facebook.com/r.php");
		WebElement hidden=driver.findElement(By.id("custom_gender"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='My choice'",hidden);
    	//*/
		/*
//Disabled element
		driver.get("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");
		driver.findElement(By.linkText("jdk-23.0.1_doc-all.zip")).click();
		WebElement disabledElement=driver.findElement(By.linkText("Download jdk-23.0.1_doc-all.zip"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",disabledElement);
		*/
		
	}

}
