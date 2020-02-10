package com.Airlines.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Airlines.qa.base.TestBase;
import com.Airlines.qa.pages.SearchPage;
import com.Airlines.qa.pages.WelcomePage;

public class WelcomePageTest extends TestBase{
	WelcomePage welcomepage;
	public WelcomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUP() throws InterruptedException{
		initialization();
		welcomepage=new WelcomePage();
	}
	
	@Test
	public void LoginPageTitleTest() {
	String title=welcomepage.validateLoginPageTitle();
	Assert.assertEquals(title, "Mars Airlines: Home");
	}
	
	@Test
	public void marsLogoTest()
	{
		boolean logoFlag=welcomepage.validateMarsLogo();
		Assert.assertTrue(logoFlag);	
	}
	
	@Test
	public void WelcomemsgTest() {
		boolean welcomeFlag=welcomepage.validateWelcomemsg();
		Assert.assertTrue(welcomeFlag);
	}
	
	@Test
	public void BookATicketmsgTest() {
		boolean ticketFlag=welcomepage.validateMarsBookATicketmsg();
		Assert.assertTrue(ticketFlag);
	}
	
	@Test
	public void DepartingTextTest() {
		boolean DeptFlag=welcomepage.validateDepartingText();
		Assert.assertTrue(DeptFlag);
	}
	
	@Test
	public void ReturningTextTest() {
		boolean RetuFlag=welcomepage.validateMarsReturningText();
		Assert.assertTrue(RetuFlag);
	}
	@Test
	public void PromoCodeTest() {
		boolean promoFlag=welcomepage.validateMarsPromoCode();
		Assert.assertTrue(promoFlag);	
	}
	@Test
	public void DeptDDTest(){
		welcomepage.validateDeptDD("December");
	}
	@Test
	public void RetrntDDTest(){
		welcomepage.validateRetrnDD("December (next year)");
	}
	@Test
	public void PromoCodeSendkeys() {
		boolean sp=welcomepage.validateMarsPromoCode();
	}	
	
	@AfterMethod
	public void tearDown(){
	driver.quit();
	}

}
