package br.univille.estd.sorting;
import java.io.File;
import java.util.Scanner;

/**
 * Exemplo de Utilizacao do algoritmo da bolha
 * @author leandersonandre
 *
 */
public class Main {
	
	public static void main(String[] args) {
		// Vetor de Teste
		Integer array[] = {7,3,-9,4,9,4};
		
		 File file=new File("C:\Users\1111006456\Desktop\estd\Sorting\Sorting\Arquivos\numeros_100000.txt");
	     Scanner sc=new Scanner(file);
	     while(sc.hasNextLine()){
	     System.out.println(sc.nextLine());
	     }
	     
	     File2 file2=new File2("C:\Users\1111006456\Desktop\estd\Sorting\Sorting\Arquivos\numeros_1000000.txt");
	     Scanner sc=new Scanner(file2);
	     while(sc.hasNextLine()){
	     System.out.println(sc.nextLine());
	     }
	     
	     File3 file3=new File3("C:\Users\1111006456\Desktop\estd\Sorting\Sorting\Arquivos\objetos_100000.txt");
	     Scanner sc=new Scanner(file3);
	     while(sc.hasNextLine()){
	     System.out.println(sc.nextLine());
	     }
	     
	     File4 file4=new File4("C:\Users\1111006456\Desktop\estd\Sorting\Sorting\Arquivos\objetos_1000000.txt");
	     Scanner sc=new Scanner(file4);
	     while(sc.hasNextLine()){
	     System.out.println(sc.nextLine());
	     }
		
	     File5 file5=new File5("C:\Users\1111006456\Desktop\estd\Sorting\Sorting\Arquivos\palavras_100000.txt");
	     Scanner sc=new Scanner(file5);
	     while(sc.hasNextLine()){
	     System.out.println(sc.nextLine());
	     }
	     
	     File6 file6=new File6("C:\Users\1111006456\Desktop\estd\Sorting\Sorting\Arquivos\palavras_1000000.txt");
	     Scanner sc=new Scanner(file6);
	     while(sc.hasNextLine()){
	     System.out.println(sc.nextLine());
	     }
	     
	     
		// Cria as instancias dos objetos
		Sort<Integer> bubbleSort = new BubbleSort<Integer>();
		Sort<Integer> QuickSort = new QuickSort<Integer>();
		InsertSort(arr1);
		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length-1);
		Comparable<Integer> comparacaoCrescente = new IntegerASCComparable();
		Comparable<Integer> comparacaoDecrecente = new IntegerDEComparable();
		
		//Faz ordenacao em modo crescente
		System.out.println("---");
		long time = bubbleSort.sort(array, comparacaoCrescente);
		System.out.println("Ordenacao Crescente por algoritmo da Bolha");
		printAll(array);
		System.out.println("Tempo Necessario em milisegundos para ordenar o arranjo : "+time);
		System.out.println();
		
		//Faz ordenacao em modo decrescente
		System.out.println("---");
		time = bubbleSort.sort(array, comparacaoDecrecente);
		System.out.println("Ordenacao Decrescente por algoritmo da Bolha");
		printAll(array);
		System.out.println("Tempo Necessario em milisegundos para ordenar o arranjo : "+time);
		
	}
	
	/**
	 * Imprime os elementos do array no console
	 * @param array
	 */
	public static void printAll(Integer[] array) {
		for(Integer i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
