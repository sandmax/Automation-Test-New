package com.automation.test.smoke;
import com.automation.test.config.*;
import com.automation.ui.repo.*;
import com.automation.utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class singin {
	 WebDriver driver;
	 SignIn sin;

	@BeforeMethod
	public void preCondition()
	{
		
		driver=TestConfiguration.getInstance("configuration1");
		sin=new SignIn(driver);
		
	}
	@AfterMethod
	public void postCondition()
	{
	driver.close();
	}
	@Test
	public void testSin() throws InterruptedException 
	{
	
		sin.getSigninLink().click();
		Thread.sleep(5000);
	
		//WindowHandler.SwitchtoCurrentWindow(driver);
		//sin.waitForVisibleButton();
		//System.out.println("Button Visble");
	
	sin.getUsernameTextbox().sendKeys("sandeep");
		sin.getPasswordTextbox().sendKeys("sandeep123");
		sin.getSubmitButton().click();
		
	Thread.sleep(5000);
    
		
	}

}
