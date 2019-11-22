package omniwyse.Assignments;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import junit.framework.Assert;

public class ToSearchArrayTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals(true,ToSearchArray.numberIsInArray(10));
	}

}
