package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;



public class practiceDJ {

	public static void main(String[] args) throws InterruptedException, IOException {
		//EdgeOptions settings=new EdgeOptions();
	//	settings.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		driver.get("https://demowebshop.tricentis.com/");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
	//	System.out.println(driver.getPageSource());
		
//		driver.manage().window().minimize();
//		Thread.sleep(1000);
//		
//		driver.manage().window().fullscreen();
//		Thread.sleep(1000);
//		
//		driver.manage().window().maximize();
//		
//		Dimension dimen=driver.manage().window().getSize();
//		Point pos=driver.manage().window().getPosition();
//		
//		System.out.println(dimen);
//		System.out.println(pos);
		
//		driver.manage().window().setSize(new Dimension(1000, 700));
//		driver.manage().window().setPosition(new Point(24,24));
		
//	driver.navigate().to("https://demowebshop.tricentis.com/books");
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().forward();
//		Thread.sleep(1000);
//		driver.navigate().refresh();

		//JavascriptExecutor		
		
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("scrollBy(0,50)");
//		Thread.sleep(1000);
//		jse.executeScript("scrollBy(0,50)");
//		Thread.sleep(1000);
//		jse.executeScript("scrollTo(0,700)");
//		WebElement element=driver.findElement(By.linkText("Sitemap"));
//		jse.executeScript("arguments[0].scrollIntoView(true);",element);
//		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");		
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");		
//		
//		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
//		WebElement ele=driver.findElement(By.id("custom_gender"));
//		//jse.executeScript("arguments[0].value='NaanuNaane'", ele);
//		jse.executeScript("arguments[0].value=arguments[1]", ele,"NaanuNaane");
//		String arg="https://demowebshop.tricentis.com/books";
//		jse.executeScript("window.location=arguments[0]", arg);
//		
//		//Disabled element
//				driver.get("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");
//				driver.findElement(By.linkText("jdk-23.0.1_doc-all.zip")).click();
//				WebElement disabledElement=driver.findElement(By.linkText("Download jdk-23.0.1_doc-all.zip"));
//				JavascriptExecutor jse=(JavascriptExecutor)driver;
//				jse.executeScript("arguments[0].click()",disabledElement);

//		//refresh
//		Thread.sleep(3000);
//		jse.executeScript("history.go()");
		
		//TakeScreenShot
		
//TakesScreenshot tks=(TakesScreenshot)driver;
//File temp=tks.getScreenshotAs(OutputType.FILE);
//File perm=new File("./screenshots/pageSS.png");
//FileHandler.copy(temp, perm);
//
//WebElement we=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
//TakesScreenshot tkswe=(TakesScreenshot)we;
//File logotemp=tkswe.getScreenshotAs(OutputType.FILE);
//File logoPerm=new File("./screenshots/weSS.png");
//FileHandler.copy(logotemp, logoPerm);
//		
		
//	//Frames
//		driver.get("https://www.dream11.com/");
//		Thread.sleep(1000);
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("regEmail")).sendKeys("1234567890");
//		Thread.sleep(1000);
//		driver.switchTo().parentFrame();
//		Thread.sleep(1000);
//		driver.switchTo().frame("send-sms-iframe");
//		driver.findElement(By.id("regEmail")).sendKeys("7890567890");
//		Thread.sleep(1000);
//	 driver.switchTo().defaultContent();
//	 Thread.sleep(1000);
//	 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));
//		driver.findElement(By.id("regEmail")).sendKeys("098765443212");
//	 Thread.sleep(1000);
//	 driver.switchTo().defaultContent();
	
		
		//DataDrivenTesting
//		driver.get("https://www.facebook.com/login.php/");
//		FileInputStream fis=new FileInputStream("C:\\Users\\Divya Jyothi\\OneDrive\\Desktop\\JAVA Selenium\\Selenium Notes_ AnjaliUnnikrishnan\\Documents\\practiceProperty.properties");
//		Properties prop=new Properties();
//		prop.load(fis);
//		String unFB=prop.getProperty("un");
//		String pwdFB=prop.getProperty("pwd");
//		String unInsta=prop.getProperty("un2");
//		String pwdinsta=prop.getProperty("pwd2");
//		
//		driver.findElement(By.id("email")).sendKeys(unFB);
//		driver.findElement(By.id("pass")).sendKeys(pwdFB);
//		driver.findElement(By.id("loginbutton")).click();
//		Thread.sleep(3000);
//		driver.navigate().to("https://www.instagram.com/accounts/login/");
//		driver.findElement(By.name("username")).sendKeys(unInsta);
//		driver.findElement(By.name("password")).sendKeys(pwdinsta);
//		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	
		//excel
		
//		driver.get("https://www.facebook.com/login.php/");
//		FileInputStream fis=new FileInputStream("C:\\Users\\Divya Jyothi\\OneDrive\\Desktop\\JAVA Selenium\\Selenium Notes_ AnjaliUnnikrishnan\\Documents\\PracticeCredentials.xlsx");
//		
//		Workbook wb=WorkbookFactory.create(fis);
//		String unFB=wb.getSheet("DJCredentials").getRow(1).getCell(0).toString();
//		String pwdFB=wb.getSheet("DJCredentials").getRow(1).getCell(1).getStringCellValue();
//		String unInsta=wb.getSheet("DJCredentials").getRow(2).getCell(0).getStringCellValue();
//		String pwdinsta=wb.getSheet("DJCredentials").getRow(2).getCell(1).toString();
//		
//		driver.findElement(By.id("email")).sendKeys(unFB);
//		driver.findElement(By.id("pass")).sendKeys(pwdFB);
//		driver.findElement(By.id("loginbutton")).click();
//		Thread.sleep(3000);
//		driver.navigate().to("https://www.instagram.com/accounts/login/");
//		driver.findElement(By.name("username")).sendKeys(unInsta);
//		driver.findElement(By.name("password")).sendKeys(pwdinsta);
//		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
		
		
		
		//Popups
		
		//driver.get("https://www.easemytrip.com/");
		
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		
Actions act=new Actions(driver);
//         driver.findElement(By.xpath("//span[contains(text(),'Redmi Note 13 5G (Arctic White')]")).click();
//	
//		
//		String parent = driver.getWindowHandle();
//		Set<String> children = driver.getWindowHandles();
//		children.remove(parent);
//		Thread.sleep(1000);
//		driver.switchTo().window(parent);
//		Thread.sleep(1000);
//	
//	
//		for(String child : children)
//		{	driver.switchTo().window(child);
//		driver.close();
//		}
//		Thread.sleep(1000);
//		driver.switchTo().window(parent);
//		driver.close();
//		
		
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		
//		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		driver.findElement(By.xpath("//div[@class='textWrap']")).click();
//		//p[contains(text(),'I have work experience')]
//		driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).sendKeys("C:\\Users\\Divya Jyothi\\OneDrive\\Desktop\\Qspiders\\Payment Reciept_2.pdf");
//		System.out.println("Uploaded");

//Calendar
//driver.get("https://www.makemytrip.com/");
//driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
//driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']")).click();
//while(true)
//{
//try {
//	driver.findElement(By.xpath("//div[text()='February 2025']/../..//p[text()='28']")).click();
//	break;
//}
//catch(Exception ex)
//{
//	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//}
//}


//AutoSuggestions

//driver.get("https://www.amazon.in/");
//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
//List<WebElement> options = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
//
//for(WebElement option:options)
//{
//	//aria-label="mobiles 5+g"
//	System.out.println(option.getText());
//	if(option.getText().equals("books under 100"))
//			option.click();
//	else
//		System.out.println("no match");
//}

		
		
		
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
		
		

	}

}
