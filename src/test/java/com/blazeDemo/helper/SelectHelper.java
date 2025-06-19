package com.blazeDemo.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectHelper {
	
	public static List<WebElement> getOptions(WebDriver driver, By locator) {
		return new Select(driver.findElement(locator)).getOptions();
	}
	
	public static void selectByContainsVisibleText(WebDriver driver, By locator, String text) {
		new Select(driver.findElement(locator)).selectByContainsVisibleText(text);
	}
	
	public static void selectByIndex(WebDriver driver, By locator, int index) {
		new Select(driver.findElement(locator)).selectByIndex(index);
	}
	
	public static void selectByValue(WebDriver driver, By locator, String value) {
		new Select(driver.findElement(locator)).selectByValue(value);
	}

	public static void selectByVisibleText(WebDriver driver, By locator, String visibleText) {
		new Select(driver.findElement(locator)).selectByVisibleText(visibleText);
	}
	
}
