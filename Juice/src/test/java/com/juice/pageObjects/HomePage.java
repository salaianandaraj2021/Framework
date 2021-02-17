package com.juice.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage implements HomeInterface{
WebDriver driver;

 public HomePage(WebDriver driver){
	this.driver =driver;
}

public void clickSignIn() {
	driver.findElement(By.xpath("(//span[text()='Sign In'])[2]")).click();
}

@Override
public void clickOurProducts() {
	driver.findElement(By.xpath("//a[text()[normalize-space()='Our Products']]")).click();
	
}

@Override
public void clickLiveBetter() {
	driver.findElement(By.xpath("//a[text()[normalize-space()='Live Better']]")).click();
}

@Override
public void clickWhoWeAre() {
	driver.findElement(By.xpath("//a[text()[normalize-space()='Who We Are']]")).click();

}

@Override
public void clickBecomeAPartner() {
	driver.findElement(By.xpath("//a[text()[normalize-space()='Become a Partner']]")).click();
}

@Override
public void clickOverview() {
	driver.findElement(By.xpath("(//a[text()[normalize-space()='Overview']])[2]")).click();
}

@Override
public void clickCapsules() {
	driver.findElement(By.xpath("(//a[text()[normalize-space()='Capsules']])[2]")).click();
}

@Override
public void clickChewables() {
	driver.findElement(By.xpath("(//a[text()[normalize-space()='Chewables']])[2]")).click();	
}

@Override
public void clickOmegaBlend() {
	driver.findElement(By.xpath("(//a[text()[normalize-space()='Omega Blend']])[2]")).click();
}

@Override
public void clickCompleteByJuicePlus() {
	driver.findElement(By.xpath("(//a[text()[normalize-space()='Complete by Juice Plus+']])[2]")).click();	
}

@Override
public void clickUpliftByJuicePlus() {
	driver.findElement(By.xpath("(//a[text()[normalize-space()='Uplift by Juice Plus+']])[2]")).click();
}

@Override
public void clickClinicalResearch() {
	driver.findElement(By.xpath("(//a[text()[normalize-space()='Clinical Research']])[2]")).click();
}

@Override
public void clickHowCapsulesAreMade() {
	driver.findElement(By.xpath("(//a[text()[normalize-space()='How capsules are made']])[2]")).click();
}
}
