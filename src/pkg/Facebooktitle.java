package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktitle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String expectedtitle="Facebook";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
