package com.blazeDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	private WebDriver driver;
	private By departureSelect = By.name("fromPort");
	private By destinationSelect = By.name("toPort");
	private By form = By.tagName("form");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectDepartureCity(String cityName) {
		new Select(driver.findElement(departureSelect)).selectByValue(cityName);
	}
	
	public void selectDestinationCity(String cityName) {
		new Select(driver.findElement(destinationSelect)).selectByValue(cityName);
	}
	
	public void findFlights() {
		driver.findElement(form).submit();
	}
	
}
