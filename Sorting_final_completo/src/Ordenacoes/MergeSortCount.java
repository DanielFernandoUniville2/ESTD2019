package Ordenacoes;

import java.io.IOException;

import Algoritmos.Pontos;
import Algoritmos.MergeSort;
import Comps.Comparator;
import Comps.ComparatorInteger;
import Comps.ComparatorPoints;
import Comps.ComparatorString;
import Entradas.ReadFiles;

public class MergeSortCount {
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
		
		// Ordenando MergeSort crescente 100K

		MergeSort<Float> mergeFloat100k = new MergeSort<Float>(numeros_100k, compareFloat, false);
		MergeSort<String> mergeString100k = new MergeSort<String>(palavras_100k, compareString, false);
		MergeSort<Pontos> mergePoints100k = new MergeSort<Pontos>(pontos_100k, comparePoints, false);
		
		long tempoInicialFloat = System.currentTimeMillis();
		mergeFloat100k.sort();
		System.out.println("Crescente - 100k - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		long tempoInicialString = System.currentTimeMillis();
		mergeString100k.sort();
		System.out.println("Crescente - 100k - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		long tempoInicialPoints = System.currentTimeMillis();
		mergePoints100k.sort();
		System.out.println("Crescente - 100k - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

	
		
		// Ordenando MergeSort decrescete 100 K
		
		mergeFloat100k = new MergeSort<Float>(numeros_100k, compareFloat, true);
		mergeString100k = new MergeSort<String>(palavras_100k, compareString, true);
		mergePoints100k = new MergeSort<Pontos>(pontos_100k, comparePoints, true);
		
		tempoInicialFloat = System.currentTimeMillis();
		mergeFloat100k.sort();
		System.out.println("Decrescente - 100k - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		tempoInicialString = System.currentTimeMillis();
		mergeString100k.sort();
		System.out.println("Decrescente - 100k - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		tempoInicialPoints = System.currentTimeMillis();
		mergePoints100k.sort();
		System.out.println("Decrescente - 100k - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));
		
		
		
		// Ordenando MergeSort crescente 1kK

		MergeSort<Float> mergeFloat1kk = new MergeSort<Float>(numeros_1kk, compareFloat, false);
		MergeSort<String> mergeString1kk = new MergeSort<String>(palavras_1kk, compareString, false);
		MergeSort<Pontos> mergePoints1kk = new MergeSort<Pontos>(pontos_1kk, comparePoints, false);
		
		tempoInicialFloat = System.currentTimeMillis();
		mergeFloat1kk.sort();
		System.out.println("Crescente - 1kk - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		tempoInicialString = System.currentTimeMillis();
		mergeString1kk.sort();
		System.out.println("Crescente - 1kk - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		tempoInicialPoints = System.currentTimeMillis();
		mergePoints1kk.sort();
		System.out.println("Crescente - 1kk - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

	
		
		// Ordenando MergeSort decrescete 1KK
		
		mergeFloat1kk = new MergeSort<Float>(numeros_1kk, compareFloat, true);
		mergeString1kk = new MergeSort<String>(palavras_1kk, compareString, true);
		mergePoints1kk = new MergeSort<Pontos>(pontos_1kk, comparePoints, true);
		
		tempoInicialFloat = System.currentTimeMillis();
		mergeFloat1kk.sort();
		System.out.println("Decrescente - 1kk - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		tempoInicialString = System.currentTimeMillis();
		mergeString1kk.sort();
		System.out.println("Decrescente - 1kk - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		tempoInicialPoints = System.currentTimeMillis();
		mergePoints1kk.sort();
		System.out.println("Decrescente - 1kk - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

	}
}
