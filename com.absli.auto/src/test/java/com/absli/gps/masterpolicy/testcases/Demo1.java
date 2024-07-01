package com.absli.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
public void demoEx() throws Throwable
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.get("http://113.193.29.163/ABSLI/Account/Login");
	driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("gradatim");
	driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("Password1$");
	driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
	driver.findElement(By.id("liClient")).click();
//	Actions actions = new Actions(driver);
//	actions.scrollByAmount(0, 50);
	driver.findElement(By.id("li_11060")).click();
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("window.scrollBy(0,4000)");
	driver.findElement(By.id("ContentPlaceHolder1_UpdatePanel3")).click();
			
}

}
