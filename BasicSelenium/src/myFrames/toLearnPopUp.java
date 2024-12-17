package myFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class toLearnPopUp {

	public static void main(String[] args) throws InterruptedException{
		
		//ASSIGNMENT 1
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		/*
	     driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		 driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		  
		  
		 */
		
		//ASSIGNMENT 2
				
	    driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	    WebElement Myframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	    
		driver.switchTo().frame(Myframe);
	 
	   WebElement thrash = driver.findElement(By.id("trash"));
	   
	   WebElement imgPeaks = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	   WebElement imgChalet = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	   WebElement imgAscent = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	   WebElement imgKozi = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
	   
		Actions act=new Actions(driver); 
	
	   	act.dragAndDrop(imgPeaks, thrash).perform();
		Thread.sleep(1000);
		act.dragAndDrop(imgChalet, thrash).perform();
		Thread.sleep(1000);
		act.dragAndDrop(imgAscent, thrash).perform();
		Thread.sleep(1000);
		act.dragAndDrop(imgKozi, thrash).perform();
		
		
		 WebElement gallery1 = driver.findElement(By.xpath("//ul[@id='gallery']"));
		  
		  Thread.sleep(3000); 
		  act.dragAndDrop(imgPeaks, gallery1).perform();
		  Thread.sleep(1000); 
		  act.dragAndDrop(imgChalet, gallery1).perform();
		  Thread.sleep(1000); 
		  act.dragAndDrop(imgAscent, gallery1).perform();
		 Thread.sleep(1000);
		 act.dragAndDrop(imgKozi, gallery1).perform();
		
		 Thread.sleep(3000);
		 driver.quit();
	}

}
