package Principal;

import java.util.Scanner;

import Fila.Fila;
import Senhas.Senha;
import Senhas.SenhaNormal;
import Senhas.SenhaPrioridade;

public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Fila historico = new Fila();
		int qtdNormal = 0;
		int qtdPrioridade = 0;	
		
		Scanner x = new Scanner(System.in);
		int ans;
		boolean ativo = true;
		
		
		while(ativo) {
			System.out.println("---------- MENU ----------");
			System.out.println("1. Nova senha normal");
			System.out.println("2. Nova senha prioritária");
			System.out.println("3. Proxima senha");
			System.out.println("4. Sair");
			ans = x.nextInt();
			switch(ans) {
				case 1:
					Senha novaSenha = new SenhaNormal(++qtdNormal);
					fila.newPassword(novaSenha);
					break;
				case 2:
					Senha novaSenhaa = new SenhaPrioridade(++qtdPrioridade);
					fila.newPassword(novaSenhaa);
					break;
				case 3:
					historico.addLast(fila.getFila()[0]);
					fila.nextPassword();
					break;
				case 4:
					ativo = false;
					break;
					
				default:
					System.out.println("Digite uma opção válida");
			}

			
			if(fila.size() > 0) {
				fila.atual();
			}
			
			System.out.println("---- HISTORICO ----");
			historico.printHistorico();
			System.out.println("-------------------");
			
			
		}
		
		x.close();
	}

}
