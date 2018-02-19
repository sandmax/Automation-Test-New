package com.automation.ui.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBSignin {
	
	 WebDriver driver;
	public FBSignin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getFirstnameTextBox()
	{
		return driver.findElement(By.name("firstname"));
	}
	public WebElement getLastnameTextBox()
	{
		return driver.findElement(By.name("lastname"));
	}
	public WebElement getemobileTextBox()
	{
		return driver.findElement(By.name("reg_email__"));
	}
	public WebElement getnewpasswordTextBox()
	{
		return driver.findElement(By.name("reg_passwd__"));
	}
	public WebElement getBirthDayDropDown()
	{
		return driver.findElement(By.name("birthday_day"));
	}
	public WebElement getBirthMonthDropDown()
	{
		return driver.findElement(By.name("birthday_month"));
	}
	public WebElement getBirthYearDropDown()
	{
		return driver.findElement(By.name("birthday_year"));
	}
	public WebElement getFemaleRadio()
	{
		return driver.findElement(By.id("u_0_b"));
	}
	public WebElement getMaleRadio()
	{
		return driver.findElement(By.xpath(".//*[@id='u_0_c']"));
	}
	public WebElement getCreateAccountButton()
	{
		return driver.findElement(By.id("u_0_13"));
	}
	public void waitForPageLoad()
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("websubmit")));
		
	}
	

}
