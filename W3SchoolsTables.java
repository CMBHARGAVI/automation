package com.sample.assignments;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class W3SchoolsTables 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.xpath("//a[@title='Search W3Schools']"));
		search.click();
		
		WebElement searchinput =driver.findElement(By.xpath("//input[@id=\"gsc-i-id1\"]"));
		searchinput.sendKeys("Html tables");
	
		WebElement searchbutton =driver.findElement(By.xpath("//td[@class=\"gsc-search-button\"]/button"));
		searchbutton.click();
		
		WebElement htmltableslink=driver.findElement(By.xpath("//div[@class = 'gs-title']/a/b[text()='HTML Tables']"));
		htmltableslink.click();
		
		Set <String> s= driver.getWindowHandles();
		List <String> w= new ArrayList<String>(s);
		
		driver.switchTo().window(w.get(1));
		
		List <WebElement> elements=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		int rowsize = elements.size();
		System.out.println("Number of rows " + rowsize);
		System.out.println("Countries having string length less than 5 are: ");

		
		for(int i=2; i<elements.size()+1 ;i++)
		{
			WebElement table=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ i +"]/td[3]"));
			String s1=table.getText();

			if(s1.length() <= 5)
			{
				System.out.println(s1);
				
			}
	
		}
		
		driver.quit();
		

	}

}
