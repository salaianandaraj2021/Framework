package com.juice.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juice.pageObjects.AccountInformationPage;
import com.juice.pageObjects.CustomerLoginPage;
import com.juice.pageObjects.HomePage;


public class TC_LoginLogout extends BaseTest{

@Test
public void LoginTest() throws IOException, InterruptedException {
	driver.get(url);
	new HomePage(driver).clickSignIn();
	new CustomerLoginPage(driver).enterEmailAddress(emailAddress).enterPassword(password).clickLogin();
	logger.info("Entered Login credentials");
	if (driver.getTitle().equals("Account Information - JuicePlus+")) {
		Assert.assertTrue(true);
		logger.info("Logged in successfully");
	}else {
		screenshot(driver,"Login_failed");
		Assert.assertTrue(false);
		logger.info("Unable to login");
	}
	new AccountInformationPage(driver).clickUser().clickLogout();
	String title = driver.getTitle();
	System.out.println(title);
	
}

}
