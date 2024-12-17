package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSelectClassMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//For dropDown
	/*
			driver.get("https://www.facebook.com/r.php/");
				
			WebElement day=driver.findElement(By.id("day"));
			WebElement month=driver.findElement(By.id("month"));
			WebElement year=driver.findElement(By.id("year"));
				
			Select dayDropDown=new Select(day);
			Select monthDropDown=new Select(month);
			Select yearDropDown=new Select(year);
			
			dayDropDown.selectByIndex(19);
			monthDropDown.selectByValue("4");
			yearDropDown.selectByVisibleText("1987");
			
			//UnSupportedOperationsException.........java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
			
			//yearDropDown.deselectAll();
			//monthDropDown.deselectByIndex(0);
			//dayDropDown.deselectByVisibleText("20");
			//dayDropDown.deselectByValue("20");
			
			System.out.println("is multiple: "+ dayDropDown.isMultiple());
			
			List<WebElement> daylist = dayDropDown.getOptions();
			for(WebElement days:daylist) {
				System.out.println(days.getText());
			}
	*/
		
		//ListBox: multiSelect
	driver.get("https://demoapp.skillrary.com/");
			
	WebElement listbox=driver.findElement(By.id("cars"));
	Select options=new Select(listbox);
	
	List<WebElement> oplist = options.getOptions();
	List<WebElement> opselList = options.getAllSelectedOptions();
	WebElement opfirstsel = options.getFirstSelectedOption();
	
	options.selectByIndex(1);
	options.selectByValue("199");
	options.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
	
	options.deselectByIndex(0);
	options.deselectByValue("");
	options.deselectByVisibleText("");
	options.deselectAll();
	
	options.isMultiple();
	
	/*		 WebElement MyListBox = driver.findElement(By.id("cars"));
			
			Select Mylist=new Select(MyListBox);
			
			Mylist.selectByIndex(1);
			Mylist.selectByValue("500");
			Mylist.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
			Mylist.selectByValue("90");
			
			Thread.sleep(2000);
			Mylist.deselectByIndex(0);
			Thread.sleep(2000);
			//Mylist.deselectByVisibleText("More Than INR 500 ( 55 ) ");
			Thread.sleep(2000);
			Mylist.deselectByValue("99");
			Thread.sleep(2000);
			Mylist.deselectAll();
	*/	
		
//		//Assignment (05 OCT 24)
//		
//			driver.get("https://demowebshop.tricentis.com/books");
//			
//			WebElement sortBy=driver.findElement(By.id("products-orderby"));
//			Select sortByDropDown=new Select(sortBy);
//			
//			Thread.sleep(2000);
//			sortByDropDown.selectByIndex(4);
//			//sortByDropDown.selectByValue("https://demowebshop.tricentis.com/books?orderby=11");
//			//sortByDropDown.selectByVisibleText("Price: High to Low");
//			
//			//When using more than one select statements on same option we get following Exception
//			// org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
//				// in case of a) Page refresh    b)DOM update    c)location of webelement changed
//			//this is because every selectBy option refreshes the page .... now the findElement can find in this new refreshed page =====> the address internally is not same
//			//hence StaleElement (elelment found by=ut internel mem is diff maybe)
//			
//			//similarly after selectby method if u try displaying --->again now page is refreshed hence sysout doesnt find old element===>StaleElement
//			
//			/*
//			 System.out.println("is multiple: "+ sortByDropDown.isMultiple());
//			
//			
//			List<WebElement> sortByDD = sortByDropDown.getOptions();
//			for(WebElement sortdd:sortByDD) {
//				System.out.println(sortdd.getText());
//			}
//			*/
			Thread.sleep(3000);
	driver.quit();
	}

}
