package com.blazeDemo.helper;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass extends STRINGS {

	protected WebDriver driver;
	protected WebDriverWait wait;
	
	@BeforeEach
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get(SUT);
	}
	
	@AfterEach
	void tearDown() {
		if(driver != null)
			driver.quit();
	}
	
}
