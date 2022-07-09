package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaPageLogin;
import utility.BaseClass;
import utility.Excel;
import utility.ScreenShot;
@Listeners (utility.Listeners.class)
public class ZerodhaLoginPageTest extends BaseClass {
    int a,b;
   	@BeforeMethod
    public void openBrowser()
    {
	     driver=Browser.openBrowser();
	}
     
    @Test
    public void LoginPageTest1() throws EncryptedDocumentException, IOException, InterruptedException
    {
    	ZerodhaPageLogin zerodhaLoginPage=new ZerodhaPageLogin(driver);
        String id=Excel.getExcelData("credential", 1, 1);
        String pass=Excel.getExcelData("credential", 1, 2);
        String pin1=Excel.getExcelData("credential", 2, 2);
        zerodhaLoginPage.enterEmailId(id);
        zerodhaLoginPage.enterPassword(pass);
        zerodhaLoginPage.clickOnLogin();
        //ScreenShot.snap(driver, "Zerodha");
        //Thread.sleep(2000);
        zerodhaLoginPage.EnterPin(pin1);
        zerodhaLoginPage.clickOnContinu();       
       // driver.close();
    }
    
    @Test
    public void LoginPageTest_WithWrongId() throws EncryptedDocumentException, IOException, InterruptedException
    {
    	ZerodhaPageLogin zerodhaLoginPage=new ZerodhaPageLogin(driver);
        String id="Yogesh";
        String pass=Excel.getExcelData("credential", 1, 2);
        String pin1=Excel.getExcelData("credential", 2, 2);
        zerodhaLoginPage.enterEmailId(id);
        zerodhaLoginPage.enterPassword(pass);
        zerodhaLoginPage.clickOnLogin();
        Assert.assertTrue(false);
        //ScreenShot.snap(driver, "Zerodha");
        //Thread.sleep(2000);
//      zerodhaLoginPage.EnterPin(pin1);
//      zerodhaLoginPage.clickOnContinu();       
       // driver.close();
        
    }
    
    @Test
    public void LoginPageTest_WithWrongPassword() throws EncryptedDocumentException, IOException, InterruptedException
    {
    	ZerodhaPageLogin zerodhaLoginPage=new ZerodhaPageLogin(driver);
    	String id=Excel.getExcelData("credential", 1, 1);
        String pass="123456";
        zerodhaLoginPage.enterEmailId(id);
        zerodhaLoginPage.enterPassword(pass);
        zerodhaLoginPage.clickOnLogin();
        Assert.assertTrue(false);
    }
    
    
    
    
    
    
    
    
    
    
    public static void LoginPageTest(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException
    {
    	ZerodhaPageLogin zerodhaLoginPage=new ZerodhaPageLogin(driver);
        String id=Excel.getExcelData("credential", 1, 1);
        String pass=Excel.getExcelData("credential", 1, 2);
        String pin1=Excel.getExcelData("credential", 2, 2);
        zerodhaLoginPage.enterEmailId(id);
        zerodhaLoginPage.enterPassword(pass);
        zerodhaLoginPage.clickOnLogin();
        //ScreenShot.snap(driver, "Zerodha");
        //Thread.sleep(2000);
        zerodhaLoginPage.EnterPin(pin1);
        zerodhaLoginPage.clickOnContinu();       
       // driver.close();
    }
    
}
