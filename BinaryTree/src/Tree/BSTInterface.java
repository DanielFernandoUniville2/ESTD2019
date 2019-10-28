package Tree;

public interface BSTInterface {
	
	// Complexidade O(Logn)
	public void add(int element);
	
	// Complexidade O(Logn)
	public boolean contains(int element);
	
	// Complexidade O(Logn)
	public void remove(int element);
	
	// Complexidade O(1)
	public boolean isEmpty();
	
	// Complexidade O(n)
	public int size();
	
	// Complexidade O(nLogn)
	public void clear();
	
	// Complexidade O(n)
	public String toString();
}
