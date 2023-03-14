package com.Adactin_Runner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.PageObjectModel.Loginpage;
import com.PageObjectModel.SearchHotel;
import com.base1.Base_Class1;

public class Test_Runner extends Base_Class1 {

	public static WebDriver driver;

	public static void main(String[] args) {

		driver = browserLaunch("chrome");

		geturl("http://adactinhotelapp.com/");

		Loginpage l = new Loginpage(driver);

		inputElement(l.getUser(), "sanjaykumar0112");
		inputElement(l.getPass(), "6P8377");
		//ClickOnElement(l.Forget123());
		ClickOnElement(l.getLoginBtn());

		SearchHotel s = new SearchHotel(driver);
		s.gethotels();

		dropDownMethod("text", s.gethotels(), "Sydney");

		System.out.println("** DONE **");
	}

}
