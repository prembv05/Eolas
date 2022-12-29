package genericlibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	public void screenshots(WebDriver driver,String name) throws IOException
	{
		Date dt= new Date();
		String currentdate = dt.toString().replaceAll(":","-");
		
		TakesScreenshot Ts = (TakesScreenshot) driver;
		
		File ss = Ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(autoconstant.photoPath+currentdate+name+".png");
		
		FileUtils.copyFile(ss, dest);
	}
}
