package Fila;

import Senhas.Senha;
import Senhas.SenhaNormal;
import Senhas.SenhaPrioridade;

public class Fila {
	Senha fila[];
	int size;
	int capacity;
	int pointer;
	
	public Fila() {
		capacity = 5;
		fila = new Senha[capacity];
		size = 0;
		pointer = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void newPassword(Senha novaSenha) {
		ensureCapacity();
		size++;

		if(novaSenha instanceof SenhaNormal ) {
			fila[size-1] = novaSenha;
		}else {
			for(int i = size; i>pointer; i--) fila[i] = fila[i-1];
			fila[pointer] = novaSenha;
			pointer++;
		}


	}
	
	public Senha nextPassword() {
		Senha aux = fila[0];
		
		if(aux instanceof SenhaPrioridade) pointer--;
		
		for(int i=0; i<size-1; i++) fila[i] = fila[i+1];
		size--;
		
		return aux;
	}
	
	private void ensureCapacity() {
		if(size+1 ==  this.capacity) {
			this.capacity *= 2;
			Senha[] novaFila = new Senha[this.capacity];
			for(int i=0; i<size;i++) novaFila[i] = fila[i];
			fila = novaFila;
		}
	}
	
	public void printFila() {
		for(int i=0; i<size; i++) System.out.println(fila[i].toString());
	}
	
	public void addLast(Senha novaSenha) {
		ensureCapacity();
		fila[size] = novaSenha;
		size++;
	}
	
	public void printHistorico() {
		for(int i=size-1; i>=0; i--) System.out.println(fila[i].toString());
	}
	
	public void atual() {
		System.out.println(fila[0].toString());
	}

	public Senha[] getFila() {
		return fila;
	}

	
	
}
