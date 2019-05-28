
public class BubbleSort<T> implements Sort<T> {

	@Override
	public long sort(T[] array, Comparable<T> comparable) {
		long startTime = System.currentTimeMillis();
		T temp; 
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (comparable.compare(array[i], array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return System.currentTimeMillis() - startTime;
	}

}
