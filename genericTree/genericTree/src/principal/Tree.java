package principal;

import java.io.File;

public class Tree {

	private MyFile root; // Raiz da �rvore !
	
	public Tree() {
		root = new MyFile();
	}

	public MyFile getRoot() {
		return root;
	}
	
	public void addChild(File directory, MyFile teste) { // M�todo para adicionar filho
		for(File files: directory.listFiles()) {
			MyFile children;
			if(files.isDirectory())
				children = new MyFile(files.getName(), files.length(), true);
			else
				children = new MyFile(files.getName(), files.length(), false);

			teste.addChildren(children); // Adiciona filho na lista de filhos
			if(files.isDirectory()) { // Se for diret�rio ent�o acionar� de forma recursiva o pr�prio m�todo
				addChild(files, teste.getChildrens().get(teste.getChildrens().size()-1));
			}
		}
    }

	public void print(MyFile teste, int size) {
		for(MyFile files: teste.getChildrens()) {
			if(files.isDirectory())
				System.out.println(size + ". " + files.getName());
			else
				System.out.println(size + ". " + files.getName() + " " + files.getTamanho() + " Bytes.");

			if(files.getChildrens().size() > 0) print(files, size+1); // Se existir filhos ent�o � diret�rio
																	  // chamar� a pr�pria fun��o de forma recursiva
		}
	}
	
	
}
