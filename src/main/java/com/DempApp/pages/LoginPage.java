package com.DempApp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	//Page locators:
	
	By username = By.xpath("//input[@id='Email']");
	By password = By.xpath("//input[@id='Password']");
	By loginButton = By.cssSelector(".buttons>input[type='submit']");
	
	//Pageactions
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	public void doLogin(String uname, String pwd)
	{
		doSendkeys(username, uname);
		doSendkeys(password, pwd);
		doClick(loginButton);
	}

}
