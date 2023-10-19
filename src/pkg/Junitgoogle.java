package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitgoogle {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
@Test
public void titleverification()
{
	String src=driver.getTitle();
	System.out.println("title");
	String expectedtitle="Google";
	if(src.equals(expectedtitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
@Test
public void contentverification()
{driver.get("https://www.google.com");
String src=driver.getPageSource();
if(src.contains("Gmail"))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}

}

@After
public void browserclose()
{
	System.out.println("browserclose");
}
}
