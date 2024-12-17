package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnkithErail {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://erail.in/");
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("DEL");
	
		System.out.println(driver.findElement(By.xpath("(//div[@class=\"autocomplete\"]/div)[4]")).getAttribute("title"));
		
		//Step6,7
/*		FileInputStream fis= new FileInputStream("./src/test/resources/erailStations.xlsx");
		FileInputStream fis1= new FileInputStream("C:\\Users\\Divya Jyothi\\OneDrive\\Desktop\\erailStations1.xlsx");
		Workbook book =WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Sheet1");

		Workbook book1 =WorkbookFactory.create(fis1);
		Sheet sheet1=book1.getSheet("Sheet1");
		
	
		List<WebElement> stationList = driver.findElements(By.xpath("//div[@class=\"autocomplete\"]/div"));
		//div[@class="autocomplete"]/div
		int ii=0;
		int size=stationList.size();
		for(WebElement station:stationList)
		{
			//System.out.println(element.getAttribute("href"));
			sheet.createRow(ii).createCell(0).setCellValue(station.getAttribute("title"));
			ii++;
			
			}
		System.out.println(ii);
		FileOutputStream fos=new FileOutputStream("./src/test/resources/erailStations.xlsx");
		book.write(fos);
		book.close();
		
		//Compare
		int rowNum = sheet.getLastRowNum();
		 for (int i = 1; i <rowNum; i++) 
		 {
			 Row row = sheet.getRow(i);
			 Row row2=sheet1.getRow(i);
			 Cell cellA = row.getCell(0);
             Cell cellB = row2.getCell(0);
            // Cell cellC = row.createCell(3);
             String valueA = cellA.getStringCellValue();
             String valueB = cellB.getStringCellValue();
            // cellC.setCellValue(valueA.equals(valueB) ? "true" : "false");
             System.out.println("Comparison for row " + i + ": " + valueA + " vs " + valueB + " = " + (valueA.equals(valueB) ? "true" : "false"));
		}
*/			

		
		//Step8
	
		 String presentDate=driver.findElement(By.xpath("//input[@title=\"Select Departure date for availability\"]")).getAttribute("value");
		
		System.out.println(presentDate);
		
		Date currentDate=new Date();
		LocalDate Locdate = LocalDate.now().plusDays(30);
		//System.out.println(Locdate);
	//	driver.findElement(By.xpath("//input[@title=\"Select Departure date for availability\"]")).
		
		String strDate=presentDate.substring(0, 9);
		System.out.println("Substr: "+strDate);


		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yy E");
		LocalDate date = LocalDate.parse(presentDate, formatter);
		System.out.println("After parsing: "+date);
	
		LocalDate date1=date.plusDays(30);
		System.out.println("After 30 days: "+date1);
		
		
//		
	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MMM-yy E");
	String After30Days=date1.format(formatter1);
	System.out.println("After parsing: "+After30Days);
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
//	jse.executeScript("document.getElementById('elementID').setAttribute('value', 'new value for element')");
	

	WebElement inputField = driver.findElement(By.xpath("//input[@title=\"Select Departure date for availability\"]"));
	jse.executeScript("arguments[0].setAttribute('value', '" + After30Days +"')", inputField);
	
	
	
Thread.sleep(3000);
driver.quit();

	}

}
