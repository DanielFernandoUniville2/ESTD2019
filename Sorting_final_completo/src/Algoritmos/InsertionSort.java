package Algoritmos;

import Comps.Comparator;

public class InsertionSort<T> {
	
	Comparator<T> comparator;
	T[] arr;
	int desc = 1;
	
	public InsertionSort(T[] arr, Comparator<T> comparator, boolean desc) {
		this.arr = arr;
		this.comparator = comparator;
		if(desc) this.desc = -1;
	}
	
	
	public void sort() {
		for(int i=1; i < arr.length; i++) {
			T key = arr[i];
			int j = i-1;
			
			while(j>=0 && (comparator.compare(arr[j], key)*this.desc >= 0)) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			
		}
	}




}
