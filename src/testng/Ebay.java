package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlload()
{
	driver.get("https://www.ebay.com");
}
@Test
public void test1()
{
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement ec=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	Actions act=new Actions(driver);
	act.moveToElement(ec).perform();
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Smartphones and accessories']")));
	driver.findElement(By.xpath("//a[normalize-space()='Smartphones and accessories']")).click();
}
}
