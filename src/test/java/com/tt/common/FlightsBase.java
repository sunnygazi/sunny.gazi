package com.tt.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightsBase {
WebDriver new1;
	
	public void luchBrowser() {
		System.setProperty("webdriver.chorome.driver", "/Users/SUNNY/Desktop/Desktop");
		new1 = new ChromeDriver();
		new1.get("http://www.newtours.demoaut.com/");
	}
	
	public void closeBrowser() {
		new1.close();
	
	}


}
