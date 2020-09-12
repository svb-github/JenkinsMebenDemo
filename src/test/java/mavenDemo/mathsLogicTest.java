package mavenDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class mathsLogicTest {
	
	mathsLogic ml = new mathsLogic();
	
	@Test
	
	public void additionTest()
	{
	int addResult = ml.addition(3, 2);
	Assert.assertEquals(addResult, 5);
	}
	
	@Test
	public void subtractionTest()
	{
	int subResult = ml.subtraction(3, 2);
	Assert.assertEquals(subResult, 5);
	}

}
