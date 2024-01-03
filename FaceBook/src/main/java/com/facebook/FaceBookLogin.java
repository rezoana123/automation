package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	    WebDriverManager.chromedriver().setup();	
		driver.get("https://www.facebook.com/");
		//driver.close();
		
	}

}
