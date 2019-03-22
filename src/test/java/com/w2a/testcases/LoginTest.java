package com.w2a.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.utilities.Utilities;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String,String> data){
		Page.log.debug("Navigating to the Home Page Method.....");
		HomePage home = new HomePage();
		Page.log.debug("Moving to Home.gotologin method.....");
		LoginPage lp = home.goToLogin();
		lp.doLogin(data.get("username"), data.get("password"));
		Page.log.debug("Finished entering Username and Password.....");
		
		Page.log.debug("Alert is about to begin....Login Test Java");
		Alert alert = Page.wait.until(ExpectedConditions.alertIsPresent());
		Page.log.debug("Received alert text as ....."+alert.getText()+"  Login Test Java....");
		alert.accept();
		// some search page is coming to avoid just clicked on it.
		//Page.driver.findElement(By.cssSelector("#ztb-container > div.zod-zia._bubble > div.bubble-container._animate > button")).click();
		//Assert.fail("Login test failed");
	
		
	}

}
