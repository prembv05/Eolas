package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_course 
{
	@FindBy(id="course")
	private WebElement Coursetab;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement Trainingtab;
	
	@FindBy(name="addresstype")
	private WebElement Selectcatdd;
	
	public Skillrary_course(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCoursetab() 
	{
		return Coursetab;
	}
	
	public WebElement getSelectcatdd() 
	{
		return Selectcatdd;
	}
	
	public void seleniumtrainingtb()
	{
		Trainingtab.click();
	}

	

	
	
	
}
