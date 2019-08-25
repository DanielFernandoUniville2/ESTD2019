package Fila;

import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;

public class Fila {
	private Animal[] animais;
	private int tail;
	
	public Fila(int size) {
		this.animais = new Animal[size];
		this.tail = -1;
	}
	
	// Complexidade: O(n)
	public Animal dequeueAny() {
		if(!this.isEmpty()) {
			Animal deletedAnimal = this.animais[0];
			this.shiftLeft(0);
			tail--;
			return deletedAnimal;
		}else {
			System.out.println("A fila está vazia!");
		}
			return null;
	}
	
	// Complexidade: O(n)
	public Animal dequeueCat() {
		if(!this.isEmpty()) {
			int aux = -1;
			for(int i=0; i<=tail; i++)
				if(animais[i] instanceof Gato) {
					aux = i;
					break;
				}
			if(aux == -1) System.out.println("Não possui gatos!");
			else {
				Animal deletedAnimal = this.animais[aux];
				this.shiftLeft(aux);
				tail--;
				return deletedAnimal;
			}
		}else {
			System.out.println("A fila está vazia");
		}
				return null;
	}
	
	// Complexidade: O(n)
	public Animal dequeueDog() {
		if(!this.isEmpty()) {
			int aux = -1;
			for(int i=0; i<=tail; i++)
				if(animais[i] instanceof Cachorro) {
					aux = i;
					break;
				}

			if(aux == -1) System.out.println("Não possui cachorro!");
			else {
				Animal deletedAnimal = this.animais[aux];
				this.shiftLeft(aux);
				tail--;
				return deletedAnimal;
			}
			
		}else {
			System.out.println("A fila está vazia");
		}
			return null;
	}
	
	// Complexidade: O(n)
	public void shiftLeft(int posicao) {
		for(int i=posicao; i<tail; i++) {
			this.animais[i] = this.animais[i+1];
		}
	}
	
	// Complexidade: O(n)
	public void showQueue() {
		System.out.println("O abrigo possui " + (tail+1) + " animal(is)");
		for(int i=0; i<=tail; i++)
			System.out.println(animais[i].getNome());
	}
	
	
	// Complexidade: O(1)
	public void enqueue(Animal novoAnimal) {
		if(!this.isFull()) {
			this.animais[++tail] = novoAnimal;
		}else {
			System.out.println("A fila está cheia!");
		}
	}
	
	
	// Complexidade: O(1)
	public boolean isEmpty() {
		return this.tail < 0;
	}
	
	// Complexidade: O(1)
	public boolean isFull() {
		return this.tail == this.animais.length - 1;
	}
	
	// Complexidade: O(1)
	public int size() {
		return tail+1;
	}
}
