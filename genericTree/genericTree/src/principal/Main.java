package principal;

import java.io.File;

public class Main {


    public static void main(String x[]) {
    	
    	String caminho = "/home/daniel/Downloads/ExemploHeranca"; // Caminho para o diret�rio que ser� percorrido 
    	 
        File path = new File(caminho); 
        
        Tree tree = new Tree();
        
        MyFile root = new MyFile(path.getName(), path.length(), true); // Criacao do root da arvore
        
        tree.getRoot().addChildren(root);
        
        tree.addChild(path, tree.getRoot().getChildrens().get(0));
        tree.print(tree.getRoot(), 1);
    }
}
