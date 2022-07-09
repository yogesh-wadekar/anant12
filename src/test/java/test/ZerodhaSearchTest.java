package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaSearch;
import pom.ZerodhaSearchPage;

public class ZerodhaSearchTest {
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser()
	{
		driver=Browser.openBrowser();
	}
	
	@Test(enabled=false)
	public void searchShareAndClickOnBuy() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaLoginPageTest.LoginPageTest(driver); 
        ZerodhaSearch zerodhaSearch=new ZerodhaSearch(driver);
       // zerodhaSearch.clickOnSearchButton(driver);
      //  zerodhaSearch.enterShare("TATA");
        zerodhaSearch.enterWhiteListedShareName(driver,"CESC");
        zerodhaSearch.clickOnBuy();
	}

	@Test
	public void searchByDropdownList() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaLoginPageTest.LoginPageTest(driver); 
        ZerodhaSearch zerodhaSearch=new ZerodhaSearch(driver);
       // zerodhaSearch.clickOnSearchButton(driver);
        zerodhaSearch.enterShare("TCS",driver);
        //zerodhaSearch.selectShareByDropDown(driver,"TCS");
        
	}

}
