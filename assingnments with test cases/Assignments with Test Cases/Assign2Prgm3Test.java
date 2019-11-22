package omniwyse.Assignments;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Assign2Prgm3Test {
	private Assign2Prgm3 stack;

	@Before
	public void setUp() {
		stack = new Assign2Prgm3(100);
	}

	@Test
	public void testPush() {
		stack.push(1);
		stack.push(2);
		Assert.assertEquals(2, stack.size());
	}

	@Test
	public void testPop() {
		stack.push(1);
		stack.push(2);
		Assert.assertEquals(2, stack.pop());
	}

	@Test
	public void isEmptyTest() {
		Assert.assertEquals(true, stack.isEmpty());
	}

	@Test
	public void testSize() {
		stack.push(1);
		stack.push(2);
		Assert.assertEquals(2, stack.size());
	}

}


	