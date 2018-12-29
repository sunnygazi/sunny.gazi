package com.tt.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registration {
	WebDriver wd;
	@Given("^as a user I am in registration page$")
	public void as_a_user_I_am_in_registration_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","/Users/SUNNY/Desktop/chromedriver");
		wd = new ChromeDriver();
		wd.get("http://www.newtours.demoaut.com/");
		wd.findElement(By.linkText("REGISTER")).click();

	    
	}

	@When("^I enter first name, last name, user id, password, and confirm password$")
	public void i_enter_first_name_last_name_user_id_password_and_confirm_password() throws Throwable {
		wd.findElement(By.name("firstName")).sendKeys("Ibrahim");
		wd.findElement(By.name("lastName")).sendKeys("Gazi");
		wd.findElement(By.name("phone")).sendKeys("7186906697");
		wd.findElement(By.id("userName")).sendKeys("sunnygazi@gmail.com");
		wd.findElement(By.name("address1")).sendKeys("16116 85 ave");
		wd.findElement(By.name("address2")).sendKeys("2FL");
		wd.findElement(By.name("city")).sendKeys("Jamaica");
		wd.findElement(By.name("state")).sendKeys("New York");
		wd.findElement(By.name("postalCode")).sendKeys("11432");
		Select count= new Select(wd.findElement(By.name("country")));
		count.selectByValue("30");
		wd.findElement(By.name("email")).sendKeys("sunnygazi@gmail.com");
		wd.findElement(By.name("password")).sendKeys("mypass");
		wd.findElement(By.name("confirmPassword")).sendKeys("mypass");

	   
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
	   
	}

	@Then("^I received a user registration conformation$")
	public void i_received_a_user_registration_conformation() throws Throwable {
		wd.findElement(By.name("register")).click();
	    
	}
}//end of class
