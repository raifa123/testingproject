package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitpgm {
	@Before
	public void setup()
	{
		System.out.println("browser open");
		}
	@Test
	public void test()
	{
		System.out.println("test activities");
	}
	@Test
	public void contentverification()
	{
		System.out.println("content test");
	}
	@After
	public void browseclose()
	{
		System.out.println("browser close");
	}
}