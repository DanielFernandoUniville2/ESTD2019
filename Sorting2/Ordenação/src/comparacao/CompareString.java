package comparacao;

public class CompareString implements Compare<String> {

    @Override
    public int compareTo(String t1, String t2) {
        return t1.compareTo(t2);
    }
}