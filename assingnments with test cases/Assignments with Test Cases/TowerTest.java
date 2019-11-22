package omniwyse.Assignments;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import junit.framework.Assert;

public class TowerTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertEquals(1,TowerOfHanoi.towerOfHanoiPuzzle(3,'A','C','B') );
	}

}
