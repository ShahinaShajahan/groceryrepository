package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;



import ElemenRepository.DashBoard11;
import ElemenRepository.Loginpage11;

public class DashBoardTestCase11 extends BaseClass11 {
	Loginpage11 lp;
	DashBoard11 db;

	@Test(priority=1,enabled=false)
	public void verifyDashBoardText() throws IOException {
		lp = new Loginpage11(driver);
		db = new DashBoard11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();

		String actualDashBoardText = db.getDashBoardText();
		String expectedDashBoardText = "Dashboard";
		Assert.assertEquals(actualDashBoardText, expectedDashBoardText, "MisMatch");

	}
	@Test(priority=2,enabled=false)
	public void VerifyDashBoardAttribute() throws IOException
	{
		lp = new Loginpage11(driver);
		db = new DashBoard11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();

		String actualDashBoardText = db.getAttribut();
		String expectedDashBoardText = "https://groceryapp.uniqassosiates.com/admin/home";
		Assert.assertEquals(actualDashBoardText, expectedDashBoardText, "MisMatch");

	}
	@Test(priority=3,enabled=false)
	public void verifyDashBoardLogo() throws IOException
	{
		lp = new Loginpage11(driver);
		db = new DashBoard11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();

		boolean actual = db.getLogo();
		boolean expected = true;
		Assert.assertEquals(actual, expected, "MisMatch");

	}
	@Test(priority=4,enabled=false)
	public void verifyTotalLinks() throws IOException, InterruptedException
	{
		lp = new Loginpage11(driver);
		db = new DashBoard11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
        
		Assert.assertEquals(db.getCount(), 54);
	}
	
	@Test(priority=5,enabled=true)
	public void verifyNewPassWordText() throws IOException, InterruptedException
	{
		lp = new Loginpage11(driver);
		db = new DashBoard11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		Thread.sleep(2000);
		db.getSelectAdmin();
		Thread.sleep(3000);
		db.getSelectSettng();
		
        boolean actual=db.isPwdTxtEnabled();
        Assert.assertEquals(actual, true);;

	}
}
	
	

