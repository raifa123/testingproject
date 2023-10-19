package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginapache {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeTest
public void urlload()
{
	driver.get("https://www.facebook.com");
}
@Test
public void test1() throws IOException
{
	File f=new File("C:\\Users\\raifa\\OneDrive\\Desktop\\login.xlsx");
	FileInputStream fi=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet sh=wb.getSheet("Sheet1");
	System.out.println(sh.getLastRowNum());
	
	for(int i=1;i<=sh.getLastRowNum();i++)
	{
		String username=sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println("username=" +username);
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("password="+password);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		
		driver.findElement(By.name("login")).click();
	}
	
		String str=driver.getCurrentUrl();
		System.out.println(str);
		String expected="https:www.facebook.com";
		if(str.equals(expected))
		{
			System.out.println("login successfull");
		}
		else
		{
			System.out.println("login failed");
		}
		
	
	
	
}
}
