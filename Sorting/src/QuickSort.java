
public class QuickSort<T> implements Sort<T> {

	@Override
	public long sort(T[] array, Comparable<T> comparable) {
		long startTime = System.currentTimeMillis();
		quickSort(array, 0, array.length - 1, comparable);
		return System.currentTimeMillis() - startTime;
	}

	private void quickSort(T[] array, int beg, int end, Comparable<T> comparable) {
		int loc;
		if (beg < end) {
			loc = partition(array, beg, end, comparable);
			quickSort(array, beg, loc - 1, comparable);
			quickSort(array, loc + 1, end, comparable);
		}
	}

	private int partition(T[] array, int beg, int end, Comparable<T> comparable) {

		int left, right, loc, flag;
		T temp;
		loc = left = beg;
		right = end;
		flag = 0;
		while (flag != 1) {
			while ((comparable.compare(array[loc], array[right]) <= 0) && (loc != right))
				right--;
			if (loc == right)
				flag = 1;
			else if (comparable.compare(array[loc], array[right]) > 0) {
				temp = array[loc];
				array[loc] = array[right];
				array[right] = temp;
				loc = right;
			}
			if (flag != 1) {
				while ((comparable.compare(array[loc], array[left]) >= 0) && (loc != left))
					left++;
				if (loc == left)
					flag = 1;
				else if (comparable.compare(array[loc], array[left]) < 0) {
					temp = array[loc];
					array[loc] = array[left];
					array[left] = temp;
					loc = left;
				}
			}
		}
		return loc;
	}

}
