/**
 * 
 */
package com.JenkinsProject.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * @author anu
 *
 */
public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	

}
