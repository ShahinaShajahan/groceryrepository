package com.obsqura.Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {
	public void waitForElement(WebDriver driver, String xpath) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(xpath))));
	}
	
	public void WaitForAlert(WebDriver driver) {
		
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
    wait.until(ExpectedConditions.alertIsPresent());
}}
