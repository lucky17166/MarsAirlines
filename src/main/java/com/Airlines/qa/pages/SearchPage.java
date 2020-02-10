package com.Airlines.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Airlines.qa.base.TestBase;

public class SearchPage extends TestBase {
	@FindBy(xpath="[@id=\"content\"]/h2")
	WebElement marsSearchText;
	@FindBy(xpath="[@id=\"content\"]/p[1]")
	WebElement marsNotfoundText;
	@FindBy(xpath="[@id=\"content\"]/p[2]/a")
	WebElement marsSearchBackButton;
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateSearchText()
	{
		return marsSearchText.isDisplayed();
	}
	
	public boolean validateNotfoundText()
	{
		return marsNotfoundText.isDisplayed();
	}
	public void validateSearchBackButton()
	{
		marsSearchBackButton.click();
	}

}
