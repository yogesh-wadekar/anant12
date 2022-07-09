package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pojo.Browser;

public class ZerodhaSearchPage {
	
	@FindBy (xpath= "//input[@type='text']") private WebElement search;
	@FindBy (xpath= "//span[text()='TCS']") private WebElement company;
	@FindBy (xpath= "//button[@data-balloon='Buy']") private WebElement buy; 
	@FindBy (xpath= "(//label[@class=\"su-radio-label\"])[9]") private WebElement intraday;
    @FindBy (xpath= "(//input[@type='number'])[1]") private WebElement quentity;
    @FindBy (xpath= "(//input[@type='number'])[2]") private WebElement Price;
    @FindBy (xpath= "//label[text()='Market']") private WebElement market;
    @FindBy (xpath= "//button[@class='submit']") private WebElement Buyshear;
  //  @FindBy (xpath= "//li[@class='search-result-item selected']") private WebElement movetoshare;
    @FindBy (xpath= "(//span[@class='symbol'])[1]") private WebElement movetoshare;
    public ZerodhaSearchPage (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickOnSearch(WebDriver driver)
    {
    	Browser.fluentWait(driver , search, 10);
    	search.click();
    }
    public void enterName(String name) 
    {
    	search.sendKeys(name);
    }
    public void clickOnCompany(WebDriver driver)
    {
    	Browser.fluentWait(driver , company, 5);
    	company.click();
    }
    public void moveToShare(WebDriver driver)
    {
    	Browser.fluentWait(driver, company, 5);
    	Actions a=new Actions(driver);
    	a.moveToElement(company);
    }
    public void clickOnbuy()
    {
    	buy.click();
    }
    public void clickOnInterday()
    {
    	intraday.click();
    }
    public void eneterQuentity(int a,WebDriver driver)
    {
    	//quentity.sendKeys(a);
    	((JavascriptExecutor)driver).executeScript("arugumnets[0].value="+a+quentity);
    }
    public void eneterPrice(int rup,WebDriver driver)
    {
    	//Price.sendKeys(rup);
    	((JavascriptExecutor)driver).executeScript("arugumnets[0].value="+rup+Price);
    }
    public void clickOnMarket()
    {
    	market.click();
    }
    public void clickOnBuyShare()
    {
    	Buyshear.click();
    }


}
