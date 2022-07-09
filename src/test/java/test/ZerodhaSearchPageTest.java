package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaPageLogin;
import pom.ZerodhaSearchPage;
import utility.Excel;

public class ZerodhaSearchPageTest {
	WebDriver driver;
	int p,q;
	String id,pass,pin1;
  
	@BeforeMethod
	  public void openBrowser() 
	  {
		 driver=Browser.openBrowser();
	  }
	  
	  @Test
	  public void zerodhaSearchPagetest() throws EncryptedDocumentException, IOException, InterruptedException 
	  {
		//  ZerodhaLoginPageTest zerodhaLoginPageTest=new ZerodhaLoginPageTest();
		  ZerodhaLoginPageTest.LoginPageTest(driver);
	     
	        ZerodhaSearchPage zerodhaSearchPage=new ZerodhaSearchPage(driver);
	        zerodhaSearchPage.clickOnSearch(driver);
	        zerodhaSearchPage.enterName("TCS");
	        zerodhaSearchPage.clickOnCompany(driver);
	       // zerodhaSearchPage.moveToShare(driver);
	        zerodhaSearchPage.clickOnbuy();	        
         
	   
	}

}
