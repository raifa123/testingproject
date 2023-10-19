package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicexpath {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https:www.amazon.in");
}
@Test
public void search()
{
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input [@ id='twotabsearchtextbox']")).sendKeys("mobiles");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
}
@Test
public void cart()
{
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
	
}
@Test
public void signin()
{
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.navigate().back();
	driver.navigate().back();
	
}
@Test
public void deals()
{
	driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
	driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
}


}
