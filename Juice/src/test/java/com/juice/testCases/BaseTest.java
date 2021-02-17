package com.juice.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.juice.utilities.ReadConfig;
import org.apache.commons.io.FileUtils;

public class BaseTest {
	ReadConfig readconfig = new ReadConfig();
	
public String url= readconfig.getUrl();
public String emailAddress = readconfig.getEmailAddress();
public String password = readconfig.getPassword();
public static WebDriver driver;
public static Logger logger;

@Parameters("browser")
@BeforeClass
public void initial(String browser) {
	logger = Logger.getLogger("Juice");
	PropertyConfigurator.configure("Log4j.properties");
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if (browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
}

@AfterClass
public void closeBrowser() {
	//driver.quit();
}

public void screenshot(WebDriver driver, String testcase) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File tar = new File("./Screenshots/"+testcase+".png");
	FileUtils.copyFile(src,tar);
	System.out.println("Taken Screenshot");
}

}
