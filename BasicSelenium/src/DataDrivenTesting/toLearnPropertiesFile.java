package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnPropertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {

//
//FileInputStream fis=new FileInputStream("C:\Users\Divya Jyothi\OneDrive\Desktop\JAVA Selenium\Selenium Notes_ AnjaliUnnikrishnan\Documents\FBcredentials.properties");
//Properties prop=new Properties();
//prop.load(fis);
//String url=prop.getProperty("URL");
//String uname=prop.getProperty("UNAME");
//String pwd=prop.getProperty("PWD");
//
//WebDriver driver =new ChromeDriver();
//driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//driver.get(url);
//driver.findElement(By.id("email")).sendKeys(uname);
//driver.findElement(By.id("pass")).sendKeys(pwd);
//driver.findElement(By.id("loginbutton")).click();

//Assignment

FileInputStream fis=new FileInputStream("C:\\Users\\Divya Jyothi\\OneDrive\\Desktop\\JAVA Selenium\\Selenium Notes_ AnjaliUnnikrishnan\\Documents\\Instacredentials.properties");
Properties prop=new Properties();
prop.load(fis);
String url=prop.getProperty("URL");
String uname=prop.getProperty("UNAME");
String pwd=prop.getProperty("PWD");

WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get(url);
driver.findElement(By.name("username")).sendKeys(uname);
driver.findElement(By.name("password")).sendKeys(pwd);
driver.findElement(By.xpath("//button[@type='submit']")).click();

Thread.sleep(5000);
driver.quit();

}

}
