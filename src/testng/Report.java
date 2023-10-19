package testng;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Report {
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	
@BeforeTest
public void setup()
{
	reporter =new ExtentHtmlReporter("./myreport/report.html");
	reporter.config().setDocumentTitle("automation report");
	reporter.config().setReportName("functional test");
	reporter.config().setTheme(Theme.DARK);
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("hostname", "localhost");
	extent.setSystemInfo("os", "windows10");
	extent.setSystemInfo("testername", "abc");
	extent.setSystemInfo("browser name", "chrome");
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
	test=extent.createTest("Fbtitleverification");
	
	String actual=driver.getTitle();
	String expected="facebook";
	Assert.assertEquals(actual, expected);
	
}
@Test
public void fbbuttontest()
{
	test=extent.createTest("fbbuttontest");
	String buttontext=driver.findElement(By.xpath("//button[@id='loginbutton']")).getText();
	Assert.assertEquals(buttontext,"register");
	
}
@Test
public void fblogotest()
{
	test=extent.createTest("Fblogotest");
	boolean b=driver.findElement(By.xpath(""));
	Assert.assertTrue(b);
}
@AfterTest
public void teardown()
{
	extent.flush();
}
@AfterMethod
public void browserclose(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			String screenshotpath=myreport.screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
		}
		
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case Passed is"+result.getName());
		}
		
		 
	}
	public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="./screenshot/"+screenshotname +".png";
		FileHandler.copy(src, new File(destination));
		return destination;
	}
}

	
	
}
}
