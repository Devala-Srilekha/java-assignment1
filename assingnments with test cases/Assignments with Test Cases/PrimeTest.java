package omniwyse.Assignments;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PrimeTest {

	@Test
	public void test() {
		Assert.assertEquals(true,Prime.isPrime(11));
	}

}
