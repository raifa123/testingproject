package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redifdropdown {
ChromeDriver driver ;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void setvalues()
{
	WebElement days=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select d=new Select(days);
	d.selectByValue("30");
	WebElement months=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select m=new Select(months);
	m.selectByIndex(6);
	WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select y=new Select(year);
	y.selectByVisibleText("1997");
	
	
	List<WebElement> lis1=d.getOptions();
	System.out.println(lis1.size());
	List<WebElement> lis2=m.getOptions();
	System.out.println(lis2.size());
	List<WebElement> lis3=y.getOptions();
	System.out.println(lis3.size());
	
	
}
}
