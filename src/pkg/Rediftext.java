package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediftext {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void text()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		String buttontext=button.getAttribute("value");
		if(buttontext.equals("Create my account>>"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
