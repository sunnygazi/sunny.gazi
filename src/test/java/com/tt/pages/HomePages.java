package com.tt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {
	WebDriver driver;
	public void HomePage(WebDriver Driver, WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}// end of the constructor
	
	@FindBy(name="userName")
	WebElement uName;
	public WebElement userName() {
		return uName;
	}
 
	@FindBy (name= "passwoed")
	WebElement uPass;
	public WebElement userPass() {
		return uPass;
	}
	
	@FindBy (name= "login")
	WebElement login;
	public WebElement login() {
		return login;
	}


}
