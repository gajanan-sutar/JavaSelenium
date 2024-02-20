package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 
 */

/**
 * @author gajanansutar
 *
 */
public class BrowserCommands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver.exe");
	ChromeOptions options =new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver=new ChromeDriver(options=options);

		driver.get("http://www.seleniumframework.com/demo-sites/");

		String pageTitle = driver.getTitle();
		System.out.println("Page Title = " + pageTitle);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL = " + currentUrl);

		String pageSource = driver.getPageSource();
		System.out.println("Current Page Source = " + pageSource);

		driver.close();// close current window/ web page
		driver.quit();// close all browser window

	}

}
