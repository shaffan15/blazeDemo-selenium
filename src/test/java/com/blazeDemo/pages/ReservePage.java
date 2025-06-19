package com.blazeDemo.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservePage {

	private WebDriver driver;
	private By priceInputLocator = By.cssSelector("input[name='price']");
	private String chooseFlightXpath = "//input[@value='%s']/parent::tr/form";
//	private String chooseFlightXpath = "input[@value='%s']/parent::tr//input[@type='submit']";
	
	public ReservePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void findCheapestFlight() {
		List<Double> priceList = new ArrayList<Double>();
		List<WebElement> priceRows = driver.findElements(priceInputLocator);
		
		for(WebElement row: priceRows) {
			
			priceList.add(Double.valueOf(row.getDomProperty("value")));
		}
		Collections.sort(priceList);
		By chooseFlightLocator = By.xpath(String.format(chooseFlightXpath, priceList.get(0).toString()));
//		ActionsHelper.click(driver, chooseFlightLocator);
		driver.findElement(chooseFlightLocator).submit();
	}
	
}
