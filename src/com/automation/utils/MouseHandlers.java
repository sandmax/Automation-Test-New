package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHandlers {
	public static void MouseHoverElement(WebDriver driver , WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public static void DragAndDrop(WebDriver driver , WebElement src , WebElement tar  )
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, tar).perform();
	}
	public static void DoubleClick(WebDriver driver , WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	public static void Click(WebDriver driver , WebElement element)
	{
		Actions act=new Actions(driver);
		act.click(element).perform();
	}
	

}
