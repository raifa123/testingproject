package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametertest {
@Parameters("a")
@Test
public void main(String v)
{
	System.out.println("value is:"+v);
}

}
