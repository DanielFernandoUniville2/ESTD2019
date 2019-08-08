package stack;

public class Stack {
	private int[] array;
	private int top = -1;
	

	public Stack(int size) {
		this.array = new int[size];
	}
	
	public void push(int element) {
		if(!this.isFull()){
			this.array[++top] = element;
		}else {
			throw new StackOverflowError();
		}
	}
	
	public int pop() {
		if(!this.isEmpty()) {
			return array[this.top--];
		}else {
			throw new StackOverflowError();
		}
	}
	
	boolean isEmpty() {
		return this.top < 0;
	}
	
	private boolean isFull() {
		return this.top == this.array.length - 1;
	}
	
	public int top() {
		if(!this.isEmpty()) {
			return this.array[this.top];
		}else {
			return -1;
		}
	}
	
}
