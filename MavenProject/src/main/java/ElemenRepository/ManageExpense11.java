package ElemenRepository;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.obsqura.Utilities.GU;
import com.obsqura.Utilities.WaitClass;

public class ManageExpense11 {

	WebDriver driver;
	GU gu = new GU();
	WaitClass wt = new WaitClass();

	public ManageExpense11(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//p[contains(text(),'Manage Expense')]//i")
	WebElement manageExp;

	@FindBy(xpath = "//p[contains(text(),'Expense Category')]")
	WebElement expenseCatogry;

	@FindBy(xpath = "//p[text()='Manage Expense']")
	WebElement manageExpense;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Expense/edit?edit=305&page_ad=1']")
	WebElement editButton;

	@FindBy(xpath = "//div//a[@class='btn btn-rounded btn-danger']")
	WebElement newBtn;

	@FindBy(xpath = "//select[@id='user_id']")
	WebElement userDropDown;

	@FindBy(xpath = "//input[@id='amount']")
	WebElement amt;

	@FindBy(xpath = "//button[@name='update']")
	WebElement updateBtn;

	@FindBy(xpath = "//input[@id='name']")
	WebElement editTitle;

	@FindBy(xpath = "//button[@type='submit'and@name='Create']")
	WebElement saveBtn;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement messageBox;
    
	@FindBy(xpath="//input[@id='name']")
	WebElement titleText;
	
	public void clickManageExp() {
		gu.clickElement(driver, manageExp);
		wt.waitForElement(driver, "//p[contains(text(),'Manage Expense')]//i");
	}

	public void clickManageExpense() {
		wt.waitForElement(driver, "//p[text()='Manage Expense']");
		gu.clickElement(driver, manageExpense);

	}

	public void clickExpenseCatogary() {
		gu.clickElement(driver, expenseCatogry);
		wt.waitForElement(driver, "//p[contains(text(),'Expense Category')]");
	}

	public void moveToEditButton() {
		gu.performMouseHover(driver, editButton);
		wt.waitForElement(driver,
				"//a[@href='https://groceryapp.uniqassosiates.com/admin/Expense/edit?edit=305&page_ad=1']");
	}

	public void clickEditbutton() {
		wt.waitForElement(driver,
				"//a[@href='https://groceryapp.uniqassosiates.com/admin/Expense/edit?edit=305&page_ad=1']");
		gu.clickElement(driver, editButton);
	}

	public void moveToNewButton() {
		gu.performMouseHover(driver, newBtn);
		wt.waitForElement(driver, "//div//a[@class='btn btn-rounded btn-danger']");
	}

	public void clickNewbutton() {
		wt.waitForElement(driver, "//div//a[@class='btn btn-rounded btn-danger']");
		gu.clickElement(driver, newBtn);
	}

	public String getManageExpTagName() {
		return gu.getElementTagName(manageExp);

	}

	public void scrolDown() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView();", updateBtn);

	}

	public void scrolDownToSaveBtn() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView();", saveBtn);

	}

	public void MoveToUp() {
		gu.scrolUp(driver);
	}

	public Alert alertBox() {
		return driver.switchTo().alert();

	}

	public String getAlertText() {
		return driver.switchTo().alert().getText();
	}

	public void editTitile() {
		editTitle.sendKeys("lemon");
	}

	public void editAmount() {
		amt.clear();
		amt.sendKeys("3000");

	}

	public void moveToUpdate() {
		wt.waitForElement(driver, "//button[@name='update']");
		gu.performMouseHover(driver, updateBtn);
	}

	public void clickUpdate() {
		wt.waitForElement(driver, "//button[@name='update']");
		gu.clickElement(driver, updateBtn);

	}

	public void moveToSave() {
		wt.waitForElement(driver, "//button[@type='submit'and@name='Create']");
		gu.performMouseHover(driver, saveBtn);
	}

	public void clickSaveBtn() {
		wt.waitForElement(driver, "//button[@type='submit'and@name='Create']");
		gu.clickElement(driver, saveBtn);
	}

	public boolean getMessage() {
		wt.waitForElement(driver, "//div[@class='alert alert-success alert-dismissible']");
		return gu.isDisplay(messageBox);
	}

	public String getMessageText() {
		wt.waitForElement(driver, "//div[@class='alert alert-success alert-dismissible']");
		return gu.getElementText(messageBox);
	}
	public boolean isTextable() throws InterruptedException
	{   Thread.sleep(3000);
		return gu.isEnable(titleText);
		
	}
}