package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbforgotpswd;
import Pages.Fbloginpage;

public class Fblogintest {
	WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlload()
{
	driver.get("https://www.facebook.com");
}
@Test
public void test1()
{
	//Fbloginpage ob=new Fbloginpage(driver);
	//ob.setvalues("abc@gmail.com", "abcd");
	//ob.login();


	Fbforgotpswd ob1=new Fbforgotpswd(driver);
	ob1.linkclick();
	ob1.setvalues("7034062736");
	ob1.search();
}


}
