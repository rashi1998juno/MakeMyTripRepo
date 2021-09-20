package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightHomePage {
	
	WebDriver driver;
	 
	
	@FindBy(xpath = "//*[@id='SW']/div[1]/div[1]/ul/li[3]")
    WebElement Loginfield;
	 
	 public WebElement get_Login_btn() throws Exception 
		{
		 Thread.sleep(3000);
		 return  Loginfield;
	}
	 	 
	 
//------------------------------------------------------------------------------------------------//	 
	 
	 @FindBy(xpath = "//*[@id='username']")
	    WebElement emailfield;
		 
		 public WebElement get_email_btn() throws Exception 
			{
			 Thread.sleep(3000);
			 return  emailfield;
		}
		 
//------------------------------------------------------------------------------------------------//	 
 
	 @FindBy(xpath="//*[@id='SW']/div[1]/div[2]/div[2]/section/form/div[2]/button")
	    WebElement continubtn;
		 
		 public WebElement continue_btn() 
			{
		 
			 return continubtn ;
			}
//------------------------------------------------------------------------------------------------//		 
		 		 
		 
		 
		 @FindBy(xpath="//*[@id='password']")
		    WebElement password;
			 
			 public WebElement pswd_field() 
				{
			 
				 return password ;
				}

//------------------------------------------------------------------------------------------------//			 
			 
			 
			 
//			 @FindBy(xpath="//*[@id='SW']/div[1]/div[2]/div[2]/section/form/div[2]/button")
			 
			// @FindBy(xpath="//*[@id='SW']/div[1]/div[2]/div[2]/section/form/div[2]/button/span")
			 @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]")
			    WebElement loginbtn;
				 
				 public WebElement login_btn() 
					{
				 
					 return loginbtn ;
					}
				 
//	-------------------------------------------------------------------------------------------------//
				 
				 
//				 
//				 @FindBy(xpath="//*[@id='SW']//div[1]/div[2]/div[2]/section/div[1]/div/span")
//				    WebElement closePopup;
//					 
//					 public WebElement popup_field() 
//						{
//					 
//						 return closePopup ;
//						}
		 
//------------------------------------------------------------------------------------------------	//	 
//		  
//	 @FindBy(xpath="//input[@id='fromCity']")
//	    WebElement FromCity;
//		 
//		 public WebElement from_city()
//			{
//			 
//				return  FromCity ;
//			}
//		 
		 
		 
//		 
//		 @FindBy(xpath="//p[@xpath='1']")
//		    WebElement Loginbtn;
//			 
//			 public WebElement get_Login_btn()
//				{
//					return  Loginbtn;
//				}
//			 
	 
	 
	 public FlightHomePage(WebDriver driver) {
			this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    	  
	      }
	 
	 

}
