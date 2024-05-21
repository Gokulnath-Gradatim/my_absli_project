package com.absli.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.absli.utill.TestUtill;



public class AbsliBase {

	public static WebDriver driver; 
	public static Properties prof;
	//public static Logger log;
	
	
	public AbsliBase() 
	{
		try {
			prof = new Properties();
			FileInputStream ip;
			ip = new FileInputStream("C:\\Users\\Gokulnath\\eclipse-workspace\\com.absli.auto\\src\\main\\java\\com\\absli\\config\\BasicConfig.properties");
			prof.load(ip);
			//log = LogManager.getLogger(AbsliBase.class);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}catch (IOException e) {

			e.printStackTrace();
		}
		
	}

	public static void initialization()
	{
		String browserName = prof.getProperty("browser");
		if (browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
			
		}
		else if (browserName.equals("FireFox")) 
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtill.Implicitly_Wait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtill.pageLoad_Timeout));
		driver.manage().deleteAllCookies();
		driver.get(prof.getProperty("url"));
	}

	public static void end()
	{
		driver.manage().window().minimize();
		driver.quit();
	}
	
	public static void selectVisibleText(WebElement elementName, String visibleText)
	{
		Select select = new Select(elementName);
		select.selectByVisibleText(visibleText);
		
	}

}
