package comparacao;

public class CompareStringDesc implements Compare<String> {

    @Override
    public int compareTo(String t1, String t2) {
        return t2.compareTo(t1);
    }
}