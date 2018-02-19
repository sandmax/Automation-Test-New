package com.automation.test.config;
import com.automation.utils.DataHandler;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestConfiguration {
	
	public static WebDriver getInstance(String configNAME)
	{
		WebDriver driver = null;
		String browserType=DataHandler.getDataFromPropertyFile(configNAME, "browser");
		String url=DataHandler.getDataFromPropertyFile(configNAME, "url");
		if(browserType.equalsIgnoreCase("firefox"))
		{
				System.setProperty("webdriver.gecko.driver" , "./Browser-Servers/geckodriver.exe");
					 driver = new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("chrome"))
						{
							System.setProperty("webdriver.chrome.driver", "./Browser-Servers/chromedriver.exe");
								 driver = new ChromeDriver();
							
						}
		else
			{
				System.err.println("-------Invalid Browser -------");
			}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	
		return driver;
	}

}
