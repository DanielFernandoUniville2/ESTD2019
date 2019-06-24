package Algoritmos;

import Comps.Comparator;

public class MergeSort<T> {
	
	T[] arr;
	Comparator<T> comparator;
	int desc = 1;
	
	public MergeSort(T[] arr, Comparator<T> comparator, boolean desc) {
		this.arr = arr;
		this.comparator = comparator;
		if(desc) this.desc = -1;
	}
	
	@SuppressWarnings("unchecked")
	void merge(T arr[], int left, int middle, int right) {
		int n = middle - left + 1;
		int n2 = right - middle;
		
		T L[] = (T[]) new Object[n];
		T R[] = (T[]) new Object[n2];
		
		for(int i=0; i<n; i++) L[i] = arr[left + i];
		for(int j=0; j<n2; j++) R[j] = arr[middle+j+1];
	
		int i = 0;
		int j = 0;
		int k = left;
		
		while(i < n && j < n2) {
			if(comparator.compare(L[i], R[j])*this.desc <= 0 ){
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
				k++;
		}
		
		while(i < n) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	
	}
	
	void sort(T arr[], int left, int right) {
		if(left < right) {
			int middle = (left+right) / 2;
			
			sort(arr, left, middle);
			sort(arr, middle+1, right);
			
			merge(arr, left, middle, right);
		}
	}
	
	public void sort() {
		int left=0;
		int right=arr.length-1;
		sort(arr, left, right);
	}
	
}
