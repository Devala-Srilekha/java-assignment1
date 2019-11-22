package omniwyse.Assignments;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
public class Assign2Prgm2Test {
	@Test
	public void testListReverse() 
	{
	ArrayList<String> listInput = new ArrayList<String>();
	listInput.add("Intern");
	listInput.add("Technologies");
    listInput.add("Omniwyse");
	
	ArrayList<String> listReverse = new ArrayList<String>();
	listReverse.add("Omniwyse");
	listReverse.add("Technologies");
	listReverse.add("Intern");
	Assert.assertEquals(listReverse, Assign2Prgm2.reverseList(listInput));
}
}



	