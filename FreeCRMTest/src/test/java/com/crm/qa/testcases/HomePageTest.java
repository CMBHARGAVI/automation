package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.HomePage;


public class HomePageTest extends TestBase 
{
	HomePage homePageObj;
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		homePageObj= new HomePage();
	}
	
	@Test(priority=1,alwaysRun = true)
	public void titleTest()
	{
		String actualtitle= homePageObj.verifyTitle();
		Assert.assertEquals(actualtitle, "Free CRM About cloud CRM software and services");
	}
	
	@Test(priority=2,alwaysRun = true)
	public void actionLinkDisplayTest()
	{
		boolean flag= homePageObj.aboutLinkVisibility();
		Assert.assertTrue(flag, "Action link is visible");
	}
	
	@Test(priority=3,alwaysRun = true)
	public void loginButtonTest()
	{
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
