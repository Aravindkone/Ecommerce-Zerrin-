package com.zerrin.overall.check;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zerrin extends Ecommerce {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\java\\Project\\E-commerce\\Zerrin\\chrome driver\\chromedriver 79.exe");
	WebDriver driver=new ChromeDriver();
	//launch url
	driver.navigate().to("https://zerrin.com/");
	driver.manage().window().maximize();
	TakesScreenshot tk=(TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File destination=new File("E:\\java\\Project\\E-commerce\\screenshot\\homepage.png");
	FileUtils.copyFile(source, destination);
	//sign up
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	Thread.sleep(5000);
	WebElement popup = driver.findElement(By.xpath("(//button[@class='modal__close js-modal-close text-link'])[1]"));
	executor.executeScript("arguments[0].click()",popup);
	/*WebElement signup = driver.findElement(By.xpath("//a[@class='site-nav__link site-nav__link--icon small--hide']"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click()",signup);
	WebElement createaccount = driver.findElement(By.xpath("//a[text()='Create account']"));
	createaccount.click();
	File source1 = tk.getScreenshotAs(OutputType.FILE);
	File destination1=new File("E:\\java\\Project\\E-commerce\\screenshot\\signuppage.png");
	FileUtils.copyFile(source1, destination1);
	WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
	firstname.sendKeys(getData(1,1));
	WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
	lastname.sendKeys(getData(2,1));
	WebElement mail = driver.findElement(By.xpath("//input[@id='Email']"));
	mail.sendKeys(getData(3,1));
	WebElement password = driver.findElement(By.xpath("//input[@id='CreatePassword']"));
	password.sendKeys(getData(6,1));
	driver.findElement(By.xpath("//input[@value='Create']")).click();
	WebElement checkbox = driver.findElement(By.xpath("(//div[@role='presentation'])[2]"));
	checkbox.click();
	WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	submit.click();*/
    //robot action
	Thread.sleep(5000);
	//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	WebElement searchbox = driver.findElement(By.xpath("//a[@class='site-nav__link site-nav__link--icon js-search-header js-no-transition']"));
	executor.executeScript("arguments[0].click()",searchbox);
	WebElement textbox = driver.findElement(By.xpath("(//input[@name='q'])[1]"));
	textbox.sendKeys(getData(7,1));
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	WebElement dress = driver.findElement(By.xpath("//div[text()='Baliza Michelle Dress']"));
	executor.executeScript("arguments[0].click()",dress);
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	WebElement addcart = driver.findElement(By.xpath("//span[@id='AddToCartText-10064374226']"));
	executor.executeScript("arguments[0].click()",addcart);
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	File source2 = tk.getScreenshotAs(OutputType.FILE);
	File destination2=new File("E:\\java\\Project\\E-commerce\\screenshot\\checkout.png");
	FileUtils.copyFile(source2, destination2);
	WebElement checkout = driver.findElement(By.xpath("//button[@name='checkout']"));
	executor.executeScript("arguments[0].click()",checkout);
	//login
	WebElement login = driver.findElement(By.xpath("//a[@data-trekkie-id='have_an_account_login_link']"));
	login.click();
	WebElement guestbtn = driver.findElement(By.xpath("(//button[@class='btn'])[2]"));
	guestbtn.click();
	//contact info
	WebElement contactinfo = driver.findElement(By.xpath("//input[@placeholder='Email']"));
	contactinfo.sendKeys(getData(3, 1));
	//Shipping address
	WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First name']"));
	firstname.sendKeys(getData(1, 1));
	WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last name']"));
	lastname.sendKeys(getData(2, 1));
	WebElement address = driver.findElement(By.xpath("//input[@placeholder='Address']"));
	address.sendKeys(getData(5, 1));
	WebElement doorno = driver.findElement(By.xpath("//input[@placeholder='Apartment, suite, etc. (optional)']"));
	doorno.sendKeys("34/19");
	WebElement city = driver.findElement(By.xpath("//input[@placeholder='City']"));
	city.sendKeys("Chennai");
	WebElement country = driver.findElement(By.xpath("//select[@data-backup='country']"));
	Select s=new Select(country);
	s.selectByValue("India");
	WebElement state = driver.findElement(By.xpath("//select[@placeholder='State']"));
	Select s1=new Select(state);
	s1.selectByValue("TN");
	WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='PIN code']")); 
	pincode.sendKeys("624613");
	WebElement mobileno = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
	mobileno.sendKeys("8526278052");
	File source3 = tk.getScreenshotAs(OutputType.FILE);
	File destination3=new File("E:\\java\\Project\\E-commerce\\scereenshot\\info.png");
	FileUtils.copyFile(source3, destination3);
	WebElement continueshopping = driver.findElement(By.xpath("//span[text()='Continue to shipping']"));
	executor.executeScript("arguments[0].click()",continueshopping);
	WebElement continuepayment = driver.findElement(By.xpath("//span[text()='Continue to payment']"));
	executor.executeScript("arguments[0].click()",continuepayment);
	//card details
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	WebElement cardnumber = driver.findElement(By.xpath("//input[@placeholder='Card number']"));
	cardnumber.sendKeys("7464785845465");
	WebElement nameoncard = driver.findElement(By.xpath("//input[@placeholder='Name on card']"));
	nameoncard.sendKeys("Aravind");
	WebElement expdate = driver.findElement(By.xpath("//input[@placeholder='Expiration date (MM / YY)']"));
	expdate.sendKeys("15/2035");
	WebElement paynow = driver.findElement(By.xpath("(//span[text()='Pay now'])[1]"));
	executor.executeScript("arguments[0].click()",paynow);
	
	
	
	
	
	}

}
