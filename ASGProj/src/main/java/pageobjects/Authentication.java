package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Authentication {
	WebDriver driver;
	By email=By.id("email_create");
	By Submit=By.id("SubmitCreate");
	By Male=By.cssSelector("div#uniform-id_gender1");
	By Female=By.cssSelector("div#uniform-id_gender2");
	By Fn=By.cssSelector("input#customer_firstname");
	By Ln=By.cssSelector("input#customer_lastname");
	By Emailtxtbox=By.cssSelector("input#email");
	By pass=By.cssSelector("input#passwd");
	By newschkbx=By.cssSelector("div#uniform-newsletter");
	By offerchkbx=By.cssSelector("input#optin");
	By AddFn=By.cssSelector("input#firstname");
	By AddLn=By.cssSelector("input#lastname");
	By Comp=By.cssSelector("input#company");
	By Address1=By.cssSelector("input#address1");
	By Address2=By.cssSelector("input#address2");
	By City=By.cssSelector("input#city");
	By Postcode=By.cssSelector("input#postcode");
	By otherinfo=By.cssSelector("textarea#other");
	By homeph=By.cssSelector("input#phone");
	By mobph=By.cssSelector("input#phone_mobile");	
	By alias=By.cssSelector("input#alias");
	By State=By.cssSelector("select#id_state");
	By Country=By.cssSelector("select#id_country");
	By days=By.cssSelector("select#days");
	By months=By.cssSelector("select#months");
	By years=By.cssSelector("select#years");
By register=By.cssSelector("button#submitAccount");
	public Authentication (WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement Submit()
	{
		return driver.findElement(Submit);
	}
	public WebElement male() {
		return driver.findElement(Male);
	}
	public WebElement female() {
		return driver.findElement(Female);
	}public WebElement Fn() {
		return driver.findElement(Fn);
	}public WebElement City() {
		return driver.findElement(City);
	}
	public WebElement Ln() {
		return driver.findElement(Ln);
	}
	public WebElement emailbox() {
		return driver.findElement(Emailtxtbox);
	}public WebElement pwd() {
		return driver.findElement(pass);
	}public WebElement newsletter() {
		return driver.findElement(newschkbx);
	}public WebElement offer() {
		return driver.findElement(offerchkbx);
	}public WebElement AddFn() {
		return driver.findElement(AddFn);
	}public WebElement AddLn() {
		return driver.findElement(AddLn);
	}public WebElement company() {
		return driver.findElement(Comp);
	}public WebElement Address1() {
		return driver.findElement(Address1);
	}public WebElement Address2() {
		return driver.findElement(Address2);
	}
	public WebElement Postcode() {
		return driver.findElement(Postcode);
	}
	public WebElement otherinfo() {
		return driver.findElement(otherinfo);
	}
	
	public WebElement mobph() {
		return driver.findElement(mobph);
	}
	public WebElement homeph() {
		return driver.findElement(homeph);
	
	}
	public WebElement State() {
		return driver.findElement(State);
		
	}
	public WebElement Country() {
		return driver.findElement(Country);
		
	}
	public WebElement days() {
		return driver.findElement(days);
		
	}
	public WebElement months() {
		return driver.findElement(months);
		
	}
	public WebElement years() {
		return driver.findElement(years);
}
	public WebElement register() {
		return driver.findElement(register);
}
	public WebElement alias() {
		// TODO Auto-generated method stub
		return driver.findElement(alias);
	}}