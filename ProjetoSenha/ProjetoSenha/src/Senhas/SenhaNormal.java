package Senhas;

import java.util.Date;

public class SenhaNormal extends Senha{

	int numero;
	Date date;
	
	public SenhaNormal(int numero) {
		this.numero = numero;
	    this.date = new Date();
	}
	
	public SenhaNormal() {
	
	}

	public int getNumero() {
		return numero;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "############\n#    N-"+ numero + "   #\n############" ;
	}
	
	
	
}
