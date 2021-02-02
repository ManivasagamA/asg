package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;
	public Homepage (WebDriver driver)
	{
		this.driver=driver;
	}

	
	By Signin = By.cssSelector("a.login");
	public WebElement Signin()
	{
		return driver.findElement(Signin);
	}
	By Homelogo = By.xpath("//img[contains(@src,'automationpractice.com/img/logo.jpg')]");
	public WebElement Logo()
	{
		return driver.findElement(Homelogo);
	}
	By Dresses = By.xpath("(//a[@title='Dresses'])[2]");
	public WebElement Dresses()
	{
		return driver.findElement(Dresses);
	}
}
