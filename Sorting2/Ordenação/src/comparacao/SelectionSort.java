package comparacao;

public class SelectionSort<T> {
	private T[] objeto;
    private Compare<T> compare;

    public SelectionSort(T[] objeto, Compare<T> compare) {
        this.objeto = objeto;
        this.compare = compare;
    }

    public T[] sort() {
        for (int i = 0; i < this.objeto.length; i++) {
            int menor = i;
            for (int j = i + 1; j < this.objeto.length; j++) {
                if (compare.compareTo(this.objeto[j], this.objeto[menor]) < 0) {
                    menor = j;
                }
            }
            T aux = this.objeto[i];
            this.objeto[i] = this.objeto[menor];
            this.objeto[menor] = aux;
        }

        return this.objeto;
    }

    public void imprimir() {
        System.out.print("Selection Sort: [ ");
        for (int i = 0; i < sort().length; i++) {
            System.out.print(i > 0 ? ", " : "");
            System.out.print(sort()[i]);
        }
        System.out.println(" ]");
    }

}
