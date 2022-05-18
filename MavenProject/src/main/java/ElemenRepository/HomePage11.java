package ElemenRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.Utilities.GU;
import com.obsqura.Utilities.WaitClass;

public class HomePage11 {
	WebDriver driver;
	GU gu = new GU();
	WaitClass wt = new WaitClass();

	public HomePage11(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement adminName;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/add-cod']//i[@class='nav-icon fas fa-handshake']")
	WebElement moreInfoBtn;

	@FindBy(xpath = "//input[@value='yes']")
	WebElement CODYesRadioBtn;


	@FindBy(xpath = "//input[@value='no']")
	WebElement CODNoRadioBtn;
	
	@FindBy(xpath="//li//a[@href='https://groceryapp.uniqassosiates.com/admin/list-mobileslider']  ")
	WebElement mobSldrInfoBtn;
	
	@FindBy(xpath="//div//a[@class='btn btn-rounded btn-danger']")
	WebElement newBtn;
	

	@FindBy(xpath="//select[@id='cat_id']")
	WebElement dropDown;
	
	@FindBy(xpath="//li//a [@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")
	WebElement userInfo;
	
	@FindBy(xpath=".//*[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[4]")
	WebElement pwdBtn;
	
	@FindBy(xpath="//span[contains(text(),'123456789')]")
	WebElement pwd;
	
	public String getAdminName() {
		return gu.getElementText(adminName);

	}

	public String gettTitle() {
		return gu.getTheTitle(driver);

	}

	public void mouseHoverMoreInformation() {
		gu.moveToTheElement(driver, moreInfoBtn);
		wt.waitForElement(driver,
				"//a[@href='https://groceryapp.uniqassosiates.com/admin/add-cod']//i[@class='nav-icon fas fa-handshake']");

	}

	public void clickMoreInfo() {
		moreInfoBtn.click();
	}

	public boolean isCODselected() {
		return gu.isGetChecked(CODYesRadioBtn);
	}
	
	public boolean isNoBtnCODselected() {
		return gu.isGetChecked(CODNoRadioBtn);
}
	public void clickSlider() {
		gu.clickBtn(mobSldrInfoBtn);
	
}
public void scroldowm() {
	gu.scrollDown(driver);
}
public void clickNewBtn() {
	gu.clickBtn(newBtn);
}
public void  selectFromList(String value)
{
	 gu.selectValueFromDropDown(dropDown, value);
}
public String getDropDownText() {
	return gu.selectDropDownText(dropDown);
	
	
}
public void getCurrentWindow()
{
	mobSldrInfoBtn.click();
    gu.getCurrentWindowId(driver, mobSldrInfoBtn);
}
public String getUserDetails() {
	userInfo.click();
	pwdBtn.click();
	 return gu.getElementText(pwd);
}
public boolean isselectable() {
	return gu.isEnable(dropDown);
}
}
