package com.DempApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	//Locators
	By loggeduser = By.cssSelector("div.header-links>ul>li>.account");
	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
	
	//Actions
	public String getLOggedUser()
	{
		return doGetText(loggeduser);
	}

}
