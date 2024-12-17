package locators;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManageMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.manage().window().minimize();
//		Thread.sleep(3000);
//		driver.manage().window().fullscreen();
		
		//getSize before maximize
		System.out.println(driver.manage().window().getSize().getHeight());		
		System.out.println(driver.manage().window().getSize().getWidth());
		
		
		//getSize after maximize
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize().getHeight());		
		System.out.println(driver.manage().window().getSize().getWidth());
		
		Thread.sleep(2000);
		//setSize
		driver.manage().window().setSize(new Dimension(300,300));
		//driver.manage().window().setSize(new Dimension(-300,300));//invalid Argument Exception....-300 is wrong
		
		//getPosition
		System.out.println("Position: "+driver.manage().window().getPosition());// depending on laptop configuration it will change
		System.out.println("Position X: "+driver.manage().window().getPosition().getX());
		System.out.println("Position Y: "+driver.manage().window().getPosition().getY());
		
		Thread.sleep(2000);
		//setPosition
		driver.manage().window().setPosition(new Point(-300,300));
	//	driver.manage().window().setPosition(new Point(10,300)); Can be any value
		
		
		
		
		
		Thread.sleep(30000);
		driver.quit();
	}

}
