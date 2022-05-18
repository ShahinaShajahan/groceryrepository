package TestCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import ElemenRepository.Loginpage11;
import ElemenRepository.ManageExpense11;

public class ManageExpenseTestCase11 extends BaseClass11 {

	Loginpage11 lp;
	ManageExpense11 mp;

	@Test(priority = 1, enabled = false)
	public void verifyManageExpTagName() throws IOException, InterruptedException {
		lp = new Loginpage11(driver);
		mp = new ManageExpense11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		mp.clickManageExp();
		String actualTagName = mp.getManageExpTagName();
		String expectedTagName = "p";
		Assert.assertEquals(actualTagName, expectedTagName, "MisMatch");

	}

	@Test(priority = 2, enabled=false)
	public void verifyManageExpenseMessageBox() throws IOException, InterruptedException {
		lp = new Loginpage11(driver);
		mp = new ManageExpense11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		mp.clickManageExp();
		mp.clickManageExpense();
		mp.moveToEditButton();
		mp.clickEditbutton();
		mp.editAmount();
		mp.scrolDown();
		Thread.sleep(3000);
		mp.clickUpdate();
		Thread.sleep(3000);
		Assert.assertEquals(true, mp.getMessage());
	
		

	}

	@Test(priority = 3,enabled=false)
	public void verifyExpenseCatogaryMessageText() throws IOException, InterruptedException {
		lp = new Loginpage11(driver);
		mp = new ManageExpense11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		mp.clickManageExp();
		mp.clickExpenseCatogary();
		mp.moveToNewButton();
		mp.clickNewbutton();
		mp.editTitile();
		mp.moveToSave();
		mp.clickSaveBtn();
		String expected = mp.getMessageText();
		String Actual = "Expense Category Created Successfully";
		Assert.assertNotEquals(Actual, expected, "MisMatch");

	}
	
	@Test(priority = 4,enabled=true)
	public void verifyExpenseCatogaryTitleText() throws IOException, InterruptedException {
		lp = new Loginpage11(driver);
		mp = new ManageExpense11(driver);
		lp.enterUserName(lp.xlStringReadCredentials(0,1));
		lp.enterPassWord(lp.xlStringReadCredentials(1, 1));
		lp.clickLogin();
		mp.clickManageExp();
		mp.clickExpenseCatogary();
		mp.moveToNewButton();
		mp.clickNewbutton();
		
		boolean expected = mp.isTextable();
		boolean Actual = false;
		Assert.assertNotEquals(Actual, expected, "MisMatch");

	}
}
