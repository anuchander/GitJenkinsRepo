/**
 * 
 */
package com.JenkinsProject.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * @author anu
 *
 */
public class BaseClass {
	
	public static WebDriver driver;
	
	public void loadConfig() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
	
	
	
	

}
