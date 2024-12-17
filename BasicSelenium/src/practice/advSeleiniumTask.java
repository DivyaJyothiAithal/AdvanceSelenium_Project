package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class advSeleiniumTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		//From
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//div[@id='react-autowhatever-1']/..//p[text()='Pune, India']")).click();
		
		//TO
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		driver.findElement(By.xpath("//div[@id='react-autowhatever-1']/..//p[text()='Bengaluru, India']")).click();
		
		//Departure
		driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox dates inactiveWidget')]")).click();
		driver.findElement(By.xpath("//div[text()='November 2024']/../..//p[text()='23']")).click();	
		
    	//Return
		driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox dates reDates inactiveWidget')]")).click();
		driver.findElement(By.xpath("//div[text()='December']/../..//p[text()='6']")).click();
		
		//travellers
		driver.findElement(By.xpath("//div[@data-cy='flightTraveller']")).click();
		
		//Adults
		driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
		
		//Children
		driver.findElement(By.xpath("//li[@data-cy='children-1']")).click();
		
		//infants
		driver.findElement(By.xpath("//li[@data-cy='infants-1']")).click();
		
		
		//Travel Class
		driver.findElement(By.xpath("//li[@data-cy='travelClass-3']")).click();
		
		
		//Apply button
		driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']")).click();
		
		
		//Search button
		driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBold widgetSearchBtn ')]")).click();
		
		//Price 
		List<WebElement> prices = driver.findElements(By.xpath("//p[@class='blackText fontSize16 blackFont']"));
	
		for(WebElement price :prices)
		{
			System.out.println("Price : "+ price.getText());
		}
		
		Thread.sleep(3000);
		driver.quit();
}
}
