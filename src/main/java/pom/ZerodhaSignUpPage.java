package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {
	
	@FindBy (xpath= "//input[@id='userid']") private WebElement emailId;
    @FindBy (xpath= "//input[@id='password']") private WebElement password;
    @FindBy (xpath= "//button[@type='submit']") private WebElement login;
    @FindBy (xpath= "//a[text()='Forgot user ID or password?']") private WebElement forgot;
    @FindBy (xpath= "//input[@id='pin']") private WebElement pin;
    @FindBy (xpath= "//button[@type='submit']") private WebElement continu;
    @FindBy (xpath= "(//a[@target='_blank'])[3]") private WebElement signup;
    @FindBy (xpath= "//input[@id='user_mobile']") private WebElement mobileno;
    
    public ZerodhaSignUpPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void clickOnSignUp()
    {
    	signup.click();
    	
    }
    
    public void enterMobileNo(String no)
    {
    	mobileno.sendKeys(no);
    }

}
