package testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void urllod()
{
	driver.get("https://www.booking.com");
	driver.manage().window().maximize();
}
@Test
public void test1()
{
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/button[1]")).click();
	while(true)
	{
		WebElement month=driver.findElement(By.xpath("//h3[normalize-space()='October 2023']"));
		String month1=month.getText();
		if(month1.equals("December 2023"))
		{
			System.out.println(month1);
			break;
		}
		else
		{
			driver.findElement(By.xpath("//body/div[@id='indexsearch']/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/nav[1]/div[2]/div[1]/div[1]/button[1]/span[1]/span[1]")).click();
			
		}
	}
	List <WebElement> dates1=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/span/span"));
	for(WebElement dateelement:dates1)
	{
		String date=dateelement.getText();
		if(date.equals("29"))
		{
			dateelement.click();
			break;
		}
		
		
	}
}
}
