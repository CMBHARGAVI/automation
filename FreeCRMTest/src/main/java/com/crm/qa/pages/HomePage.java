package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase 
{
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement aboutLink;
	
	@FindBy(xpath="//ul[@class='rd-navbar-nav']/a")
	WebElement firstloginBtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
		
	}
	
	public boolean aboutLinkVisibility()
	{
		return aboutLink.isDisplayed();
	}

	public LoginPage loginPress()
	{
		
		firstloginBtn.click();
		return new LoginPage();
	}
}
