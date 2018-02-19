package com.automation.utils;
import java.util.*;
import java.io.*;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WindowHandler {
	public static void SwitchtoParent(WebDriver driver)
	{
	Set<String> windowids=driver.getWindowHandles();
	Iterator<String> it=windowids.iterator();
	String Parentid=it.next();
	String Childid=it.next();
	driver.switchTo().window(Parentid);
	System.out.println(" parent id"+Parentid);
	System.out.println("child id "+Childid);
	System.out.println("Switching to parent id"+Parentid);
	
	}
	public static void SwitchtoChild(WebDriver driver)
	{
	Set<String> windowids=driver.getWindowHandles();
	Iterator<String> it=windowids.iterator();
	String Parentid=it.next();
	String Childid=it.next();
	driver.switchTo().window(Childid);
	System.out.println("Switching to child id"+Childid);
	
	}
	public static void SwitchtoCurrentWindow(WebDriver driver)
	{
	String curentwindowID=driver.getWindowHandle();
	System.out.println("Got  current window id"+curentwindowID);
driver.switchTo().window(curentwindowID);
System.out.println("switched to  current window id"+curentwindowID);
	
	}


}
