package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_login 
{
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement Gearstab;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement Demoapptab;
	
	@FindBy(name="q")
	private WebElement Searchtb;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Searchclk;
	
	public Skillrary_login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gearstb()
	{
		Gearstab.click();
	}
	
	public void demoapptb()
	{
		Demoapptab.click();
	}
	
	public void Searchtextbox(String course)
	{
		Searchtb.sendKeys(course);
	}
	
	public void Searchicon()
	{
		Searchclk.click();
	}
	
	
	
}
