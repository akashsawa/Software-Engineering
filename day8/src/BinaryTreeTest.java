import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

class BinaryTreeTest {
	@Test
	void testPreOrder() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForPreOrder();
		int[] traversalResult = bt.PreOrder();

		assertArrayEquals(element, traversalResult);
	}

	@Test
	void testLevelOrder() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForLevelOrder();
		int[] traversalResult = bt.LevelOrder();

		assertArrayEquals(element, traversalResult);
	}
}
