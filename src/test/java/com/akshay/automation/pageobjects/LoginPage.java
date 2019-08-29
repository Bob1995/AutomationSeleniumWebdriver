package com.akshay.automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.akshay.automation.setup.BaseClass;

public class LoginPage extends BaseClass {

	By userName = By.id("userName");
	By password = By.id("password");
	By loginButton = By.cssSelector("[value='Sign in']");

	public LoginPage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public void setUserName(String uName) {
		webDriver.findElement(userName).sendKeys(uName);

	}

	public void setPassword(String pwd) {
		webDriver.findElement(password).sendKeys(pwd);

	}

	public void clickLogin() {

		webDriver.findElement(loginButton).click();
	}
}