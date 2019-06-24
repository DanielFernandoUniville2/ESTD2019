package Algoritmos;

import Comps.Comparator;

public class QuickSort<T> {
	
	Comparator<T> comparator;
	T[] arr;
	int desc = 1;
	
	public QuickSort(T[] arr, Comparator<T> comparator, boolean desc) {
		this.arr = arr;
		this.comparator = comparator;
		if(desc) this.desc = -1;
	}
	
	int partition(T arr[], int low, int high) {
		
		T pivot = arr[high];
		int i = low-1;
		for(int j=low; j<high; j++) {
			if(comparator.compare(arr[j], pivot)*this.desc <= 0) {
				i++;
				
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		T temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	
	
	void sort(T arr[], int low, int high) {
		
		if(low < high) {
			
			int pi = partition(arr, low, high);
			
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
		
	}
	
	public void sort() {
		int low = 0;
		int high = arr.length-1;
		sort(arr, low, high);
	}
}	
