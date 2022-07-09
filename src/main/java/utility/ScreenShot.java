package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static String  date()
	{
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
		LocalDateTime curdt=LocalDateTime.now();
		String dt=dtf.format(curdt);
		return dt;
	}
	
	public static void snap(WebDriver driver, String name) throws IOException
	{
		String d=ScreenShot.date();
		//TakesScreenShot t=(TakesScreenShot)driver;
		//File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File("D:\\Velocity\\SrceenShot\\"+name+d+".jpeg");
		FileHandler.copy(source, destination);
		
	}

}
