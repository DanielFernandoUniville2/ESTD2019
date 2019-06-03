package comparacao;

public class CompareNumeric implements Compare<Double> {

    @Override
    public int compareTo(Double t1, Double t2) {
        return (int)(t1 - t2);
    }
}
