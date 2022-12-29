package genericlibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webelementsutilies 
{
	public void dropdown(WebElement ele,String txt)
	{
		Select s = new Select(ele);
		
		s.selectByVisibleText(txt);
	}
	
	public void mousehover(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		
		a.moveToElement(ele).perform();;
	}
	
	public void rightclick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		
		a.contextClick(ele).perform();
	}
	
	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		
		a.doubleClick(ele).perform();
	}
	
	public void draganddrop(WebDriver driver,WebElement src,WebElement dest)
	{
		Actions a = new Actions(driver);
		
		a.dragAndDrop(src,dest).perform();
	}
	
	public void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void switchtoframe(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	public void switchbackframe(WebDriver driver)
	{
		driver.switchTo().defaultContent();	
	}
	
	public void scrollbar(WebDriver driver,int x, int y)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void switchtab(WebDriver driver)
	{
		 Set<String> child = driver.getWindowHandles();
		 
		 for(String b:child)
		 {
			 driver.switchTo().window(b);
		 }
	}
}
