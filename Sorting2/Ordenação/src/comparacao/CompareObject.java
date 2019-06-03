package comparacao;

public class CompareObject implements Compare<LatLng> {

    @Override
    public int compareTo(LatLng t1, LatLng t2) {
        if (t1.getLatitude() < t2.getLatitude()) {
            return -1;
        }
        if (t1.getLatitude() == t2.getLatitude()) {
            if (t1.getLongitude() < t2.getLongitude()) {
                return -1;
            }
            if (t1.getLongitude() == t2.getLongitude()) {
                return 0;
            }
        }
        return 1;
    }
}