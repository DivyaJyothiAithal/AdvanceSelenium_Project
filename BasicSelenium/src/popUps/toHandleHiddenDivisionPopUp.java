package popUps;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class toHandleHiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
	//Assignment
		 /* 
		   Scanner sc = new Scanner(System.in);
		  
		  int index=0;
		  String months[]=new String[] {"October","November","December","January","February","March","April","May","June","July","August","September"};
		
		System.out.println("Enter date: ");
		String date=sc.nextLine();
	
		System.out.println("Enter month: ");
		String month=sc.nextLine();
		
		for(int i=0;i<=11;i++)
		{
			if(months[i].equalsIgnoreCase(month))
			{
				index=i;
				break;
			}
		}
			
		System.out.println("Enter year: ");
		String year=sc.nextLine();
		
		Thread.sleep(2000);
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox dates inactiveWidget')]")).click();
		
	for(int i=0;i<index;i++)
		 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			
	driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();	
	*/
	
		/*
	//using try...catch
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.makemytrip.com/");
	
	driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	
	driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox dates inactiveWidget')]")).click();
	
	for(;;)
	{
		try {
			driver.findElement(By.xpath("//div[text()='February 2025']/../..//p[text()='14']")).click();	
			break;
			
		}
	catch(Exception e)
	{
		 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	}
	}
*/
		//Avoiding Notification popup
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.xpath("//input[@id='ddate']")).click();
			
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//div[contains(text(),'Aug 2025')]/../..//li[@id='trd_5_15/08/2025']")).click();
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
			}
		}
		
	Thread.sleep(5000);
	driver.quit();
	}

}
//do{}while(driver.findElement(By.xpath("//div[text()='February 2025']"))!=null);

//driver.get("https://www.skyscanner.co.in/");
//driver.findElement(By.xpath("//button[@aria-label='Select departure date']")).click();	