package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenium_Training_page 
{
	@FindBy(id="add")
	private WebElement Addbutton;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement Addtocartbutton;
	
	public  Selenium_Training_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddbutton() {
		return Addbutton;
	}
	
	public void Addtocart()
	{
		Addtocartbutton.click();
	}
}
