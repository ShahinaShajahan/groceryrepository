package ElemenRepository;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.Utilities.ExcelCode;

import com.obsqura.Utilities.GU;
import com.obsqura.Utilities.WaitClass;

public class Loginpage11 {
	WebDriver driver;
	GU gu = new GU();
    WaitClass wt=new WaitClass();
	ExcelCode em = new ExcelCode();

	public Loginpage11(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passWord;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement Alert;

	@FindBy(xpath="//div[@class='icheck-dark']//label[contains(text(),'Remember Me')]")
	WebElement checkBox;

	public String xlStringReadCredentials(int row, int col) throws IOException {
		return em.ReadStringData(row, col);
	}

	public String xlIntReadCredentials(int row, int col) throws IOException {
		return em.ReadintegerData(row, col);
	}

	public void enterUserName(String username) throws IOException {
		userName.sendKeys(username);

	}

	public void enterPassWord(String password) throws IOException {
		passWord.sendKeys(password);
	}

	public void clickLogin() {
		loginButton.click();
	}

	public String getLoginText() {
		return gu.getElementText(loginButton);

	}

	public void checkboxClick() {
		wt.waitForElement(driver, "//div[@class='icheck-dark']//label[contains(text(),'Remember Me')]");
		checkBox.click();
	}

	public boolean isRememberMeSelected() {

		return gu.isGetChecked(checkBox);
	}
	public void enterInvalidUserName(String value) {
	
		gu.enterText(userName, value);
	}
	public void enterInvalidPassWord(String value) {
		
		gu.enterText(passWord, value);
	}
	public String getPassword() {
		return gu.getElementText(passWord);
	}
}


