package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbforgotpswd {
WebDriver driver;
By forgottenlink=By.xpath("//a[normalize-space()='Forgotten password?']");
By forgottenpasswordmobile=By.id("identify_email");
By forgottensearch=By.name("did_submit");

public Fbforgotpswd(WebDriver driver)

{
	this.driver=driver;
}
public void linkclick()
{
	driver.findElement(forgottenlink).click();
	
}
public void setvalues(String mobilenumber)
{
	driver.findElement(forgottenpasswordmobile).sendKeys(mobilenumber);
}
public void search()
{
	driver.findElement(forgottensearch).click();
}
}
