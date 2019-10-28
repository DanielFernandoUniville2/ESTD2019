import Tree.BST;

public class Main {

	public static void main(String[] args) {
		BST novaBST = new BST();
		
		
		novaBST.add(10);
		novaBST.add(1);
		novaBST.add(5);
		novaBST.add(8);
		novaBST.add(9);
		novaBST.add(13);
		
		
		System.out.println("Cont�m o numero 10? " + novaBST.contains(10));
		System.out.println("Cont�m o numero 50? " + novaBST.contains(50));
		
		System.out.println("Lista inOrder da BST: " + novaBST.toString());
		novaBST.remove(10);
		novaBST.remove(5);
		System.out.println("Lista inOrder da BST ap�s remo��o: " + novaBST.toString());
		
		System.out.println("BST est� vazia? " + novaBST.isEmpty());
		
		System.out.println("Tamanho da BST: " + novaBST.size());
		
		novaBST.clear();
		
		System.out.println("Tamanho ap�s limpar: " + novaBST.size());
	}

}
