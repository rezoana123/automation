package com.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonBrowserOpen {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	driver.get("https://us.amazon.com/");
	driver.getPageSource();
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
    System.out.println(driver.getCurrentUrl());
   
	//System.out.println(driver.findElement(""));
    
	driver.close();
		//
		}
}
