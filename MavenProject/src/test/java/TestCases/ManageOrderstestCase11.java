package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElemenRepository.Loginpage11;
import ElemenRepository.ManageOrders11;

public class ManageOrderstestCase11 extends BaseClass11 {
    Loginpage11 lp;
    ManageOrders11 mo;
    
	@Test(priority=1,enabled=false)
  public void verifyFont() throws IOException {
		lp=new Loginpage11(driver);
		mo=new ManageOrders11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		mo.clickManageOrders();
		mo.clickSearchButton();
		String actualFont=mo.getManageOrderFont();
		String expectedFont="16px";
		Assert.assertEquals(actualFont,expectedFont,"MisMatch");
		
  }
	@Test(priority=2,enabled=false)
	public void verifyOrderId() throws IOException {
		lp=new Loginpage11(driver);
		mo=new ManageOrders11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		mo.clickManageOrders();
		
		String actualValue=mo.getOrderID();
		String expectedValue="620";
		Assert.assertEquals(actualValue,expectedValue,"OrderID of Customer Parvathy is matched");
		
  }
	@Test(priority=3,enabled=false)
	public void verifyListofDeliveryBoy() throws IOException {
		lp=new Loginpage11(driver);
		mo=new ManageOrders11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		mo.clickManageOrders();
		
		
		int actual=mo.totList();
		int expected=92;
		Assert.assertEquals(actual,expected,"Total list verfied");
		
  }
	@Test(priority=4,enabled=false)
	public void verifyDeliveryBoy() throws IOException {
		lp=new Loginpage11(driver);
		mo=new ManageOrders11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		mo.clickManageOrders();
		mo.assignDeliBy();
		
		String actualValue=mo.getNm();
		String expectedValue="jack";
		Assert.assertEquals(actualValue,expectedValue,"DeliveryBoy is not assigned ");
		
  }
	@Test(priority=5,enabled=false)
	public void verifyOrderDetails() throws IOException {
		lp=new Loginpage11(driver);
		mo=new ManageOrders11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		mo.clickManageOrders();
		
		
		boolean actualValue=mo.isviewable();
		boolean expectedValue=true;
		Assert.assertEquals(actualValue,expectedValue,"Details are not viewed");
		
}

	@Test(priority=6,enabled=true)
	public void verifuploadFile() throws IOException {
		lp=new Loginpage11(driver);
		mo=new ManageOrders11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		
		
		
		boolean actualValue=mo.isChoosable();
		boolean expectedValue=true;
		Assert.assertEquals(actualValue,expectedValue,"uploading failed");
		
}
}
