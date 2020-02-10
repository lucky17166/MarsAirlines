package com.Airlines.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Airlines.qa.base.TestBase;

public class WelcomePage extends TestBase {
	//Defining PageFactory or ObjectRepository
	@FindBy(xpath="//*[@id=\"app\"]/h1/a")
	WebElement marsLogo;
	
	@FindBy(xpath="[@id=\"content\"]/h2")
	WebElement marsWelcomemsg;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/h3")
	WebElement marsBookATicketmsg;
	
	@FindBy(xpath="[@id=\"content\"]//dl[1]/dt/label")
	WebElement marsDeparting;
	
	@FindBy(xpath="[@id=\"content\"]//dl[2]/dt/label")
	WebElement marsReturning;
	
	@FindBy(xpath="[@id=\"content\"]//dl[3]/dt/label")
	WebElement marsPromoCode;
	
	@FindBy(xpath="[@id=\"content\"]//dl[4]/dd/input")
	WebElement marsSearchButton;
	
	@FindBy(css="#departing")
	WebElement marsDeptDD;
	
	@FindBy(css="#returning")
	WebElement marsretDD;
	
	@FindBy(css="#promotional_code")
	WebElement marsPromocodebox;
	//Initializing the PageObjects
	public WelcomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() 
	{
		return driver.getTitle();
	}
	
	public boolean validateMarsLogo()
	{
		return marsLogo.isDisplayed();
	}
	
	public boolean validateWelcomemsg()
	{
		return marsWelcomemsg.isDisplayed();
	}
	
	public boolean validateMarsBookATicketmsg()
	{
		return marsBookATicketmsg.isDisplayed();
	}
	
	public boolean validateDepartingText()
	{
		return marsDeparting.isDisplayed();
	}
	
	public boolean validateMarsReturningText()
	{
		return marsReturning.isDisplayed();
	}
	
	public boolean validateMarsPromoCode()
	{
		return marsPromoCode.isDisplayed();
	}
	
	public void validateSearchButton()
	{
		marsSearchButton.click();
	}
	public void validateDeptDD(String dept)
	{
		Select drpMonth = new Select(marsDeptDD);
		drpMonth.selectByVisibleText(dept);
	}
	
	public void validateRetrnDD(String retrn)
	{
		Select drpMonth = new Select(marsretDD);
		drpMonth.selectByVisibleText(retrn);
	}

	public SearchPage validatePromoCode(String promo)
	{
		marsPromocodebox.sendKeys(promo);
		marsSearchButton.click();
		return new SearchPage();
	}
}
