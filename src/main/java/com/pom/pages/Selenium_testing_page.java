package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenium_testing_page 
{
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement Seleniumtdd;
	
	@FindBy(id="mycart")
	private WebElement Mycart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement FB;
	
	public Selenium_testing_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSeleniumtdd() 
	{
		return Seleniumtdd;
	}

	public WebElement getMycart() {
		return Mycart;
	}

	public WebElement getFB() {
		return FB;
	}
	
	public void facebook()
	{
		FB.click();
	}
	
	
}
