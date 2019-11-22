package omniwyse.Assignments;
import java.util.LinkedList;
import org.junit.Assert;
import org.junit.Test;
public class Assign2Prgm1Test {
	@Test
	public void testListInsert() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		Assign2Prgm1.insert(list, 3);
		Assert.assertEquals(3, Assign2Prgm1.size);
	}

	@Test
	public void testListFind() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		Assert.assertEquals(2, Assign2Prgm1.find(list, 2));
	}

	@Test
	public void testDeleteList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		Assign2Prgm1.delete(list, 2);
		Assert.assertEquals(1, Assign2Prgm1.size);
	}

	@Test
	public void testDispalyList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		Assign2Prgm1.displayList(list);
		Assert.assertEquals(2, Assign2Prgm1.count);
	}

	@Test
	public void testSizeOfList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		Assert.assertEquals(2, Assign2Prgm1.sizeOfList(list));
	}

	@Test
	public void testIsEmpty() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		Assert.assertEquals(false, Assign2Prgm1.isEmpty((list)));
	}
}


	