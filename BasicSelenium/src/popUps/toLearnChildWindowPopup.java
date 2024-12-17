package popUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'iQOO Z9x 5G (Storm Grey, 4GB RAM, 128GB Storage)')]")).click();
	
		String parent=driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
	    allWindow.remove(parent);
	    
	    for(String childWindow:allWindow)
	    {
	    	driver.switchTo().window(childWindow);
	    }
	    String price=driver.findElement(By.xpath("//span[contains(@class,'reinventPricePriceToPayMargin ')]")).getText();
	    System.out.println(price);
	    
	    driver.close();
	    driver.switchTo().window(parent);
	    driver.close();
	}

}
