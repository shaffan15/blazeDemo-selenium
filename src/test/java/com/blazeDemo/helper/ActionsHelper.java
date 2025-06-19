package com.blazeDemo.helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsHelper {

	public static void sendKeys(WebDriver driver, By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public static void click(WebDriver driver, By locator) {
		waitUntilClickable(driver, locator).click();
	}
	
	
	public static WebElement waitUntilClickable(WebDriver driver, By locator) {
		return new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static Select getSelectElement(WebDriver driver, By locator) {
		return new Select(driver.findElement(locator));
	}
	
}
