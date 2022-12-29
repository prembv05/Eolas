package com.automationscrpit; 

import java.io.IOException;


import org.testng.annotations.Test;

import com.pom.pages.Selenium_wishlist;
import com.pom.pages.Skillrary_login;
import com.pom.pages.Skillrary_search;

import genericlibrary.StepGroup;

public class Testcase3 extends StepGroup
{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		Skillrary_login sl = new Skillrary_login(driver);
		sl.Searchtextbox(pdata.getPropertydata("course_name"));
		sl.Searchicon();
		
		Skillrary_search ss = new Skillrary_search(driver);
		ss.trainin();
		
		Selenium_wishlist sw =new Selenium_wishlist(driver);
		sw.Close();
		Wutil.switchtoframe(driver);
		sw.playbutton();
		Thread.sleep(1000);
		sw.pausebutton();
		Wutil.switchbackframe(driver);
		sw.addWish();
		
	}

	
}


