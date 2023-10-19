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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testlogin {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlload()
{
	driver.get("https://practicetestautomation.com/practice-test-login/");
}
@Test
public void test1() throws IOException 
{
	File f=new File("C:\\Users\\raifa\\OneDrive\\desktop\\testlogin.xlsx");
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
		
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
}

}
}
