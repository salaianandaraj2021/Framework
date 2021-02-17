package com.juice.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AccountInformationPage {
WebDriver driver;
JavascriptExecutor js = (JavascriptExecutor) driver;
public AccountInformationPage(WebDriver driver) {
	this.driver =driver;
	
}

public AccountInformationPage clickUser() throws InterruptedException {
js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@class='a-button a-button--left a-button--profile a-button--small']//span[@class='a-button__inner']")));
return this;
}
public void clickLogout() throws InterruptedException {
js.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//a[@class='m-usermenu__menu-link js-logout'])[2]")));
	Thread.sleep(3000);
}
}
