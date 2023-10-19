package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpgm {
ChromeDriver driver;
@Before
public void setup()

{
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/raifa/OneDrive/Desktop/alertdesign.html");
}
@Test
public void buttonverify()
{
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	//Alert a=driver.switchTo().alert();

	// String actltext=a.getText();
	// if(actltext.equals("hello!I am an alert box!!"))
	 {
		 System.out.println("pass");
	 }
	 //else
	 {
		 System.out.println("fail");
	 }
	a.accept();
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("raifa");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("shafi");
}
}
