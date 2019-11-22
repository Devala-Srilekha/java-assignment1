package omniwyse.Assignments;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class Algorithm1Test {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		int arr[][] = { { 1, 2, 3 },
                {4, 5, 6},
      {7,8,9}}; 
		rotate90Clockwise(arr); 
	}

	private void rotate90Clockwise(int[][] arr) {
		// TODO Auto-generated method stub
		
	}

}
