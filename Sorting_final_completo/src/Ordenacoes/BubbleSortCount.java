package Ordenacoes;

import java.io.IOException;

import Algoritmos.BubbleSort;
import Algoritmos.Pontos;
import Comps.Comparator;
import Comps.ComparatorInteger;
import Comps.ComparatorPoints;
import Comps.ComparatorString;
import Entradas.ReadFiles;

public class BubbleSortCount {
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
		
		// Ordenando BubbleSort crescente 100K

		/*BubbleSort<Float> bubbleFloat100k = new BubbleSort<Float>(numeros_100k, compareFloat, false);
		BubbleSort<String> bubbleString100k = new BubbleSort<String>(palavras_100k, compareString, false);
		BubbleSort<Pontos> bubblePoints100k = new BubbleSort<Pontos>(pontos_100k, comparePoints, false);
		
		long tempoInicialFloat = System.currentTimeMillis();
		bubbleFloat100k.sort();
		System.out.println("Crescente - 100k - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		long tempoInicialString = System.currentTimeMillis();
		bubbleString100k.sort();
		System.out.println("Crescente - 100k - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		long tempoInicialPoints = System.currentTimeMillis();
		bubblePoints100k.sort();
		System.out.println("Crescente - 100k - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

	
		
		// Ordenando BubbleSort decrescete 100 K
		
		bubbleFloat100k = new BubbleSort<Float>(numeros_100k, compareFloat, true);
		bubbleString100k = new BubbleSort<String>(palavras_100k, compareString, true);
		bubblePoints100k = new BubbleSort<Pontos>(pontos_100k, comparePoints, true);
		
		tempoInicialFloat = System.currentTimeMillis();
		bubbleFloat100k.sort();
		System.out.println("Decrescente - 100k - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		tempoInicialString = System.currentTimeMillis();
		bubbleString100k.sort();
		System.out.println("Decrescente - 100k - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		tempoInicialPoints = System.currentTimeMillis();
		bubblePoints100k.sort();
		System.out.println("Decrescente - 100k - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));
		
		
		
		// Ordenando BubbleSort crescente 1kK

		BubbleSort<Float> bubbleFloat1kk = new BubbleSort<Float>(numeros_1kk, compareFloat, false);
		BubbleSort<String> bubbleString1kk = new BubbleSort<String>(palavras_1kk, compareString, false);
		BubbleSort<Pontos> bubblePoints1kk = new BubbleSort<Pontos>(pontos_1kk, comparePoints, false);
		
		float tempoInicialFloat = System.currentTimeMillis();
		bubbleFloat1kk.sort();
		System.out.println("Crescente - 1kk - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		BubbleSort<String> bubbleString1kk = new BubbleSort<String>(palavras_1kk, compareString, false);
		long tempoInicialString = System.currentTimeMillis();
		bubbleString1kk.sort();
		System.out.println("Crescente - 1kk - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));
		
		BubbleSort<Pontos> bubblePoints1kk = new BubbleSort<Pontos>(pontos_1kk, comparePoints, false);
		long tempoInicialPoints = System.currentTimeMillis();
		bubblePoints1kk.sort();
		System.out.println("Crescente - 1kk - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

		*/
		
		// Ordenando BubbleSort decrescete 1KK
		
		BubbleSort<Float> bubbleFloat1kk;
		BubbleSort<String> bubbleString1kk; 
		BubbleSort<Pontos> bubblePoints1kk;
		
		bubbleFloat1kk = new BubbleSort<Float>(numeros_1kk, compareFloat, true);
		bubbleString1kk = new BubbleSort<String>(palavras_1kk, compareString, true);
		bubblePoints1kk = new BubbleSort<Pontos>(pontos_1kk, comparePoints, true);
		
		long tempoInicialFloat = System.currentTimeMillis();
		bubbleFloat1kk.sort();
		System.out.println("Decrescente - 1kk - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		long tempoInicialString = System.currentTimeMillis();
		bubbleString1kk.sort();
		System.out.println("Decrescente - 1kk - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		long tempoInicialPoints = System.currentTimeMillis();
		bubblePoints1kk.sort();
		System.out.println("Decrescente - 1kk - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));
		
	}
}

