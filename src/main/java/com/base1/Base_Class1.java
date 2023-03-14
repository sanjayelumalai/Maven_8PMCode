package com.base1;

import java.lang.runtime.SwitchBootstraps;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class1 {

	// WebDriver driver
	public static WebDriver driver; // null driver

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Driver\\iedriver.exe");
			driver = new InternetExplorerDriver();

		}

		else {
			System.out.println(" Invalid Driver");
		}
		driver.manage().window().maximize();

		return driver;
		
		
	}

	public static void inputElement(WebElement input, String value) {

		input.sendKeys(value);

	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void dropDownMethod(String type, WebElement element, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("index")) { // index
			int index = Integer.parseInt(value);

			s.selectByIndex(index);

		} else if (type.equalsIgnoreCase("Value")) { // value
			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("text")) { // text
			s.selectByVisibleText(value);

		}

		else {
			System.out.println("Invalid TYPES ");

		}

	}

	public static void getDropdown(WebElement element, String type) {

		Select s = new Select(element); // element // Type

		String lowerCase = type.toLowerCase();

		switch (lowerCase) {

		case "getoptions":

			List<WebElement> options = s.getOptions();

			for (WebElement opt : options) {
				System.out.println(opt.getText());
			}
			break;

		case "allselected":

			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

			for (WebElement allopt : allSelectedOptions) {
				System.out.println(allopt.getText());

			}
			break;

		}

	}
	
	public static void ClickOnElement(WebElement element) {
		
		element.click();
	}

	public static void main(String[] args) {

	}

}
