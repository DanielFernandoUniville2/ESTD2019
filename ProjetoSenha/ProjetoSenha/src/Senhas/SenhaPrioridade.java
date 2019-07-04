package Senhas;

import java.util.Date;

public class SenhaPrioridade extends Senha{
	
	int numero;
	Date date;
	
	public SenhaPrioridade(int numero) {
		this.numero = numero;
	    this.date = new Date();
	}
	
	public SenhaPrioridade() {
	
	}

	public int getNumero() {
		return numero;
	}

	public Date getDate() {
		return date;
	}
	
	@Override
	public String toString() {
		return "############\n#    P-"+ numero + "   #\n############" ;
	}
}
