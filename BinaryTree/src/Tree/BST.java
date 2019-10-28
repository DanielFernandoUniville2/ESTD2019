package Tree;

import java.util.ArrayList;

public class BST implements BSTInterface {
	
	private Node root;
	
	public BST() {
		this.root  = new Node();
	}
	
	public boolean isEmpty() {
		return this.root.getData() == Integer.MAX_VALUE;
	}
	
	public void add(int element) {
		if(element == Integer.MAX_VALUE)
			return;
		else{
			recursiveAdd(element,this.root,this.root.getParent());
		}
	}

	private void recursiveAdd(int element, Node node,Node parent){
		if(!node.isNull()){
			if(node.getData() == element) return;
			if(node.getData() > element){
				recursiveAdd(element,node.getLeft(),node);
			}else{
				recursiveAdd(element,node.getRight(),node);
			}
		}else{
			node.setData(element);
			node.setRight(new Node());
			node.setLeft(new Node());
			node.setParent(parent);
		}
	}
	
	public void remove(int element) {
		Node foundNode = search(element);
		if(foundNode == new Node()){
			return;
		}else{
			recursiveRemove(foundNode);
		}
	}
	private void recursiveRemove(Node node){
		if(node.isLeaf()){
			node.setData(Integer.MAX_VALUE);
			node.setLeft(null);
			node.setRight(null);
		}else if(node.getLeft().isNull()){
			node.setData(node.getRight().getData());
			node.getRight().getRight().setParent(node);
			node.getRight().getLeft().setParent(node);
			node.setLeft(node.getRight().getLeft());
			node.setRight(node.getRight().getRight());
		}else if(node.getRight().isNull()){
			node.setData(node.getLeft().getData());
			node.getLeft().getRight().setParent(node);
			node.getLeft().getLeft().setParent(node);
			node.setRight(node.getLeft().getRight());
			node.setLeft(node.getLeft().getLeft());
		}else{
			int removedValue = node.getData();
			Node sucessor = sucessor(removedValue);
			node.setData(sucessor.getData());
			sucessor.setData(removedValue);
			recursiveRemove(sucessor);
		}
	}
	
	public int size() {
		return recursiveSize(this.root);
	}
	private int recursiveSize(Node node){
		if(!node.isNull()){
			return 1 + recursiveSize(node.getLeft()) + recursiveSize(node.getRight());
		}else{
			return 0;
		}
	}
	
	public Node sucessor(int element) {
		Node foundNode = search(element);
		if(foundNode.isNull()){
			return null;
		}else if(!foundNode.getRight().isNull()){
			return recursiveMinimum(foundNode.getRight());
		}else{
			Node parent = foundNode.getParent();
			while(parent != null && !foundNode.equals(parent.getLeft())){
				parent = parent.getParent();
				foundNode = foundNode.getParent();
			}
			return parent;
		}
	}
	
	public Node minimum() {
		if(size() == 0){
			return null;
		}else{
			return recursiveMinimum(this.root);
		}
	}
	
	private Node recursiveMinimum(Node node){
		if(!node.getLeft().isNull()){
			return recursiveMinimum(node.getLeft());
		}else{
			return node;
		}
	}
	
	public boolean contains(int element) {
		if(search(element) != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public Node search(int element) {
		if(element == Integer.MAX_VALUE || this.root.isNull())
			return new Node();
		else{
			return recursiveSearch(element,this.root);
		}
	}
	private Node recursiveSearch(int element,Node node){
		if(!node.isNull()){
			if(node.getData() == (element)){
				return node;
			}else if(node.getData() > element ){
				return recursiveSearch(element,node.getLeft());
			}else{
				return recursiveSearch(element,node.getRight());
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		int[] array = new int[this.size()];
		String resp = "";
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		recursiveOrder(this.root,arrayList);
		for(int i = 0 ; i < arrayList.size();i++){
			array[i] = (arrayList.get(i));
			resp += array[i] + " ";
		}
		
		return resp;
		
	}
	
	public void clear() {
		int aux = this.size();
		for(int i = 0; i<aux; i++)
			remove(this.root.getData());
	}
	
	private void recursiveOrder(Node node,ArrayList<Integer> arrayList){
		if(!node.isNull()){
			recursiveOrder(node.getLeft(),arrayList);
			arrayList.add(node.getData());
			recursiveOrder(node.getRight(),arrayList);
		}
	}
}
