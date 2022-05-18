package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import ElemenRepository.HomePage11;
import ElemenRepository.Loginpage11;

public class HomePageTestCase11 extends BaseClass11 {

	HomePage11 hp;
	Loginpage11 lp;

	@Test(enabled=false)
	public void verifyLoggedUserName() throws IOException {
		hp = new HomePage11(driver);
		lp = new Loginpage11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();

		String actualLoginUserNameText = hp.getAdminName();
		String expectedLoginUserNameText = "Admin";
		Assert.assertEquals(actualLoginUserNameText, expectedLoginUserNameText, "MisMatch");

	}

	@Test(enabled=false)
	public void verifyHomePageTitle() throws IOException
	{
		hp = new HomePage11(driver);
		lp = new Loginpage11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();

		String actualLoginUserNameText = hp.gettTitle();
		String expectedLoginUserNameText = ConstantClass.Title;
		Assert.assertEquals(actualLoginUserNameText, expectedLoginUserNameText, "MisMatch");

	}
	
	@Test(enabled=false)
	public void verifyUpdatingCOD() throws IOException
	{
		hp = new HomePage11(driver);
		lp = new Loginpage11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		hp.mouseHoverMoreInformation();
		hp.clickMoreInfo();

		boolean ActualResult = hp.isCODselected();
		Assert.assertEquals(ActualResult, true,"COD information is being Added");

	}
	@Test(enabled=false)
	public void verifyCOD() throws IOException
	{
		hp = new HomePage11(driver);
		lp = new Loginpage11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		hp.mouseHoverMoreInformation();
		hp.clickMoreInfo();

		boolean ActualResult = hp.isNoBtnCODselected();
		Assert.assertEquals(ActualResult, false,"COD information is being not added");

	}
	@Test(priority=6,enabled=true)
	public void verifyList() throws IOException
	{
		hp = new HomePage11(driver);
		lp = new Loginpage11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		hp.scroldowm();
		hp.clickSlider();
		hp.clickNewBtn();
		
		boolean actual=hp.isselectable();
		Assert.assertTrue(actual, "List is not selectable");
	}
	
	@Test(priority=7,enabled=false)
	public void verifyListOfItems() throws IOException
	{
		hp = new HomePage11(driver);
		lp = new Loginpage11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		hp.scroldowm();
		hp.clickSlider();
		hp.clickNewBtn();
		hp.selectFromList("Fruits & Vegetables");
		
		String expected="Fruits & Vegetables";
		String actual=hp.getDropDownText();
		Assert.assertEquals(actual, expected);
	}
	@Test(priority=6,enabled=false)
	public void verifyAdminUsers() throws IOException
	{
		hp = new HomePage11(driver);
		lp = new Loginpage11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		
		String expected=hp.getUserDetails();
		String actual="123456789";
		Assert.assertEquals(actual, expected,"Admin User's pwd is incorrect");
	}
	
}
