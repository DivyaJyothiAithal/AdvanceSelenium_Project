package AdvanceSeleniumAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasketPrintbelow50rsGrapes {
// I ve made changes//pull
	//ok accepted//push
	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bigbasket.com/");
		
		driver.findElement(By.xpath("//input[@type=\"text\" and @class='flex-1 w-full leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700']")).sendKeys("Grapes");
		List<WebElement> listOfGrapes = driver.findElements(By.xpath("//div[@class='QuickSearch___StyledMenuItems-sc-rtz2vl-2 bZEDpn']//li//span[@class='Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU']"));
		
		for(WebElement Grapes:listOfGrapes)
		{
			System.out.println(Grapes.getText());

		}
		
		String rate;
		int price;
		List<WebElement> listOfGrapesRates = driver.findElements(By.xpath("//div[@class='QuickSearch___StyledMenuItems-sc-rtz2vl-2 bZEDpn']//li//span[@class=\"Label-sc-15v1nk5-0 QuickSearch___StyledLabel4-sc-rtz2vl-9 gJxZPQ gpRcpM\"]"));
		
		for(WebElement GrapesRate:listOfGrapesRates)
		{
			rate=GrapesRate.getText().substring(1);
			price=Integer.parseInt(rate);
		
			if(price<=50)
			{
				System.out.println();
			}

		}
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
