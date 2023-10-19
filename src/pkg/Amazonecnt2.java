package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonecnt2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		String src=driver.getPageSource();
		if(src.contains("prime"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	}


