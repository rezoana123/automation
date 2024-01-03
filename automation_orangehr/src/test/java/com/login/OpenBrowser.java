package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
	  //driver.get("https://www.google.com/");  //control/shift/o press problem will solve 

	  //driver.get("https://us.amazon.com/");
		
	  //driver.get("https://www.ebay.com/");
		
	  //driver.get("https://www.facebook.com/");
		
	  //driver.get("https://smarttechitsolution.com/");
		
		// 
	}

}
