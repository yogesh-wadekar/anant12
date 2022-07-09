package test;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaPageLogin;
import pom.ZerodhaSignUpPage;
import utility.Excel;
import utility.ScreenShot;


public class ZerodhaSignupPageTest {
	WebDriver driver;
	String id,pass;
	@BeforeMethod
	public void openBrowser()
	{
		driver=Browser.openBrowser();		
	}
	@Test
	public void signUpPageTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaPageLogin zerodhaLoginPage=new ZerodhaPageLogin(driver);
		ZerodhaSignUpPage zerodhaSignUpPage=new ZerodhaSignUpPage(driver);
        id=Excel.getExcelData("credential", 1, 1);
        pass=Excel.getExcelData("credential", 1, 2);
       // pin=Excel.getExcelData("credential", 2, 2);
        zerodhaLoginPage.enterEmailId(id);
        zerodhaLoginPage.enterPassword(pass);
        zerodhaLoginPage.clickOnLogin();
        ScreenShot.snap(driver, "Zerodha");
        Thread.sleep(2000);
        //zerodhaLoginPage.EnterPin(pin);
        zerodhaSignUpPage.clickOnSignUp();
        
        ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
        int size=list.size();
        System.out.println("Total Open Windows On Browser= "+size);
        driver.switchTo().window(list.get(1));
        System.out.println("Title= "+driver.getTitle());
        zerodhaSignUpPage.enterMobileNo("7972647683");
        
     
	}

}
