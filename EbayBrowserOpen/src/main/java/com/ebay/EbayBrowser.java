package com.ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

  public class EbayBrowser {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	WebDriverManager.chromedriver().setup();         //Ctrl+Shift+o
	driver.get("https://www.ebay.com/");
	driver.close();
	
		//
	

	}

}
