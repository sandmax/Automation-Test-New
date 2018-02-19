package com.automation.test.smoke;
import com.automation.test.config.*;
import com.automation.ui.repo.*;
import com.automation.utils.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class login {
	 WebDriver driver;
	FBSignin signin;

	@BeforeMethod
	public void preCondition()
	{
		driver=TestConfiguration.getInstance("configuration");
		signin=new FBSignin(driver);
		
	}
	@AfterMethod
	public void postCondition()
	{
	driver.close();
	}
	@Test
	public void testRegister() throws InterruptedException
	{
	//	WindowHandler.SwitchtoCurrentWindow(driver);
	 String fname=DataHandler.readDataFromExcel("data","Sheet2", 1, 1);
     signin.waitForPageLoad();
	 signin.getFirstnameTextBox().sendKeys(fname);
	 signin.getLastnameTextBox().sendKeys("Sandeep");
	 signin.getemobileTextBox().sendKeys("7406767770");
	 signin.getnewpasswordTextBox().sendKeys("s@ndm@x123");
	 WebElement bday=signin.getBirthDayDropDown();
	 WebElement bmonth=signin.getBirthMonthDropDown();
	 WebElement byear=signin.getBirthYearDropDown();
	 
	 DropDownHandlers.selectDDLByVisibleText(bday,"5");
	 DropDownHandlers.selectDDLByVisibleText(bmonth,"Jun");
	 DropDownHandlers.selectDDLByVisibleText(byear,"2013");
	 Thread.sleep(5000);
	 signin.getMaleRadio().click();
	 System.out.println("Going to Create account");
//	 signin.getCreateAccountButton().click();
	 System.out.println("Clicked");

		
	
    
		
	}

}
