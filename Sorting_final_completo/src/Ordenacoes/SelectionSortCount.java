package Ordenacoes;

import java.io.IOException;

import Algoritmos.SelectionSort;
import Algoritmos.Pontos;
import Comps.Comparator;
import Comps.ComparatorInteger;
import Comps.ComparatorPoints;
import Comps.ComparatorString;
import Entradas.ReadFiles;

public class SelectionSortCount {
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
		
		// Ordenando SelectionSort crescente 100K

		/*SelectionSort<Float> selectionFloat100k = new SelectionSort<Float>(numeros_100k, compareFloat, false);
		SelectionSort<String> selectionString100k = new SelectionSort<String>(palavras_100k, compareString, false);
		SelectionSort<Pontos> selectionPoints100k = new SelectionSort<Pontos>(pontos_100k, comparePoints, false);
		
		long tempoInicialFloat = System.currentTimeMillis();
		selectionFloat100k.sort();
		System.out.println("Crescente - 100k - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		long tempoInicialString = System.currentTimeMillis();
		selectionString100k.sort();
		System.out.println("Crescente - 100k - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		long tempoInicialPoints = System.currentTimeMillis();
		selectionPoints100k.sort();
		System.out.println("Crescente - 100k - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

	
		
		// Ordenando SelectionSort decrescete 100 K
		
		selectionFloat100k = new SelectionSort<Float>(numeros_100k, compareFloat, true);
		selectionString100k = new SelectionSort<String>(palavras_100k, compareString, true);
		selectionPoints100k = new SelectionSort<Pontos>(pontos_100k, comparePoints, true);
		
		tempoInicialFloat = System.currentTimeMillis();
		selectionFloat100k.sort();
		System.out.println("Decrescente - 100k - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		tempoInicialString = System.currentTimeMillis();
		selectionString100k.sort();
		System.out.println("Decrescente - 100k - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		tempoInicialPoints = System.currentTimeMillis();
		selectionPoints100k.sort();
		System.out.println("Decrescente - 100k - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));
		
		
		
		// Ordenando SelectionSort crescente 1kK

		SelectionSort<Float> selectionFloat1kk = new SelectionSort<Float>(numeros_1kk, compareFloat, false);
		SelectionSort<String> selectionString1kk = new SelectionSort<String>(palavras_1kk, compareString, false);
		SelectionSort<Pontos> selectionPoints1kk = new SelectionSort<Pontos>(pontos_1kk, comparePoints, false);
		
		tempoInicialFloat = System.currentTimeMillis();
		selectionFloat1kk.sort();
		System.out.println("Crescente - 1kk - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		
		float tempoInicialString = System.currentTimeMillis();
		selectionString1kk.sort();
		System.out.println("Crescente - 1kk - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		float tempoInicialPoints = System.currentTimeMillis();
		 selectionPoints1kk.sort();
		System.out.println("Crescente - 1kk - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

	
		
		// Ordenando SelectionSort decrescete 1KK
		
		selectionFloat1kk = new SelectionSort<Float>(numeros_1kk, compareFloat, true);
		selectionString1kk = new SelectionSort<String>(palavras_1kk, compareString, true);
		selectionPoints1kk = new SelectionSort<Pontos>(pontos_1kk, comparePoints, true);
		
		tempoInicialFloat = System.currentTimeMillis();
		 selectionFloat1kk.sort();
		System.out.println("Decrescente - 1kk - Numeros - Foi executado em: " + (System.currentTimeMillis() - tempoInicialFloat));
		*/
		SelectionSort<String> selectionString1kk = new SelectionSort<String>(palavras_1kk, compareString, true);
		SelectionSort<Pontos> selectionPoints1kk = new SelectionSort<Pontos>(pontos_1kk, comparePoints, true);
		float tempoInicialString = System.currentTimeMillis();
		 selectionString1kk.sort();
		System.out.println("Decrescente - 1kk - String - Foi executado em: " + (System.currentTimeMillis() - tempoInicialString));

		
		float tempoInicialPoints = System.currentTimeMillis();
		 selectionPoints1kk.sort();
		System.out.println("Decrescente - 1kk - Pontos - Foi executado em: " + (System.currentTimeMillis() - tempoInicialPoints));

	}
}
