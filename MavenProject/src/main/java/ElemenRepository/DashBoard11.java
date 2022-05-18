package ElemenRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.Utilities.GU;

public class DashBoard11 {
	WebDriver driver;
	GU gu = new GU();

	public DashBoard11(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//p[contains(text(),'Dashboard')]")
	WebElement dashBoard;
    
	@FindBy(xpath="//a[text()='Home']")
	WebElement getAttr;
	
	@FindBy(xpath="//img[@alt='AdminLTE Logo']")
	WebElement logo;
	
	@FindBy(tagName="a")
    List<WebElement> totalLink;
	
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement adminNm;
	
	@FindBy(xpath="//input[@name='new_pwd']")
	WebElement newPassword;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/reset-password']//i[@class='ace-icon fa fa-cog']")
	WebElement settingBtn;
	
	public String getDashBoardText() {
		return gu.getElementText(dashBoard);

	}
	public String getAttribut() {
		return gu.getAttribute(getAttr, "href");
	}
	public boolean getLogo() {
		return gu.isDisplay(logo);
	}
	public int getCount()
	{
	   return totalLink.size();
	}
	public  boolean isPwdTxtEnabled() {
		return  gu.isEnable(newPassword);
	}
	public void getSelectAdmin()
	{
		 adminNm.click();
	}
	public void getSelectSettng() {
		settingBtn.click();
	}
	
	
}