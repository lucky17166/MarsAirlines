package com.Airlines.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Airlines.qa.base.TestBase;
import com.Airlines.qa.pages.SearchPage;

public class SearchPageTest extends TestBase {
	SearchPage searchpage;
	public SearchPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUP() throws InterruptedException{
		initialization();
		searchpage=new SearchPage();
	}
	
	@Test
	public void SearchTextTest() {
		boolean searchFlag=searchpage.validateSearchText();
		Assert.assertTrue(searchFlag);
	}
	
	@Test
	public void NotfoundText() {
		boolean noTextFoundFlag=searchpage.validateNotfoundText();
		Assert.assertTrue(noTextFoundFlag);
		searchpage.validateSearchBackButton();
		
	}
	@AfterMethod
	public void tearDown(){
	driver.quit();
	}

}
