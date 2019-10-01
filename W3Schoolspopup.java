package com.sample.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schoolspopup {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		String baseurl="https://www.w3schools.com";
		WebDriver driver= new ChromeDriver();
		driver.get(baseurl);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/i"));
		search.click();
		
		WebElement jspopup= driver.findElement(By.xpath("//div//form//input"));
		jspopup.sendKeys("javascript popup");
		
		WebElement searchbutton = driver.findElement(By.xpath("//button[@class]"));
		searchbutton.click();
		
		WebElement jspopuplink =driver.findElement(By.xpath("//div[@class = 'gs-title']/a/b[text()='JavaScript Popup']"));
		jspopuplink.click();
		
		Set <String> s1= driver.getWindowHandles();
		List <String> w1= new ArrayList<String>(s1);
		System.out.println(w1);
		driver.switchTo().window(w1.get(1));
		
		WebElement TryItYourself = driver.findElement(By.xpath("//span[contains(text(),'OK')]/../../following-sibling::a[contains(text(),'Try')]"));
		TryItYourself.click();
		
		Set <String> s2= driver.getWindowHandles();
		List <String> w2= new ArrayList<String>(s2);
		System.out.println(w2);
		driver.switchTo().window(w2.get(2));
		
		driver.switchTo().frame("iframeResult");
		WebElement TryIt= driver.findElement(By.xpath("//p[@id='demo']/preceding-sibling::button[contains(text(),'Try')]"));
		TryIt.click();
		
		
		
		
		try 
		{
			Alert alert= driver.switchTo().alert();
			System.out.println("Alert: " + alert.getText());
			
			alert.accept();
			System.out.println("You pressed Ok");
			
			System.out.println("Click Try it again");
			Thread.sleep(2000);
			
			TryIt.click();
			
			System.out.println("Alert: " + alert.getText());
			alert.dismiss();
			System.out.println("You pressed cancel");
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		driver.quit();

	}

}
