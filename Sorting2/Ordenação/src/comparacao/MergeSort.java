package comparacao;

public class MergeSort<T> {
	private T[] objeto;
    private Compare<T> compare;

    public MergeSort(T[] objeto, Compare<T> compare) {
        this.objeto = objeto;
        this.compare = compare;
    }

    public void sort(int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(p, q);
            sort(q+1, r);
            merge(p, q, r);
        }
    }

    //p = start, q = mid, r = end
    public void merge(int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        T[] L = (T[]) new Object[n1 + 1];
        T[] R = (T[]) new Object[n2 + 1];
        for (int i = 1; i <= n1; i++) {
            L[i] = this.objeto[p + i - 1];
        }
        for (int i = 1; i <= n2; i++) {
            R[i] = this.objeto[q + i];
        }

        int i = 1;
        int j = 1;
        for (int k = p; k <= r; k++) {
            if (i < L.length && j < R.length) {
                if (compare.compareTo(L[i], R[j]) <= 0) {
                    this.objeto[k] = L[i];
                    i++;
                } else {
                    this.objeto[k] = R[j];
                    j++;
                }
            } else {
                if (i < L.length) {
                    this.objeto[k] = L[i];
                    i++;
                }
                if (j < R.length) {
                    this.objeto[k] = R[j];
                    j++;
                }
            }
        }
    }

    public void imprimir() {
        System.out.print("Merge Sort: [ ");
        sort(0, this.objeto.length - 1);
        for (int i = 0; i < this.objeto.length; i++) {
            System.out.print(i > 0 ? ", " : "");
            System.out.print(this.objeto[i]);
        }
        System.out.println(" ]");
    }
}
