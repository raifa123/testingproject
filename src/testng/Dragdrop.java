package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdrop {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://demoqa.com/droppable");
	}
	
@Test
public void dropdrag()
{
	WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	Actions act=new Actions(driver);
	WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	driver.manage().window().maximize();
	act.dragAndDrop(drag, drop);
	act.perform();
	String txt=drop.getText();
	System.out.println(txt);
	if(txt.equals("Dropped!"))
	{
		System.out.println("dropped");
	}
	else
	{
		System.out.println("not dropped");
	}
	
}
}
