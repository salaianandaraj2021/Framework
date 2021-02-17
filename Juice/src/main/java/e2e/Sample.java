package e2e;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
driver.get("https://www.staging.juiceplus.com/gb/en");
driver.manage().window().maximize();
driver.findElement(By.xpath("(//span[text()='Sign In'])[2]")).click();
driver.findElement(By.name("username")).sendKeys("anandaraj.selvaraj@mphasis.com");
driver.findElement(By.name("password")).sendKeys("Abcd1234");
driver.findElement(By.xpath("//span[text()[normalize-space()='Login']]")).click();
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(15)).ignoring(TimeoutException.class);
wait.until(ExpectedConditions.invisibilityOfElementWithText(By.className("o-header__join"), "Sign In"));
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//div[@class='a-button a-button--left a-button--profile a-button--small']//span[@class='a-button__inner']")));
js.executeScript("arguments[0].click()",driver.findElement(By.xpath("(//a[@class='m-usermenu__menu-link js-logout'])[2]")));
//String user = driver.findElement(By.className("o-header__join")).getText();
//Assert.assertEquals(user, "Anandwedcustomer");
//System.out.println("Logged in as: " + user);

//driver.findElement(By.xpath("//a[text()[normalize-space()='Our Products']]")).click();
//driver.findElement(By.xpath("(//a[text()[normalize-space()='Capsules']])[2]")).click();
//WebElement item = driver.findElement(By.xpath("//h3[text()='Premium Capsules']/parent::div/div/div//span[text()[normalize-space()='Shop Now']]"));
//JavascriptExecutor js = (JavascriptExecutor)driver;
//js.executeScript("arguments[0].click()", item);
//js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[text()='Add to cart']")));
//driver.findElement(By.xpath("//a[@class='m-icon-badge__icon']/span")).click();
//driver.findElement(By.xpath("(//span[text()='Check Out'])[2]")).click();
////driver.findElement(By.className("m-cart-item__remove")).click();
//driver.findElement(By.className("h-icon h-icon--profile-small")).click();
//driver.findElement(By.className("h-icon h-icon h-icon--logout")).click();

	}

}
