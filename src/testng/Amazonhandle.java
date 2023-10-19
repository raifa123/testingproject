package testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonhandle {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlload()
{
	driver.get("https://www.amazon.in");
}
@Test
public void test1()
{
	String homewindow=driver.getWindowHandle();
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephone");
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	
	String title=driver.getTitle();
	System.out.println(title);
	String expectedtitle="Amazon.in:mobilephone";
	if(title.equals(expectedtitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}

		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	
	Set<String> allwindowhandles1=driver.getWindowHandles();
	for(String cart:allwindowhandles1)
	{
		if(!cart.equalsIgnoreCase(homewindow))
		{	
		driver.switchTo().window(cart);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]")).click();
		
		}
	}
}
}


