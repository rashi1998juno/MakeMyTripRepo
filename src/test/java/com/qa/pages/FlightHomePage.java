package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTripHomePage {
	
	WebDriver driver;
	 
	 @FindBy(xpath="//p[@xpath='1']")
    WebElement Loginbtn;
	 
	 public MakeMyTripHomePage(WebDriver driver) {
			this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    	  
	      }
	 
	 

}
