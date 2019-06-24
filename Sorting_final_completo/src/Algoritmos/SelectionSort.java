package Algoritmos;

import Comps.Comparator;

public class SelectionSort<T> {
	
	Comparator<T> comparator;
	T arr[];
	int desc = 1;
	
	public SelectionSort(T arr[], Comparator<T> comparator, boolean desc) {
		this.comparator = comparator;
		this.arr = arr;
		if(desc) this.desc = -1;
	}
	
	public void sort() {
		for(int i=0; i < arr.length-1; i++) {
			int minIndex = i;
			
			for(int j=i+1; j < arr.length; j++) {
				if(comparator.compare(arr[j], arr[minIndex])*this.desc < 0){
					minIndex = j;
				}
			}
			
			T temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
			}
}
