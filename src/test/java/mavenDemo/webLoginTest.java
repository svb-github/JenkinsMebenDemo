package mavenDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class webLoginTest {
	
	webLogin wl = new webLogin();
	
	@Test
	
	public void test03()
	{
		String result = wl.webLoginChrome();
		Assert.assertEquals(result, "JavaByKiran | Dashboard");
	}
	
	

}
