package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBrowser {
	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();//WebDriver is class and driver is OBJ 
	WebDriverManager.chromedriver().setup(); 
	//driver.get("https://www.google.com/");
	driver.get("https://www.google.com");
	driver.close();
		
		}
}
