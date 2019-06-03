package comparacao;

public class CompareNumericDesc implements Compare<Double> {

    @Override
    public int compareTo(Double t1, Double t2) {
        return (int)(t2 - t1);
    }
}

