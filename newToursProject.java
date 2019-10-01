package com.sample.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newToursProject
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List <WebElement> elements=driver.findElements(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]"));
		int rowsize = elements.size();
		System.out.println(rowsize);
		
		
		for(int i=rowsize ; i>0 ;i--)
		{
			WebElement element=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr["+ (i) +"]/td[2]"));
			System.out.println(element.getText());
			element.click();
			//driver.navigate().back();	
		}
		driver.quit();

	}

}
