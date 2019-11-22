package omniwyse.Assignments;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import junit.framework.Assert;

public class FibonacciTest {

	
	@Test
	public void test() {
		Assert.assertEquals(34,Fibonacci.fib(9));
	}

}
