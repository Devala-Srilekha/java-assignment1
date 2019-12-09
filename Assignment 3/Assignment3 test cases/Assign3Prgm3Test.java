package omniwyse.Assignment3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import junit.framework.Assert;
import omniwyse.Assignments.Assign2Prgm3;

public class Assign3Prgm3Test {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
			 String exp = "3+4*5/6"; 
			 Assert.assertEquals("345*6/+", Assign3prgm3.infixToPostfix(exp));
		        System.out.println(Assign3prgm3.infixToPostfix(exp)); 
		}
	}


