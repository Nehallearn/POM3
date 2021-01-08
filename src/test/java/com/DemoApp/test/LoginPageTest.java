package com.DemoApp.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DempApp.pages.LoginPage;

public class LoginPageTest extends BaseTests{
	
	
	@Test(priority=1)
	public void loginPagetitletest()
	{
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("Login page title is --  "+title);
		Assert.assertEquals(title, "Demo Web Shop. Login");
	}
	
	@Test(priority=2)
	public void loginPagesignintest()
	{
		page.getInstance(LoginPage.class).doLogin("test321@testing.com", "India321");
	}

}
