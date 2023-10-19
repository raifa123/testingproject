package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolldown{
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
	JavascriptExecutor js= (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,1000)", "");
	//js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[6]/ul/li[2]/a")));
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[6]/ul/li[2]/a")).click();
}
}