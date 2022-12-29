package com.pom.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_search 
{	
		@FindBy(xpath="//a[contains(text(),'Trainin')]")
		private WebElement Traininln;
		
		public Skillrary_search(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		public void trainin()
		{
			Traininln.click();
		}

}
