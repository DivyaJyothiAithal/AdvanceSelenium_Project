package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathBySurrounding {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		//WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		
		//TestCase1
		/*
		driver.get("https://www.amazon.in/s?k=pots&crid=35N2GZHC0UZUN&sprefix=pots%2Caps%2C220&ref=nb_sb_noss_1");
		//add code to search for pots  here and change get("amazon.in)
		driver.findElement(By.xpath("//span[contains(text(),'Nurturing Green® Set of 3 Ivory')]/../../../..//button[contains(text(),'Add to cart')]")).click();
		*/
	//Test case 2	
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//label[contains(text(),'Good')]/..//input[@id='pollanswers-2']")).click();
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		Thread.sleep(2000);
		String msg=driver.findElement(By.xpath("//div[contains(text(),'Only registered users can vote.')]")).getText();
	  System.out.println("\n"+msg);
		
		//Test Case 3
		/*
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.xpath("//input[@id='ddate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Nov 2024')]/../..//li[@id='fiv_0_24/11/2024']")).click();*/
		Thread.sleep(5000);
		driver.quit();
	}
}
