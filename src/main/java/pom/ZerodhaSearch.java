package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pojo.Browser;

public class ZerodhaSearch {
	@FindBy (xpath= "//input[@type='text' and @icon='search']") private WebElement search;
	@FindBy(xpath="//li[@class='search-result-item']")private List<WebElement> selectByDropDown;
	@FindBy (xpath= "//span[@class='nice-name']") private List<WebElement> selectFromWhiteList;
	@FindBy (xpath= "//button[@class='button-blue buy']") private WebElement buy;
	
	public ZerodhaSearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSearchButton(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(search));
		search.click();
	}
	
	public void enterShare(String share, WebDriver driver)
	{
		search.sendKeys(share);
		int size=selectByDropDown.size();
		for(int i=0;i<size;i++)
		{
			WebElement Stock=selectByDropDown.get(i);
			String stockName=Stock.getText();
			//System.out.println(stockName);
			if(stockName.equals(share))
			{
				Actions a=new Actions(driver);
				a.moveToElement(buy).click();
				a.perform();
			}
		}
	
	}
	
	public void enterWhiteListedShareName(WebDriver driver, String name)
	{
		Browser.explicitWait(driver, search, 3);
		int size=selectFromWhiteList.size();
		for(int i=0; i<size;i++)
		{
			WebElement stock=selectFromWhiteList.get(i);
			String stockName=stock.getText();
			if(name.equals(stockName))
			{
				Actions a=new Actions(driver);
				a.moveToElement(stock);
				a.perform();
			}
		}				
	}
	
	public void clickOnBuy()
	{
		buy.click();
	}
//	
//	public void selectShareByDropDown(WebDriver driver, String share)
//	{
//		Browser.explicitWait(driver, search, 3);
//		int size=selectByDropDown.size();
//		for(int i=0;i<size;i++)
//		{
//			WebElement Stock=selectByDropDown.get(i);
//			String stockName=Stock.getText();
//			System.out.println(stockName);
//			if(stockName.equals(share))
//			{
//				Actions a=new Actions(driver);
//				a.moveToElement(Stock);
//				a.perform();
//			}
//		}
//	}
	
}
