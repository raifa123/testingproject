package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gpaytitle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://pay.google.com");
		String src=driver.getTitle();
		System.out.println("title");
		String expectedtitle="Google Pay";
		if(src.equals(expectedtitle))
		
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}
	}


