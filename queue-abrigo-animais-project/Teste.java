package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Fila.Fila;

class Teste {

	@Test
	void test() {
		Fila abrigo = new Fila(5);
		Animal testeAnimal = new Gato("gato1", "haha");
		Animal testeAnimal2 = new Gato("gato2", "haha");
		Animal testeAnimal3 = new Gato("gato3", "haha");
		Animal testeAnimal4 = new Cachorro("cachorro1", "haha");
		Animal testeAnimal5 = new Cachorro("cachorro2", "haha");
		Animal testeAnimal6 = new Cachorro("cachorro3", "haha");


		// Testando se a fila está vazia !
		abrigo.dequeueAny();
		abrigo.dequeueCat();
		abrigo.dequeueDog();
		assertEquals(0, abrigo.size());
		
		// Testando limite da fila !
		abrigo.enqueue(testeAnimal);
		assertEquals(1, abrigo.size());
		abrigo.enqueue(testeAnimal2);
		abrigo.enqueue(testeAnimal3);
		abrigo.enqueue(testeAnimal4);
		abrigo.enqueue(testeAnimal5);
		assertEquals(5, abrigo.size());
		abrigo.enqueue(testeAnimal6);
		assertEquals(5, abrigo.size());
		
		// Testando retirada da fila
		assertEquals(testeAnimal, abrigo.dequeueAny());
		
		assertEquals(testeAnimal2, abrigo.dequeueCat());
		
		assertEquals(testeAnimal4, abrigo.dequeueDog());
		
		assertEquals(testeAnimal3, abrigo.dequeueAny());

		





	}

}
