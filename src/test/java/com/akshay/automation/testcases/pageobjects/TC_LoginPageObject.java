package com.akshay.automation.testcases.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.akshay.automation.pageobjects.LoginPageObject;
import com.akshay.automation.setup.BaseClass;
import com.aventstack.extentreports.Status;


public class TC_LoginPageObject extends BaseClass {

	private LoginPageObject loginPageObject;
	
	@Test
	public void tc01() throws Exception {

		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.id("landingLogin")).click();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		extentTest.log(Status.PASS, "Navigate to URL");

	}

	@Test
	public void tc02() throws Exception {	
		loginPageObject = new LoginPageObject(webDriver);
		loginPageObject.setUserName("s_bhagyalj");
		loginPageObject.setPassword("Password1!");
		loginPageObject.clickLogin();
		Thread.sleep(1000);
		Assert.assertEquals("Citrix Education", webDriver.getTitle());
		extentTest.log(Status.FAIL, "Login successful");
	}

}
