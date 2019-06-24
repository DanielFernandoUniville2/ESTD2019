package Ordenacoes;

import java.io.IOException;

import Algoritmos.Pontos;
import Algoritmos.QuickSort;
import Comps.Comparator;
import Comps.ComparatorInteger;
import Comps.ComparatorPoints;
import Comps.ComparatorString;
import Entradas.ReadFiles;

public class QuickSortCount {
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
		
		// Ordenando QuickSort crescente 100K

		QuickSort<Float> quickFloat100k = new QuickSort<Float>(numeros_100k, compareFloat, false);
		QuickSort<String> quickString100k = new QuickSort<String>(palavras_100k, compareString, false);
		QuickSort<Pontos> quickPoints100k = new QuickSort<Pontos>(pontos_100k, comparePoints, false);
		
		long tempoInicialFloat = System.currentTimeMillis();
		quickFloat100k.sort();
		System.out.println("Crescente - 100k - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		long tempoInicialString = System.currentTimeMillis();
		quickString100k.sort();
		System.out.println("Crescente - 100k - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		long tempoInicialPoints = System.currentTimeMillis();
		quickPoints100k.sort();
		System.out.println("Crescente - 100k - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

	
		
		// Ordenando QuickSort decrescete 100 K
		numeros_100k = readFiles.ReadFloat(qtd100k);
		palavras_100k = readFiles.ReadString(qtd100k);
		pontos_100k = readFiles.ReadPoints(qtd100k);



		quickFloat100k = new QuickSort<Float>(numeros_100k, compareFloat, true);
		quickString100k = new QuickSort<String>(palavras_100k, compareString, true);
		quickPoints100k = new QuickSort<Pontos>(pontos_100k, comparePoints, true);
		
		
		tempoInicialFloat = System.currentTimeMillis();
		quickFloat100k.sort();
		System.out.println("Decrescente - 100k - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		tempoInicialString = System.currentTimeMillis();
		quickString100k.sort();
		System.out.println("Decrescente - 100k - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		tempoInicialPoints = System.currentTimeMillis();
		quickPoints100k.sort();
		System.out.println("Decrescente - 100k - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));
		
		
		
		// Ordenando QuickSort crescente 1kK

		QuickSort<Float> quickFloat1kk = new QuickSort<Float>(numeros_1kk, compareFloat, false);
		QuickSort<String> quickString1kk = new QuickSort<String>(palavras_1kk, compareString, false);
		QuickSort<Pontos> quickPoints1kk = new QuickSort<Pontos>(pontos_1kk, comparePoints, false);
		
		tempoInicialFloat = System.currentTimeMillis();
		quickFloat1kk.sort();
		System.out.println("Crescente - 1kk - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		tempoInicialString = System.currentTimeMillis();
		quickString1kk.sort();
		System.out.println("Crescente - 1kk - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		tempoInicialPoints = System.currentTimeMillis();
		quickPoints1kk.sort();
		System.out.println("Crescente - 1kk - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

	
		
		// Ordenando QuickSort decrescete 1KK
		
		numeros_1kk = readFiles.ReadFloat(qtd1kk);
		palavras_1kk = readFiles.ReadString(qtd1kk);
		pontos_1kk = readFiles.ReadPoints(qtd1kk);

		
		quickFloat1kk = new QuickSort<Float>(numeros_1kk, compareFloat, true);
		quickString1kk = new QuickSort<String>(palavras_1kk, compareString, true);
		quickPoints1kk = new QuickSort<Pontos>(pontos_1kk, comparePoints, true);
		
		tempoInicialFloat = System.currentTimeMillis();
		quickFloat1kk.sort();
		System.out.println("Decrescente - 1kk - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		tempoInicialString = System.currentTimeMillis();
		quickString1kk.sort();
		System.out.println("Decrescente - 1kk - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		tempoInicialPoints = System.currentTimeMillis();
		quickPoints1kk.sort();
		System.out.println("Decrescente - 1kk - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

	}
}
