package Algoritmos;

import Comps.Comparator;

public class BubbleSort<T>{

	Comparator<T> comparator;
	T[] arr;
	int desc = 1;
	
	public BubbleSort(T[] arr, Comparator<T> comparator, boolean desc) {
		this.comparator = comparator;
		this.arr = arr;
		if(desc) this.desc = -1;
	}
	
	public void sort() {
		T temp;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(comparator.compare(arr[i], arr[j])*this.desc > 0) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
	}

	
	
}
