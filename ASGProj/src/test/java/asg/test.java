package asg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Authentication;
import pageobjects.Homepage;
import resources.browser;
import resources.excel;


@Test
public class test extends browser {
	public WebDriver driver;
	Select s;
	String quantity;
	int i;
	JavascriptExecutor js;
	@BeforeTest
	public  void initialize () throws IOException   {
		// TODO Auto-generated method stub
		driver= initialisedriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
	}
	public void userregistration() throws IOException, InterruptedException
	{
Homepage hp=new Homepage(driver);
hp.Signin().click();
Authentication au=new Authentication(driver);
au.email().sendKeys("tes6t45jsslsdjdjdi@gmail.com");
au.Submit().click();
//Authentication au=new Authentication(driver);
excel ex =new excel();
Thread.sleep(7000);
//WebDriverWait wait =(WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(au.male()));
//au.male().click();
au.Fn().sendKeys(ex.input(0, 3, 2));
au.Ln().sendKeys(ex.input(0, 4, 2));
//au.email().sendKeys(ex.input(0, 1, 2));
au.pwd().sendKeys(ex.input(0, 5, 2));
/*s = new Select((WebElement) au.days());
s.selectByValue(ex.input(0, 6, 2));
Thread.sleep(1000);
s=new Select((WebElement) au.months());
s.selectByVisibleText(ex.input(0, 7, 2));
s=new Select((WebElement) au.years());
s.selectByValue(ex.input(0, 8, 2));*/
au.newsletter().click();
au.offer().click();
au.AddFn().sendKeys(ex.input(0, 3, 2));
au.AddLn().sendKeys(ex.input(0, 4, 2));
au.company().sendKeys(ex.input(0, 15, 2));
au.Address1().sendKeys(ex.input(0, 9, 2));
au.Address2().sendKeys(ex.input(0, 16, 2));
au.City().sendKeys(ex.input(0, 10, 2));
s = new Select(au.State());
s.selectByVisibleText(ex.input(0, 11, 2));
au.Postcode().sendKeys(ex.input(0, 12, 2));
s = new Select(au.Country());
s.selectByVisibleText(ex.input(0, 13, 2));
au.otherinfo().sendKeys("zHii");
au.homeph().sendKeys("98787545242");
au.mobph().sendKeys(ex.input(0, 14, 2));
au.alias().sendKeys("testing");
au.register().click();
Thread.sleep(5000);
hp.Logo().click();
Thread.sleep(5000);
Actions a =new Actions(driver);
a.moveToElement(hp.Dresses()).perform();
Thread.sleep(1000);
//List li=hp
driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")).click();
Thread.sleep(3000);
a.moveToElement(driver.findElement(By.xpath("(//img[@title='Printed Summer Dress'])[2]"))).perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[2]/span")).click();
Thread.sleep(2000);
quantity =driver.findElement(By.cssSelector("input#quantity_wanted")).getAttribute("Value");
i = Integer. parseInt(quantity);
for(int j=i;j<5;j++)
{
	driver.findElement(By.cssSelector("i.icon-plus")).click();
}
s = new Select(driver.findElement(By.cssSelector("select#group_1")));
s.selectByVisibleText("M");
driver.findElement(By.xpath("//a[@name='Yellow']")).click();
driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
Thread.sleep(5000);
driver.findElement(By.cssSelector("span.continue.btn.btn-default.button.exclusive-medium")).click();
Thread.sleep(3000);
a.moveToElement(hp.Dresses()).perform();
Thread.sleep(1000);
//List li=hp
driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")).click();
Thread.sleep(5000);
a.moveToElement(driver.findElement(By.xpath("//img[@title='Printed Chiffon Dress']"))).perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='center_column']/ul/li[3]/div/div[2]/div[2]/a[2]/span")).click();
quantity =driver.findElement(By.cssSelector("input#quantity_wanted")).getAttribute("Value");
i = Integer. parseInt(quantity);
for(int j=i;j<5;j++)
{
	driver.findElement(By.cssSelector("i.icon-plus")).click();
}

s = new Select(driver.findElement(By.cssSelector("select#group_1")));
s.selectByVisibleText("S");
driver.findElement(By.xpath("//a[@name='Green']")).click();
driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
Thread.sleep(5000);
driver.findElement(By.cssSelector("span.continue.btn.btn-default.button.exclusive-medium")).click();
driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[3]")).click();
Thread.sleep(3000);
a.moveToElement(driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"))).perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[2]/span")).click();
quantity =driver.findElement(By.cssSelector("input#quantity_wanted")).getAttribute("Value");
i = Integer. parseInt(quantity);
for(int j=i;j<5;j++)
{
	driver.findElement(By.cssSelector("i.icon-plus")).click();
}
s = new Select(driver.findElement(By.cssSelector("select#group_1")));
s.selectByVisibleText("L");
driver.findElement(By.xpath("//a[@name='Blue']")).click();
driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span")).click();
Thread.sleep(5000);
driver.findElement(By.cssSelector("span.continue.btn.btn-default.button.exclusive-medium")).click();
driver.findElement(By.xpath("//div[@class='shopping_cart']/a")).click();
System.out.println(driver.getTitle());
}}
