package omniwyse.Assignments;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import junit.framework.Assert;

public class Program7Test {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals(16,Program7.power(2, 4));
	}

}
