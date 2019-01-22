package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;




public class tests {

@Test

	
	public void testHDFCBankLinks() throws InterruptedException
	{ 
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.03\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");		
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("http://www.hdfcbank.com");
	driver.manage().window().maximize();
	
	Actions act1=new Actions(driver);
	act1.moveToElement(driver.findElement(By.xpath("//a@href='/personal/products']"))).perform();
	Thread.sleep(3000);
	act1.moveToElement(driver.findElement(By.xpath("//a@href='/personal/products/cards']"))).perform();
	Thread.sleep(3000);
	act1.click(driver.findElement(By.linkText("Credit Cards"))).perform();
	
	Assert.assertTrue(driver.getCurrentUrl().endsWith("Credit_cards"));
			
	
	
	
	}


	
}
