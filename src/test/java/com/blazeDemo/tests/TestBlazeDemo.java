package com.blazeDemo.tests;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.blazeDemo.helper.BaseClass;
import com.blazeDemo.pages.HomePage;
import com.blazeDemo.pages.PurchasePage;
import com.blazeDemo.pages.ReservePage;

public class TestBlazeDemo extends BaseClass {

	protected Logger log = LoggerFactory.getLogger(TestBlazeDemo.class);
	
	@Test
	public void testBlazeDemo() {
		String currentUrl = driver.getCurrentUrl();
		String textToVerify = "Thank you for your purchase today!";
		
		HomePage homePage = new HomePage(driver);
		homePage.selectDepartureCity("Paris");
		homePage.selectDestinationCity("London");
		homePage.findFlights();
		wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(currentUrl)));
		
		currentUrl = driver.getCurrentUrl();
		ReservePage reservePage = new ReservePage(driver);
		reservePage.findCheapestFlight();
		wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(currentUrl)));
		
		currentUrl = driver.getCurrentUrl();
		
		String name = "Shaffan Shaikh",
				address = "Sarkhej, Ahmedabad, Gujarat, India",
				city = "Ahmedabad",
				state = "Gujarat",
				cardType = "American Express",
				creditCardNumber = "3847 2938 2389",
				nameOnCard = "Shaffan Shaikh";
		long zipCode = 380055;
		int creditCardMonth = 03, creditCardYear = 2032;
		
		PurchasePage purchasePage = new PurchasePage(driver);
		purchasePage.fillFormFields(name, address, city, state, zipCode, cardType, creditCardNumber, creditCardMonth, creditCardYear, nameOnCard);
		wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(currentUrl)));
		assertThat(driver.findElement(By.tagName("h1")).getText()).isEqualTo(textToVerify);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
