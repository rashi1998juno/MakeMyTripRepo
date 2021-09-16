package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.MakeMyTripHomePage;

public class TestBase {
	
	
	WebDriver driver;
	MakeMyTripHomePage Mor;

	// 1.Open a browser
	@BeforeClass
	@Parameters({ "Browser", "Url" })
	public void setUp(String Browser, String Url) {
		// 1.Open a browser
		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\Videos\\selenium_jar\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		Mor = new MakeMyTripHomePage(driver);
		driver.manage().window().maximize();

		// 2.launching the url
		driver.get(Url);

	}

	@AfterClass
	public void tearDown() {
		// close the browser
		driver.close();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
