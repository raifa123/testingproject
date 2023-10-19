package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Blazetask;

public class Blazetest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlload()
{
	driver.get("https://blazedemo.com/register");
}
@Test
public void values()
{
	Blazetask b=new Blazetask(driver);
	b.setvalues("masi","abc","masi@gmail.com","masih","masih");
	b.register();
}
}
