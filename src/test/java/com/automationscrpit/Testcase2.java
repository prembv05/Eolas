package com.automationscrpit;

import java.io.IOException;

import org.openqa.selenium.Point;

import org.testng.annotations.Test;

import com.pom.pages.Selenium_testing_page;
import com.pom.pages.Skillrary_course;
import com.pom.pages.Skillrary_login;

import genericlibrary.StepGroup;

public class Testcase2 extends StepGroup
{
	@Test
	public void tc2() throws IOException
	{
		Skillrary_login sl = new Skillrary_login(driver);
		sl.gearstb();
		sl.demoapptb();
		
		Skillrary_course sc = new Skillrary_course(driver);
		Wutil.switchtab(driver);
		Wutil.dropdown(sc.getSelectcatdd(),pdata.getPropertydata("coursedd"));
		
		Selenium_testing_page stp = new Selenium_testing_page(driver);
		Wutil.draganddrop(driver,stp.getSeleniumtdd(),stp.getMycart());
		Point loc = stp.getFB().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		Wutil.scrollbar(driver,x,y);
		
		stp.facebook();
		
	}
}
