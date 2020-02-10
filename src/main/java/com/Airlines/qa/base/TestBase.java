package com.Airlines.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Airlines.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver=null;
	public static Properties prop;
	public TestBase() { 
		try{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("/Users/pavani.jagu/eclipse-workspace/MarsAirlines/src/main/java/com/Airlines/qa/config/config.properties");
		prop.load(ip);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	}	
 public static void initialization() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver", "/Users⁩/pavani.jagu⁩/⁨Documents⁩/⁨MarsAirlines⁩/chromedriver⁩");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LONG_TIMEOUT, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    driver.get("https://marsair.thoughtworks-labs.net/lakshmijagu"); 
	    
	String browserName=prop.getProperty("browser"); 
	if(browserName.equals("chrome"))
	{
		Thread.sleep(3000);
		//System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver⁩");
		driver=new ChromeDriver();
		 driver.get(prop.getProperty("url")); 
	}
	/*else if(browserName.equals("FF")){
		System.setProperty("webdriver.gecko.driver", "⁨/Users⁩/⁨pavani.jagu⁩/⁨Documents⁩/⁨MarsAirlines/geckodriver⁩");
		driver=new FirefoxDriver();	}*/	
	driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LONG_TIMEOUT, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    driver.get(prop.getProperty("url")); 
    
	}
 }

 
