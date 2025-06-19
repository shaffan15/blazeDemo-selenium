package com.blazeDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.blazeDemo.helper.ActionsHelper;
import com.blazeDemo.helper.SelectHelper;

public class PurchasePage extends ActionsHelper {

	private WebDriver driver;
	private By nameLocator = By.id("inputName"),
				addressLocator = By.id("address"),
				cityLocator = By.id("city"),
				stateLocator = By.id("state"),
				zipCodeLocator = By.id("zipCode"),
				cardTypeLocator = By.id("cardType"),
				creditCardNumberLocator = By.id("creditCardNumber"),
				creditCardMonthLocator = By.id("creditCardMonth"),
				creditCardYearLocator = By.id("creditCardYear"),
				nameOnCardLocator = By.id("nameOnCard"),
				rememberMeLocator = By.id("rememberMe"),
				formLocator = By.xpath("//form");
	
	
	public PurchasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fillFormFields(String name, String address, String city, String state, long zipCode, String cardType, String creditCardNumber, int creditCardMonth, int creditCardYear, String nameOnCard) {
		sendKeys(driver, nameLocator, name);
		sendKeys(driver, addressLocator, address);
		sendKeys(driver, cityLocator, city);
		sendKeys(driver, stateLocator, state);
		sendKeys(driver, zipCodeLocator, String.valueOf(zipCode));
		SelectHelper.selectByVisibleText(driver, cardTypeLocator, cardType);
		sendKeys(driver, creditCardNumberLocator, creditCardNumber);
		sendKeys(driver, creditCardMonthLocator, String.valueOf(creditCardMonth));
		sendKeys(driver, creditCardYearLocator, String.valueOf(creditCardYear));
		sendKeys(driver, nameOnCardLocator, nameOnCard);
		click(driver, rememberMeLocator);
		driver.findElement(formLocator).submit();
	}
	
}
