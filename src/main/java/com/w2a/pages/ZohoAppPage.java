package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage  extends Page{
	
	
	
	public void gotoChat(){
		
		driver.findElement(By.cssSelector(".zicon-apps-chat.zicon-apps-96")).click();
		
	}
	
	public CRMHomePage gotoCRM(){
		log.debug("Entered the gotoCRM Method.....Clicking on crmlink css Button.... Zoho App Page Java");
		click("crmlink_CSS");
		log.debug("clicked on CRM Button......Zoho App Page Java");
		return new CRMHomePage();
	}
	
	
	public void gotoSalesIQ(){
		
		driver.findElement(By.cssSelector(".zicon-apps-salesiq.zicon-apps-96")).click();
		
	}

}
