package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazetask {
WebDriver driver;
By name1=By.id("name");
By  company1=By.id("company");
By emailid=By.id("email");
By password1=By.id("password");
By confirm1=By.id("password-confirm");
By register=By.xpath("//button[@type='submit']");


public Blazetask(WebDriver driver)
{
	this.driver=driver;
}
 public void setvalues(String name,String company,String email,String password,String confirm)
 {
	 driver.findElement(name1).sendKeys(name);
	 driver.findElement(company1).sendKeys(company);
	 driver.findElement(emailid).sendKeys(email);
	 driver.findElement(password1).sendKeys(password);
	 driver.findElement(confirm1).sendKeys(confirm);
	 
	 
 }
 public void register()
 {
	 driver.findElement(register).click();
 }
}
