package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorxpathpc {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
}
@Test
public void parentchildtest()
{
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
}
}
