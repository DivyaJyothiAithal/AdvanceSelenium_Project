package autoSuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnautosuggestion {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
		List<WebElement> allSuggestions=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		
		for(WebElement suggestion : allSuggestions)
		{
			System.out.println(suggestion.getText());//sometimes we get : StaleElementReferenceException:
			
		}
		driver.quit();
	}

}


