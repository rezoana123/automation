package com.costco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 public class CostcoLogin {

	public static void main(String[] args) {
		
	  WebDriver driver = new ChromeDriver();
	  WebDriverManager.chromedriver().setup();
	   driver.get("https:www.google.com/");
	  
	   System.out.println(driver.getTitle());
	   System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.switchTo());
	   System.out.println();
	   driver.close();
		
		}
}
