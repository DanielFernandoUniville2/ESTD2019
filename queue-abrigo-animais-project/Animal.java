package Animais;

public abstract class Animal {
	private String nome;
	private String raca;
	
	public Animal(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public String getNome() {
		return nome;
	}
}
