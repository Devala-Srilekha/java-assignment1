package omniwyse.Assignment3;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class BstTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		 BSTorNOT tree = new BSTorNOT(); 
	        tree.root = new Node(4); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(5); 
	        tree.root.left.left = new Node(1); 
	        tree.root.left.right = new Node(3);
	  
	        if (tree.isBST()) 
	            System.out.println("IS BST"); 
	        else
	            System.out.println("Not a BST"); 
	}
	}


