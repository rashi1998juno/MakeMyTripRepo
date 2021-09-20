package com.qa.testscript;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.FlightHomePage;

public class TestBase {

	public static WebDriver driver;
	public FlightHomePage For = new FlightHomePage(driver);
	
	// 1.Open a browser

	@BeforeClass
	@Parameters({ "Browser", "Url" })
	public void setUp(String Browser, String Url) throws Exception {
		// 1.Open a browser
		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\Videos\\selenium_jar\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		For = new FlightHomePage(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// 2.launching the url
		driver.get(Url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		For = new FlightHomePage(driver);
		For.get_Login_btn().click();

		Thread.sleep(3000);
		For.get_Login_btn().click();
		Thread.sleep(2000);

	
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		For.get_email_btn().sendKeys("srashi801@gmail.com");
		Thread.sleep(3000);
		
		For.continue_btn().click();
		//Thread.sleep(3000);
		For.pswd_field().sendKeys("Raksha@2002");
		Thread.sleep(3000);
		For.login_btn().click();
	
}
		

	@AfterClass
	public void tearDown() {
		// close the browser
		driver.close();

	}

}
