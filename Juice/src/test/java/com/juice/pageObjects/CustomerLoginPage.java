package com.juice.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class CustomerLoginPage {
WebDriver driver;
public CustomerLoginPage(WebDriver driver){
	this.driver = driver;
}
public CustomerLoginPage enterEmailAddress(String email) {
	driver.findElement(By.name("username")).sendKeys(email);
	return this;
}
public CustomerLoginPage enterPassword(String password) {
	driver.findElement(By.name("password")).sendKeys(password);
	return this;
}
public void clickLogin() {
	driver.findElement(By.xpath("//span[text()[normalize-space()='Login']]")).click();
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(15)).ignoring(TimeoutException.class);
	wait.until(ExpectedConditions.invisibilityOfElementWithText(By.className("o-header__join"), "Sign In"));
}
}
