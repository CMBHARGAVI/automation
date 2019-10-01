package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AboutsPage;

public class AboutsPageTest extends TestBase 
{
	AboutsPage aboutsPageObj;

	public AboutsPageTest()
	{
		super();
	}
	
	@BeforeTest
	public void setUp()
	{
		initialization();
		aboutsPageObj=new AboutsPage();

	}
	
	@Test(priority=2)
	public void CRMLogoTest()
	{
		boolean flag= aboutsPageObj.validateCRMImage();
		Assert.assertTrue(flag, "The logo is displayed");
	}
	
	@Test(priority=1)
	public void labelTest()
	{
		String actual= aboutsPageObj.labelDisplay();
		Assert.assertEquals(actual, "Free CRM About Us");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
