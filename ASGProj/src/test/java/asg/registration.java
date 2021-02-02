package asg;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Authentication;
import pageobjects.Homepage;
import resources.browser;
import resources.excel;


public class registration extends browser {
	public WebDriver driver;
	String  email;
	Select s;
	public  void initialize () throws IOException   {
		// TODO Auto-generated method stub
		driver= initialisedriver();
	}
	@Test
	public void login() throws IOException, InterruptedException
	{

/*driver.get("http://automationpractice.com/");
driver.manage().window().maximize();*/		
Authentication au=new Authentication(driver);
excel ex =new excel();
Thread.sleep(7000);
//WebDriverWait wait =(WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(au.male()));
au.male().click();
au.Fn().sendKeys(ex.input(0, 3, 2));
au.Ln().sendKeys(ex.input(0, 4, 2));
//au.email().sendKeys(ex.input(0, 1, 2));
au.pwd().sendKeys(ex.input(0, 5, 2));
s = new Select((WebElement) au.days());
s.selectByValue(ex.input(0, 6, 2));
s=new Select((WebElement) au.months());
s.selectByVisibleText(ex.input(0, 7, 2));
s=new Select((WebElement) au.years());
s.selectByValue(ex.input(0, 8, 2));
au.newsletter().click();
au.offer().click();
au.AddFn().sendKeys(ex.input(0, 3, 2));
au.AddLn().sendKeys(ex.input(0, 4, 2));
au.company().sendKeys(ex.input(0, 15, 2));
au.Address1().sendKeys(ex.input(0, 9, 2));
au.Address2().sendKeys(ex.input(0, 16, 2));
au.City().sendKeys(ex.input(0, 10, 2));
au.State().click();
s = new Select(au.State());
s.selectByValue(ex.input(0, 11, 2));
au.Postcode().sendKeys(ex.input(0, 12, 2));
s = new Select(au.Country());
s.selectByValue(ex.input(0, 13, 2));
au.otherinfo().sendKeys("zHii");
au.homeph().sendKeys("98787545242");
au.mobph().sendKeys(ex.input(0, 14, 2));
au.alias().sendKeys("testing");
au.register().click();

}}
