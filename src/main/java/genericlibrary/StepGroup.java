package genericlibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StepGroup 
{
	public WebDriver driver;
	
	public PropertyFile pdata= new PropertyFile();
	
	public Webelementsutilies Wutil =new Webelementsutilies();
	
	@BeforeMethod
	public void openapp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(pdata.getPropertydata("url"));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeapp(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		String name = res.getName();
		
		if(status == 2 )
		{
			Screenshot s = new Screenshot();
			s.screenshots(driver,name);
		}
		driver.quit();
	}
	
}
