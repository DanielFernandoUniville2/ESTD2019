package comparacao;

public class BubleSort<T>{
	
	private T[] objeto;
	private Compare<T> compare;

	public BubleSort(T[] objeto, Compare<T> compare) {
		this.objeto = objeto;
	    this.compare = compare;
	}

	public long sort() {
		long start = System.currentTimeMillis();
	    for (int i = this.objeto.length - 1; i >= 0; i--) {
	    	for (int j = 0; j < i; j++) {
	    		if (compare.compareTo(this.objeto[j], this.objeto[j + 1]) > 0) {
	    			T temp = this.objeto[j];
	                this.objeto[j] = this.objeto[j + 1];
	                this.objeto[j + 1] = temp;
	            }
	        }
	    }
	    return System.currentTimeMillis() - start;
	}

	public long imprimir() {
		return sort();
	}
}
