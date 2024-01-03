package com.automation;

public class Automation37 {

	
		
			
			
    public static void main(String[] args) {
				 	 
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.automationexercise.com");      // open the url 
	driver.manage().window().maximize();     // this is for maximize the the window 
	MasterPageFact obj = new MasterPageFact(driver); 
	 obj.getSignin().click();           // this is for click signin xpath hiding   obj.getemail().sendkeys("sobhanrstech@gmail.com");  // this is for email xpath hiding 
	obj.getPassword().sendKeys("sabiha2019");   // this is for PW xpath hiding 
	 obj.getLogin().click();      // this is for Loging xpath hiding 
	 driver.close();
					  
						 
				}
		
		 

	}


