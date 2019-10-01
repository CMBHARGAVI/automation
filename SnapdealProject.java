package com.sample.assignments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;;

public class SnapdealProject 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions builder= new Actions(driver);
		
		WebElement computerandgaming = driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[4]/a/span[2]"));
		Action mouseover= builder.moveToElement(computerandgaming).build();
		mouseover.perform();
		//computerandgaming.click();
		
		WebElement memorycard = driver.findElement(By.xpath("//*[@id=\"category4Data\"]/div[1]/div/div/p[14]/a/span"));
		memorycard.click();
		
		WebElement viewmore = driver.findElement(By.xpath("//div[@data-name='Capacity_s']/following-sibling::button[contains(text(),'View')]"));
		//scrolldown
		scrollIntoView(viewmore,driver);
		
		viewmore.click();
		//checkboxes
		
		WebElement gb8= driver.findElement(By.xpath("//input[@class='filter-value']/following-sibling::label[@for='Capacity_s-8 GB']"));
		gb8.click();
		System.out.println("8gb text box selected: "+ driver.findElement(By.xpath("//input[@id='Capacity_s-8%20GB']")).isSelected());
		Thread.sleep(2000);
		WebElement gb16= driver.findElement(By.xpath("//input[@id='Capacity_s-16%20GB']/following-sibling::label[@for='Capacity_s-16%20GB']"));
		gb16.click();
		
		System.out.println("16gb text box selected: "+ driver.findElement(By.xpath("//input[@id='Capacity_s-16%20GB']")).isSelected());
		driver.quit();
	}
	
	public static void scrollIntoView(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}

}
