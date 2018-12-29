package com.tt.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserFlights {
	WebDriver newobj;

	@Given("^I am on newtours homepage$")
	public void i_am_on_newtours_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/SUNNY/Desktop/chromedriver");
		newobj = new ChromeDriver();
		newobj.get("http://www.newtours.demoaut.com/");

	}

	@When("^I enter \"([^\"]*)\" \"([^\"]*)\" and click submit$")
	public void i_enter_and_click_submit(String arg1, String arg2) throws Throwable {
		newobj.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("sunnygazi");
		newobj.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"))
				.sendKeys("passme");
		newobj.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"))
				.click();
		newobj.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"))
				.sendKeys("sunnygazi");
		newobj.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("passme");
		newobj.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"))
				.click();
	}

	@When("^I select flight type, no of passengers, origin, flight date, flight month, destinnation, return date, return month, service class, Airline$")
	public void i_select_flight_type_no_of_passengers_origin_flight_date_flight_month_destinnation_return_date_return_month_service_class_Airline()
			throws Throwable {

	}

	@When("^I click on continue$")
	public void i_click_on_continue() throws Throwable {

	}

	@Then("^I see select flight page$")
	public void i_see_select_flight_page() throws Throwable {

	}

}
