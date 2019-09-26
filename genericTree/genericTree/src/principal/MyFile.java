package principal;

import java.util.ArrayList;

public class MyFile {
	private String name; // Nome do arquivo
	private long tamanho; // Tamanho do arquivo
	private boolean isDirectory; // Testa se é diretório
	private ArrayList<MyFile> childrens; // Lista de filhos do n�
	
	public MyFile(String name, long tamanho, boolean isDirectory) {
		this.name = name;
		this.tamanho = tamanho;
		this.isDirectory = isDirectory;
		this.childrens = new ArrayList<MyFile>();
	}
	
	public MyFile() {
		this.childrens = new ArrayList<MyFile>();
	}
	
	public void addChildren(MyFile children) {
		childrens.add(children);
	}

	public String getName() {
		return name;
	}

	public long getTamanho() {
		return tamanho;
	}

	public ArrayList<MyFile> getChildrens() {
		return childrens;
	}

	public boolean isDirectory() {
		return isDirectory;
	}

	
	
	
}
