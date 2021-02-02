package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browser {

	public WebDriver driver;
	 String userdir= System.getProperty("user.dir");
	public WebDriver initialisedriver() {
		
		System.setProperty("webdriver.chrome.driver", userdir+"\\src\\main\\java\\resources\\chromedriver.exe");
		/*ChromeOptions options =new ChromeOptions();
		options.addArguments("--headless"); 
		options.addArguments("--no-sandbox"); 
		options.addArguments("window-size=1920,1080"); 
		options.addArguments("--start-maximized"); 
		options.addArguments("--disable-gpu"); 
		options.addArguments("--disable-extensions"); 
		options.addArguments("--disable-dev-shm-usage"); 
		options.addArguments("--ignore-certificate-errors"); */
		WebDriver driver= new ChromeDriver();
		return driver;
	}
}
