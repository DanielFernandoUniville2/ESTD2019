package Main;

import java.util.Scanner;

import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Fila.Fila;

public class main {

	public static void main(String[] args) {
		Fila abrigo;
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite o tamanho do abrigo: ");
		int tam = leitura.nextInt();
		abrigo = new Fila(tam);
		
		while(true) {
			System.out.println("---- MENU ---- ");
			System.out.println("1. Cadastrar gato");
			System.out.println("2. Cadastrar cachorro");
			System.out.println("3. Retirar animal");
			System.out.println("4. Retirar gato");
			System.out.println("5. Retirar cachorro");
			int op = leitura.nextInt();
			switch(op) {
				case 1:
						System.out.println("Digite o nome: ");
						String nome = leitura.next();
						System.out.println("Digite a raça: ");
						String raca = leitura.next();
						Animal novoGato = new Gato(nome, raca);
						abrigo.enqueue(novoGato);
						break;
				case 2:
						System.out.println("Digite o nome: ");
						nome = leitura.next();
						System.out.println("Digite a raça: ");
						raca = leitura.next();
						Animal novoCachorro = new Cachorro(nome, raca);
						abrigo.enqueue(novoCachorro);
						break;
				case 3:
						abrigo.dequeueAny();
						break;
				case 4:
						abrigo.dequeueCat();
						break;
				case 5:
						abrigo.dequeueDog();
						break;
			}
					    abrigo.showQueue();
		}
		
	
	}

}
