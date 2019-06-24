package Comps;

import Algoritmos.Pontos;

public class ComparatorPoints extends Comparator<Pontos>{

	public int compare(Pontos a, Pontos b) {
		if(a.getLongitude() == b.getLongitude()) {
			if(a.getLatitude() < b.getLatitude()) return -1;
			else if(a.getLatitude() == b.getLatitude()) return 0;
			else return 1;
		}else if(a.getLongitude() > b.getLongitude()) return 1;
		else return -1;
	}

}
