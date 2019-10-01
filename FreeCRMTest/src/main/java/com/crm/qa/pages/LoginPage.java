package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	//Object Repository-Page Factory
	
	
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	
	
	//initialization
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	
	public void login(String un,String pwd)
	{
		//FirstloginBtn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		System.out.println("Login Succesful");
	}
}


