package com.JenkinsProject.testcases;

import org.openqa.selenium.WebDriver;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageSourceExample {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.business.linkedin.com");
		String s = "Contact Linkedin";
		System.out.println("Check if business.linkedin.com contains Contact Linkedin");
		Assert.assertTrue(driver.getPageSource().contains(s), "Contact Linkedin not present");
		driver.close();

		
		

	}

}
