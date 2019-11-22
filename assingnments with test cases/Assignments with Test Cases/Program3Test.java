package omniwyse.Assignments;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Program3Test {

	@Test
	public void test() {
		Assert.assertEquals(10,Program3Gcd.gcd(10, 20));
	}

}
