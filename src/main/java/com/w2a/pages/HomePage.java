package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class HomePage extends Page {
	
	

	
	public void goToSupport(){
		//#block-block-3 > div > div > div.zgh-utilities > div.zgh-accounts > a.zgh-login
		driver.findElement(By.cssSelector(".signing>a:nth-child(2)")).click();
		//driver.findElement(By.cssSelector("#block-block-3 > div > div > div.zgh-utilities > div.zgh-accounts > a.zgh-login")).click();
		
	}
	
	public void goToSignUp(){
		
		driver.findElement(By.cssSelector(".signup")).click();
	}
	
	
	public LoginPage goToLogin(){
		log.debug("Entered the gotologin Method... Home Page Java");
		if (isElementPresent(By.cssSelector("body > div.main-container-wrapper > div.zh-header-wrap > div > a.zh-signup"))) {
			log.debug("found the signup button.....Home Page Java");
			click("signuplogin_CSS");
		}else {
			log.debug("did not find the signup button.....Home Page Java");
			click("loginlink_CSS");
		}
		log.debug("finished clicking on loginlink Css button.... Leaving Home Page Java");
		
		return new LoginPage();
	}
	
	public void goToZohoEdu(){
		
		
		
	}
	
	public void goToLearnMore(){
		
		
		
	}
	
	
	public void validateFooterLinks(){
		
		
	}
}
