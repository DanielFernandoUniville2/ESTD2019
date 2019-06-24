package Algoritmos;


import java.io.IOException;

import Ordenacoes.BubbleSortCount;
import Ordenacoes.InsertionSortCount;
import Ordenacoes.MergeSortCount;
import Ordenacoes.QuickSortCount;
import Ordenacoes.SelectionSortCount;

public class Main {

	public static <T> void main(String[] args) throws NumberFormatException, IOException{
		BubbleSortCount bubble = new BubbleSortCount();
		InsertionSortCount insertion = new InsertionSortCount();
		SelectionSortCount selection = new SelectionSortCount();
		MergeSortCount merge = new MergeSortCount();
		QuickSortCount quick = new QuickSortCount();
		
		merge.count();
		System.out.println("--------------------");

		quick.count();
		System.out.println("--------------------");
		/*
		insertion.count();
		System.out.println("--------------------");
		
		selection.count();
		System.out.println("--------------------");
		
		bubble.count();
		System.out.println("--------------------");*/
		

	}
}
