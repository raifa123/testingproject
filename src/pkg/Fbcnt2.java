package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fbcnt2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String src=driver.getPageSource();
		if(src.contains("Create new account"))
		
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}

}
}
