package com.DemoApp.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DempApp.pages.HomePage;
import com.DempApp.pages.LoginPage;

public class HomePageTest extends BaseTests {
	
	
	@Test(priority=1)
	public void verifyHomePageTitle()
	{
		page.getInstance(LoginPage.class).doLogin("test321@testing.com", "India321");
		String homepagetitle = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println("Home page title is  "+homepagetitle);
		Assert.assertEquals(homepagetitle, "Demo Web Shop");
		
	}
	
	@Test(priority=2)
	public void verifywhoislogged()
	{
		page.getInstance(LoginPage.class).doLogin("test321@testing.com", "India321");
		String Loggedusername = page.getInstance(HomePage.class).getLOggedUser();
		System.out.println("User is logged --- "+Loggedusername);
		Assert.assertEquals(Loggedusername, "test321@testing.com");
	}

}
