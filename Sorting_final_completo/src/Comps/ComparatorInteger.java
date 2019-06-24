package Comps;

public class ComparatorInteger extends Comparator<Float>{

	public int compare(Float a, Float b) {
		if(a > b) return 1;
		else if(a < b) return -1;
		else return 0;
	}

}
