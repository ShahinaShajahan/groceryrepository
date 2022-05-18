package TestCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import ElemenRepository.Loginpage11;

public class LoginTestCase11 extends BaseClass11 {
	Loginpage11 lp;

	@Test(enabled = false)

	public void verifyLoginButtonTextTC01() {
		lp = new Loginpage11(driver);
		String actualLoginText = lp.getLoginText();
		String expectedLoginText = "Sign In";
		Assert.assertEquals(actualLoginText, expectedLoginText, "MisMatch");

	}

	@Test(enabled = true)
	public void verifyCheckBox() throws IOException, InterruptedException {
		lp = new Loginpage11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.checkboxClick();
		
		boolean Actual =lp.isRememberMeSelected() ;
		boolean Expected = true;
		Assert.assertNotEquals(Actual, Expected, "notchecked");
	}
	@Test(enabled=false)
	public void verifyInvalidLogin() throws InterruptedException {
		lp = new Loginpage11(driver);
		lp.enterInvalidUserName("asdf");
		lp.enterInvalidPassWord("234");
		lp.clickLogin();
		Thread.sleep(3000);
		String Expected=lp.getPassword();
		String Actual="admin";
		Assert.assertNotEquals(Actual, Expected,"InvalidPassword");
		
	}
	
	
	
	
}
