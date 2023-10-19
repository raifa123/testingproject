package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googledemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("title");
		String expectedtitle="Google";
		if(title.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
