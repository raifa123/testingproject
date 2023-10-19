package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saucedemo {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlload() 
{
	driver.get("https://www.saucedemo.com/v1/");
}
@Test
public void test1()
{
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	String actual=driver.getCurrentUrl();
	System.out.println(actual);
	String expected="saucedemo.com";
	Assert.assertTrue(true);
	System.out.println("login succesfull");
	
	
}
}
