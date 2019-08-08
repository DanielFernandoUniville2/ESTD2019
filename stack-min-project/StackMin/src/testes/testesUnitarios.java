package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import stack.StackGetMin;

class testesUnitarios {
	
	@Test
	void testGetMin() {
		
		StackGetMin teste = new StackGetMin(10);
		
		teste.push(2);
		teste.push(1);
		assertEquals(1, teste.getMin());
		teste.pop();
		teste.pop();
		teste.push(3);
		teste.push(2);
		assertEquals(2, teste.getMin());
		teste.push(4);
		teste.push(2);
		assertEquals(2, teste.getMin());
		teste.pop();
		teste.pop();
		
	}

}
