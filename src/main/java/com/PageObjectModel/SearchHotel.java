package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	// Declare The Elements As Private
	// Generate Getters

	// WebElement Value = driver.findelement(By.Locators("Value"));
	// Declare the Driver
	
	public static WebDriver driver; 
	

	@FindBy(id = "location")
	private WebElement Locator;

	@FindBy(id = "hotels")
	private WebElement HotelsElement;

	public WebElement getLocators() {
		return Locator;

	}

	public WebElement gethotels() {
		return HotelsElement;

	}
	
	public SearchHotel(WebDriver dri) {  //
		driver=dri;
		PageFactory.initElements(driver,this);
	}
	

}
