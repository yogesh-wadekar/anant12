package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utility.BaseClass;

public class ZerodhaPageLogin  {
	@FindBy (xpath= "//input[@id='userid']") private WebElement emailId;
    @FindBy (xpath= "//input[@id='password']") private WebElement password;
    @FindBy (xpath= "//button[@type='submit']") private WebElement login;
    @FindBy (xpath= "//a[text()='Forgot user ID or password?']") private WebElement forgot;
    @FindBy (xpath= "//input[@id='pin']") private WebElement pin;
    @FindBy (xpath= "//button[@type='submit']") private WebElement continu;
    
    public ZerodhaPageLogin(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void enterEmailId(String email)
    {
    	emailId.sendKeys(email);
    }
    
    public void enterPassword(String pass)
    {
    	password.sendKeys(pass);
    }
    
    public void clickOnLogin()
    {
    	login.click();
    }
    
    public void ClickOnforgot()
    {
    	forgot.click();
    }
    
    public void EnterPin(String pinnumber)
    {
//    	 FluentWait<WebDriver> wait1=new FluentWait<WebDriver>(driver);
// 	    wait1.withTimeout(Duration.ofSeconds(30));
// 	    wait1.pollingEvery(Duration.ofSeconds(10));
// 	    wait1.ignoring(Exception.class);
// 	    wait1.until(ExpectedConditions.visibilityOf(pin));        
 	    pin.sendKeys(pinnumber);
    }
    
    public void clickOnContinu()
    {
    	continu.click();
    }

}
