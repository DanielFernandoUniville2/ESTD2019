package Ordenacoes;

import java.io.IOException;

import Algoritmos.InsertionSort;
import Algoritmos.Pontos;
import Comps.Comparator;
import Comps.ComparatorInteger;
import Comps.ComparatorPoints;
import Comps.ComparatorString;
import Entradas.ReadFiles;

public class InsertionSortCount {
	public void count() throws NumberFormatException, IOException {
		int qtd100k = 100000;
		int qtd1kk = 1000000;
		
		ReadFiles readFiles = new ReadFiles();
		Float[] numeros_100k = readFiles.ReadFloat(qtd100k);
		Float[] numeros_1kk = readFiles.ReadFloat(qtd1kk);
		String[] palavras_100k = readFiles.ReadString(qtd100k);
		String[] palavras_1kk = readFiles.ReadString(qtd1kk);
		Pontos[] pontos_100k = readFiles.ReadPoints(qtd100k);
		Pontos[] pontos_1kk = readFiles.ReadPoints(qtd1kk);
		
		Comparator<Float> compareFloat = new ComparatorInteger();
		Comparator<String> compareString = new ComparatorString();
		Comparator<Pontos> comparePoints = new ComparatorPoints();
		
		// Ordenando InsertionSort crescente 100K

		/*InsertionSort<Float> insertionFloat100k = new InsertionSort<Float>(numeros_100k, compareFloat, false);
		InsertionSort<String> insertionString100k = new InsertionSort<String>(palavras_100k, compareString, false);
		InsertionSort<Pontos> insertionPoints100k = new InsertionSort<Pontos>(pontos_100k, comparePoints, false);
		
		long tempoInicialFloat = System.currentTimeMillis();
		insertionFloat100k.sort();
		System.out.println("Crescente - 100k - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		long tempoInicialString = System.currentTimeMillis();
		insertionString100k.sort();
		System.out.println("Crescente - 100k - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		long tempoInicialPoints = System.currentTimeMillis();
		insertionPoints100k.sort();
		System.out.println("Crescente - 100k - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

	
		
		// Ordenando InsertionSort decrescete 100 K
		
		insertionFloat100k = new InsertionSort<Float>(numeros_100k, compareFloat, true);
		insertionString100k = new InsertionSort<String>(palavras_100k, compareString, true);
		insertionPoints100k = new InsertionSort<Pontos>(pontos_100k, comparePoints, true);
		
		tempoInicialFloat = System.currentTimeMillis();
		insertionFloat100k.sort();
		System.out.println("Decrescente - 100k - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		tempoInicialString = System.currentTimeMillis();
		insertionString100k.sort();
		System.out.println("Decrescente - 100k - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		tempoInicialPoints = System.currentTimeMillis();
		insertionPoints100k.sort();
		System.out.println("Decrescente - 100k - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));
		
		
		
		// Ordenando InsertionSort crescente 1kK

		InsertionSort<Float> insertionFloat1kk = new InsertionSort<Float>(numeros_1kk, compareFloat, false);
		InsertionSort<String> insertionString1kk = new InsertionSort<String>(palavras_1kk, compareString, false);
		InsertionSort<Pontos> insertionPoints1kk = new InsertionSort<Pontos>(pontos_1kk, comparePoints, false);
		
		tempoInicialFloat = System.currentTimeMillis();
		insertionFloat1kk.sort();
		System.out.println("Crescente - 1kk - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		tempoInicialString = System.currentTimeMillis();
		insertionString1kk.sort();
		System.out.println("Crescente - 1kk - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		tempoInicialPoints = System.currentTimeMillis();
		insertionPoints1kk.sort();
		System.out.println("Crescente - 1kk - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

		
		*/
		// Ordenando InsertionSort decrescete 1KK
		
		InsertionSort<Float>insertionFloat1kk = new InsertionSort<Float>(numeros_1kk, compareFloat, true);
		InsertionSort<String>insertionString1kk = new InsertionSort<String>(palavras_1kk, compareString, true);
		InsertionSort<Pontos>insertionPoints1kk = new InsertionSort<Pontos>(pontos_1kk, comparePoints, true);
		
		 long tempoInicialFloat = System.currentTimeMillis();
		insertionFloat1kk.sort();
		System.out.println("Decrescente - 1kk - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		 long tempoInicialString = System.currentTimeMillis();
		insertionString1kk.sort();
		System.out.println("Decrescente - 1kk - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		 long tempoInicialPoints = System.currentTimeMillis();
		insertionPoints1kk.sort();
		System.out.println("Decrescente - 1kk - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

	}
}
