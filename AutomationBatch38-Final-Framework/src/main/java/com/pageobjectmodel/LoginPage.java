package com.pageobjectmodel;

	import org.openqa.selenium.By;

		public class LoginPage {
			//store all Login related Xpath -is part of selenium
			//which datatype use== >Web element// so use PF or POM
			//PF use=>@Findby
			//POM=> By()
			public By Username = By.xpath("//*[@name='username']");
			public By Password = By.xpath("//*[@name='password']");
			public By Login= By.xpath("//*[@type='submit']");
			public By Dropdown= By.xpath("//*[@class= 'oxd-userdropdown-name']");
			public By logoutbtn= By.xpath("//*[@role= menuitem'])[4]");
			
			

	}

