package pojo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.BaseClass;

public class Browser extends BaseClass {
	public static WebDriver openBrowser()
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		return driver;
	}
	
	public static void fluentWait(WebDriver driver, WebElement element, int timeout)
	{
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
    	wait.withTimeout(Duration.ofSeconds(20));
    	wait.pollingEvery(Duration.ofSeconds(timeout));
    	wait.ignoring(Exception.class);
    	wait.until(ExpectedConditions.visibilityOf(element));  	
	}
	
	public static void explicitWait(WebDriver driver, WebElement element, int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
    	wait.until(ExpectedConditions.visibilityOf(element));
	}
	

}
