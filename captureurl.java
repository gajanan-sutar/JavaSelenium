import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class captureurl {
	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
    
		WebDriver driver=new ChromeDriver(options=options);
		String url = driver.getCurrentUrl();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Create account")).click();
    
	      System.out.println(driver.getCurrentUrl());
	      Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(By.linkText("selenium.dev")).click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.close();
		driver.quit(); 
		
			
	}

}
