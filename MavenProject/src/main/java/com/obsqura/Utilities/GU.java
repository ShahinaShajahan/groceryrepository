package com.obsqura.Utilities;

import java.awt.Button;
import java.awt.Component;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GU {

	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getElementTagName(WebElement element) {
		String tag = element.getTagName();
		return tag;
	}

	public String getElementFont_Size(WebElement element) {
		String font = element.getCssValue("font-size");
		return font;
	}

	public String getAttribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		return attribute;
	}
	public boolean isEnable(WebElement ele) 
	{
		return ele.isEnabled();
	}
	
	public String getTheTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public boolean isDisplay(WebElement ele) {
		return ele.isDisplayed();
	}

	public void clickElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).click(element).perform();

	}

	public boolean isGetChecked(WebElement eleme) {
		boolean value = eleme.isSelected();
		return value;
	}

	public void pressEnter(WebDriver driver) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();

	}

	public void scrollDown(WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,3000)");

	}

	public void scrolUp(WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,-3000)");

	}

	public void performMouseHover(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public void clickUsingJavaScriptExecutor(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0].click();", element);
	}

	

	public void dropDown(WebElement element, String value) {
		Select drp = new Select(element);
		drp.selectByValue("value");

	}

	public String getColor(WebElement elemen)

	{
		String btncolor = elemen.getCssValue("background-color");
		String Actual_Background = Color.fromString(btncolor).asHex();
		return Actual_Background;
	}
	public void enterText(WebElement ele,String value)
	{
		 ele.sendKeys(value);
	}
	public void moveToTheElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).click(element).perform();
}
	
	public void selectValueFromDropDown(WebElement ele,String Value)
	{
		Select select=new Select(ele);
		select.selectByVisibleText(Value);
	}
	 
	public String selectDropDownText(WebElement ele) {
		Select select=new Select(ele);
		WebElement elemt= select.getFirstSelectedOption();
		return elemt.getText();
	}
	public void clickBtn(WebElement ele)
	{
		ele.click();
	}
	
	public int totalcount(WebElement ele) {
		Select select=new Select(ele);
		List<WebElement> l = select.getOptions();
		 return l.size();
		
	}
	
	public String getParentWindowId(WebDriver driver)
	{    driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		String parentId=driver.getWindowHandle();
		return parentId;
	}
	
	
	public String getCurrentWindowId(WebDriver driver,WebElement ele) {
		driver.get("ele");
		String windowID=driver.getWindowHandle();
		return windowID;
	}
	}
