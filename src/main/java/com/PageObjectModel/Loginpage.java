package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	// Declare The Element as Private
	// Generate getters
	// * getter ---> To Get the Value or Element
	// Webelement RefName = driver.findelement(BY.Locators("Value"));
	
	public static WebDriver driver; // null

	@FindBy(id = "username")
	private WebElement user;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement loginBtn;
	
	
	
	@FindBy(linkText = "Forgot Password?")
	private WebElement forget;
	
	
	public WebElement Forget123() {
		
		return forget;
		
	}
	
	
	
	

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public Loginpage(WebDriver dri) {

		driver = dri;

		PageFactory.initElements(driver, this);

	}

}
