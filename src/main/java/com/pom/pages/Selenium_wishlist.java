package com.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selenium_wishlist 
{
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playbt;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pausebt;
	
	@FindBy(xpath="//span[text()=\"Add To Wishlist\"]")
	private WebElement Wishlist;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement closeapp;
	
	public Selenium_wishlist(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Close()
	{
		closeapp.click();
	}
	public void playbutton()
	{
		playbt.click();
	}
	
	public void pausebutton()
	{
		pausebt.click();
	}
	
	public void addWish()
	{
		Wishlist.click();
	}
}
