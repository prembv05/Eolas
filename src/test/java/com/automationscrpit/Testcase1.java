package com.automationscrpit;

import org.testng.annotations.Test;

import com.pom.pages.Selenium_Training_page;
import com.pom.pages.Skillrary_course;
import com.pom.pages.Skillrary_login;

import genericlibrary.StepGroup;

public class Testcase1 extends StepGroup
{
	@Test
	public void tc1() 
	{
		Skillrary_login sl = new Skillrary_login(driver);
		sl.gearstb();
		sl.demoapptb();
		
		Skillrary_course sc = new Skillrary_course(driver);
		Wutil.switchtab(driver);
		Wutil.mousehover(driver,sc.getCoursetab());
		sc.seleniumtrainingtb();
		
		Selenium_Training_page stp =new Selenium_Training_page(driver);
		Wutil.doubleclick(driver,stp.getAddbutton());
		stp.Addtocart();
		Wutil.alertpopup(driver);
	}
}
