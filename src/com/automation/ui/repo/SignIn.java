package com.automation.ui.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn {
	WebDriver driver;
	public SignIn(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement getSigninLink()
	{
		WebElement element =driver.findElement(By.linkText("Signin"));
	//	WebElement element =driver.findElement(By.xpath(".//*[@id='load_form']/div/div[1]/p/a"));
		
	    return element;
	}
	public WebElement getUsernameTextbox()
	{
	//	WebElement element =driver.findElement(By.xpath("//input[@name=\"username\"]"));
	//	WebElement element =driver.findElement(By.xpath(".//*[@id='load_form']/div/div[1]/p/a"));
		int ok_size=driver.findElements(By.xpath(".//*[@id='load_form']/fieldset[1]/input")).size();
		WebElement element=driver.findElements(By.xpath(".//*[@id='load_form']/fieldset[1]/input")).get(ok_size-1);
		
	    return element;
	}
	public WebElement getPasswordTextbox()
	{
	//	WebElement element =driver.findElement(By.xpath("//input[@name=\"password\"]"));
		
	//	WebElement element =driver.findElement(By.xpath(".//*[@id='load_form']/div/div[1]/p/a"));
		int ok_size=driver.findElements(By.xpath(".//*[@id='load_form']/fieldset[2]/input")).size();
		WebElement element=driver.findElements(By.xpath(".//*[@id='load_form']/fieldset[2]/input")).get(ok_size-1);
		
	    return element;
		
	}
	public WebElement getSubmitButton()
	{
	//	WebElement element =driver.findElement(By.xpath(".//*[@id='load_form']/div/div[2]/input"));
	//	WebElement element =driver.findElement(By.xpath(".//*[@id='load_form']/div/div[1]/p/a"));
		int ok_size=driver.findElements(By.xpath(".//*[@id='load_form']/div/div[2]/input")).size();
		WebElement element=driver.findElements(By.xpath(".//*[@id='load_form']/div/div[2]/input")).get(ok_size-1);
		
	    return element;
	}
	public void waitForVisibleButton()
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value=\"submit\"]")));
		
	}

}
