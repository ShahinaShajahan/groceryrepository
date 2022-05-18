package ElemenRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.obsqura.Utilities.GU;

public class ManageOrders11 {
	WebDriver driver;
	GU gu = new GU();

	public ManageOrders11(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a//p[contains(text(),'Orders')]")
	WebElement manageOrders;

	@FindBy(xpath = "//a[@href='javascript:void(0)']")
	WebElement searchBtn;
	
	@FindBy(xpath=".//*[@class='card-body table-responsive p-0']/table/tbody/tr[1]/td[1]")
	WebElement orderId;
	
	@FindBy(xpath="//a[contains(text(),'Assign Delivery Boy') and @data-target='#mymodal3621']")
	WebElement assignDeli;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/div[3]/div[1]/div[1]/form[1]/div[2]/select[1]")
	WebElement dropDown;
	
	@FindBy(xpath="//a[contains(text(),'View')and @href='https://groceryapp.uniqassosiates.com/admin/Order/details?details=621&page_ad=1']")
    WebElement viewBtn;
	
	@FindBy(xpath="//li//a[@href='https://groceryapp.uniqassosiates.com/admin/list-mobileslider']  ")
	WebElement mobSldrInfoBtn;
	
	@FindBy(xpath="//div//a[@class='btn btn-rounded btn-danger']")
	WebElement newBtn;
	

	@FindBy(xpath="//input[@id='main_img']")
	WebElement fileBtn;
   
	public void clickManageOrders() {
		
		manageOrders.click();
	}
   
    
	public void clickSearchButton() {
		
		searchBtn.click();
	}
   
    public String getNm() {
    	return gu.selectDropDownText(dropDown);
    }
	public String getManageOrderFont() {
		return gu.getElementFont_Size(searchBtn);

	}
	public String getOrderID() {
		return gu.getElementText(orderId);
	}
	 public void assignDeliBy() {
	    	gu.clickBtn(assignDeli);
	    	gu.selectValueFromDropDown(dropDown, "jack");
	    	
	    }
	 public int totList() {
		  return gu.totalcount(dropDown);
	 }
	 public boolean isviewable() {
		 return gu.isEnable(viewBtn);
	 }
	 public boolean isChoosable() {
		 mobSldrInfoBtn.click();
		 newBtn.click();
		 return gu.isEnable(fileBtn);
			
	 }
}
