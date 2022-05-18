package ElemenRepository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.obsqura.Utilities.GU;
import com.obsqura.Utilities.WaitClass;

public class ManageProducts11 {

	WebDriver driver;
	GU gu = new GU();
    WaitClass wt=new WaitClass();
	public ManageProducts11(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a//p[contains(text(),'Manage Product')]")
	WebElement manageProduct;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/add']")
	WebElement newBtn;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/status?id=810&st=inactive&page_ad=1']//span[contains(text(),'Active')]")
	WebElement statusBtn;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	
	@FindBy(xpath="//li//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']")
	WebElement deliveryBtn;
	
	@FindBy(xpath=".//*[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[5]")
	WebElement deliveryUserNm;
	
	@FindBy(xpath=".//*[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[7]")
	WebElement deliveryPwd;
	
	
	public void clickManageProduct() {
		gu.clickElement(driver, manageProduct);
		wt.waitForElement(driver, "//a//p[contains(text(),'Manage Product')]");
	}
	
	public String getBackgroundColor() {
		return gu.getColor(newBtn);
	}
	public void mouseHoverToStatusbtn()
	{
		gu.moveToTheElement(driver,statusBtn );
		wt.waitForElement(driver, "//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/status?id=810&st=inactive&page_ad=1']//span[contains(text(),'Active')]");
		
	}
	
	public void clickStatusBtn() {
		statusBtn.click();
	}
	public Alert AlertBox() {
		wt.WaitForAlert(driver);
		return driver.switchTo().alert();	}
	 
	public  void scrollUp() {
		gu.scrolUp(driver);
	}
	public boolean alert() {
		 return alert.isDisplayed();
	}

	public String getUserText() {
		deliveryBtn.click();
		return gu.getElementText(deliveryUserNm);
	}
	public String getPwdText() throws InterruptedException {
		deliveryBtn.click();
		Thread.sleep(2000);
		deliveryPwd.click();
		 return gu.getElementText(deliveryPwd);
		 
		 
	}
}

