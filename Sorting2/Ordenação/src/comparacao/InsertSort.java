package comparacao;

public class InsertSort<T> {
	private T[] objeto;
    private Compare<T> compare;

    public InsertSort(T[] objeto, Compare<T> compare) {
        this.objeto = objeto;
        this.compare = compare;
    }

    public T[] sort() {
        for (int i = 0; i < this.objeto.length; i++) {
            T selecionado = this.objeto[i];
            int j = i - 1;
            while (j >= 0 && compare.compareTo(selecionado, this.objeto[j]) < 0) {
                this.objeto[j + 1] = this.objeto[j];
                j = j - 1;
            }
            this.objeto[j + 1] = selecionado;
        }
        return this.objeto;
    }

    public void imprimir() {
        System.out.print("Insertion Sort: [ ");
        for (int i = 0; i < sort().length; i++) {
            System.out.print(i > 0 ? ", " : "");
            System.out.print(sort()[i]);
        }
        System.out.println(" ]");
    }

}
