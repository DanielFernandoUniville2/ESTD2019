package Tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testesUnitarios {

	@Test
	void test() {
		BST novaBST = new BST();

		novaBST.add(10);
		novaBST.add(1);
		novaBST.add(5);
		novaBST.add(8);
		novaBST.add(9);
		novaBST.add(13);
		
		assertTrue(novaBST.contains(10));
		assertFalse(novaBST.contains(50));
		
		novaBST.remove(10);
		
		assertFalse(novaBST.contains(10));
		
		assertEquals(5, novaBST.size());
		
		assertFalse(novaBST.isEmpty());
		
		novaBST.clear();
		
		assertTrue(novaBST.isEmpty());
				
	}

}
