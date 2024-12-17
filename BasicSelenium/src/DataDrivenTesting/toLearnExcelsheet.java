package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnExcelsheet {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		//Assignment
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Divya Jyothi\\OneDrive\\Desktop\\JAVA Selenium\\Selenium Notes_ AnjaliUnnikrishnan\\Documents\\InstaCredentialsExcel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	
		Sheet sh=wb.getSheet("Facebook");
		
		Row r=sh.getRow(1);
		
		String url=r.getCell(0).getStringCellValue();
		String uname=r.getCell(1).getStringCellValue();
		String pwd=r.getCell(2).getStringCellValue();
wb.close();
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
