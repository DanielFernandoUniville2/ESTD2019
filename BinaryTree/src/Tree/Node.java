package Tree;

public class Node {

	private int data = Integer.MAX_VALUE;
	private Node right;
	private Node left;
	private Node parent;
	
	public Node() {
		
	}
	
	public Node(int data, Node left, Node right, Node parent) {
		this.data = data;
		this.left = left;
		this.right = right;
		this.parent = parent;
	}
	
	public boolean isNull() {
		return this.data == Integer.MAX_VALUE;
	}
	
	public boolean isLeaf() {
		return (this.left.data == Integer.MAX_VALUE && this.right.data == Integer.MAX_VALUE);
	}
	
	public int getData() {
		return this.data;
	}
	

	public void setData(int data) {
		this.data = data;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}


	public boolean equals(int obj) {
		boolean resp = false;
		if(this.data  > obj) {
			resp = true;
		}else {
			resp = false;
		}
		
			return resp;
	}
	
}
