package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorxpath {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void login()
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("raifashafi306@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("raifa306");
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
