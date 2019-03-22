package com.w2a.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.w2a.base.Page;

public class LoginPage  extends Page{

	
	
	public ZohoAppPage doLogin(String username,String password){
		
		type("email_CSS",username);
		type("password_CSS",password);
		click("signbtn_CSS");
		try {
			Thread.sleep(3000);
			log.debug("Thread dot sleep executed......Login Page Java");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ZohoAppPage();
	}
	
	
	public void gotoSalesandMarketing(){
		
		
	}
	
	public void gotoFinance(){
		
		
	}
	
}
