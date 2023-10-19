package testng;

import org.testng.annotations.Test;

public class Testnggroup {
@Test(groups={"sanity"})
public void main1()
{
	System.out.println("this is main1");
}
@Test(groups= {"sanity","smoke"})
public void main2()
{
	System.out.println("this is main2");
}
@Test(groups={"regression"})
public void main3()
{
	System.out.println("this is main3");
}
@Test(groups= {"sanity","regresssion"})
public void main4()
{
	System.out.println("this is main4");
}
@Test(groups= {"regression"})
public void main5()
{
	System.out.println("this is main5");

}
}
