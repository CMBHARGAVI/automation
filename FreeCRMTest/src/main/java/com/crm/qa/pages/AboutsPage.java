package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AboutsPage extends TestBase
{
	
	@FindBy(xpath="//div[@class='rd-navbar-brand']/a[@title='free crm home']/span[@class='brand-slogan']")
	WebElement crmLogo;
	
	@FindBy(xpath="//h1[@class='offset-top-20']")
	WebElement label;
	
	public AboutsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateCRMImage()
	{
		return crmLogo.isDisplayed();
	}
	
	public String labelDisplay()
	{
		return label.getText();
	}
	
	
}
