package com.patricklaflin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/patri/Downloads/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/patri/Downloads/chromedriver.exe");
		
		// Opening Google Browser in Firefox using Selenium
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.com");
		
		// Opening Google Browser in Google Chrome using Selenium
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
