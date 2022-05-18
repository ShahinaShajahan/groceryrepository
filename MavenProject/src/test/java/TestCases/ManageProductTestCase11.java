package TestCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import ElemenRepository.Loginpage11;
import ElemenRepository.ManageProducts11;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ManageProductTestCase11 extends BaseClass11 {
	Loginpage11 lp;
	ManageProducts11 mp;

	@Test(priority=1,enabled=false)
	public void VerifyBackGroundColor() throws IOException {
		lp = new Loginpage11(driver);
		mp = new ManageProducts11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		mp.clickManageProduct();
		String actualTagName = mp.getBackgroundColor();
		String expectedTagName = "#dc3545";
		Assert.assertEquals(actualTagName, expectedTagName, "MisMatch");

	}
	@Test(priority=2,enabled=false)
	public void VerifyProductStatus() throws IOException, InterruptedException
	{
		lp = new Loginpage11(driver);
		mp = new ManageProducts11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		mp.clickManageProduct();
		Thread.sleep(3000);
		mp.mouseHoverToStatusbtn();
		Thread.sleep(3000);
		mp.clickStatusBtn();
		boolean Expected=mp.alert();
		Assert.assertEquals(true, Expected,"Product stauts being verified");
	}
	@Test(priority=3,enabled=true)
	public void verifyDeliveryBoyUserName() throws IOException, InterruptedException
	{
		lp = new Loginpage11(driver);
		mp = new ManageProducts11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		String Expected=mp.getUserText();
		String Actual="arya597";
		Assert.assertEquals(Actual, Expected,"Incorrect DeliveryBoy Username");
	}
	@Test(priority=4,enabled=true)
	public void VerifyDeliveryBoyPassword() throws IOException, InterruptedException
	{
		lp = new Loginpage11(driver);
		mp = new ManageProducts11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		String Expected=mp.getPwdText();
		String Actual="Details";
		Assert.assertEquals(Actual, Expected, "Incorrect DeliveryBoy password");
}	
}	
		
		
		
		
		
		
        


