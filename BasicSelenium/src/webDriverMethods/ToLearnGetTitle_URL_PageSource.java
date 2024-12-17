package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle_URL_PageSource {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		String title=driver.getTitle();
		System.out.println("Title:"+ title);
		
		String url=driver.getCurrentUrl();
		System.out.println("\nCurrentUrl:"+ url);
		
		
		String pageSource=driver.getPageSource();
		System.out.println("\n PageSource:\n"+ pageSource);
		

	}

}
