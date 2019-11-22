package omniwyse.Assignments;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class Assign2Prgm4Test {
	@Test
	public void test() 
	{
		char balancedParenthesis[] = {'{','(',')','}'};
		Assert.assertEquals(true, Assign2Prgm4.isParenthesisBalanced(balancedParenthesis));
		char inBalancedParenthesis[] = {'{','}',')','}'};
		Assert.assertEquals(false,Assign2Prgm4.isParenthesisBalanced(inBalancedParenthesis));
		
	}

	

}
