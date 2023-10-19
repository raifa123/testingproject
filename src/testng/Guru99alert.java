package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99alert {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeTest
public void urlload()
{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void click()
{
	WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	
Actions act=new Actions(driver);
act.contextClick(rightclick).perform();
driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
Alert a=driver.switchTo().alert();
System.out.println(a.getText());
a.accept();
WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
act.doubleClick(doubleclick).perform();
Alert b=driver.switchTo().alert();
System.out.println(b.getText());
b.accept();
}
}
