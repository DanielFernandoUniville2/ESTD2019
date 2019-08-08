package stack;

public class StackGetMin {
	Stack elements;
	Stack minStack;
	
	public StackGetMin(int size) {
		elements = new Stack(size);
		minStack = new Stack(size);
	}
	
	public void push(int newValue) {
		elements.push(newValue);
		if(minStack.isEmpty() || newValue <= minStack.top()) {
			minStack.push(newValue);
		}
	}
	
	public void pop() {
		if(elements.top() == minStack.top()) minStack.pop();
		elements.pop();
	}
	
	public int getMin() {
		return minStack.top();
	}
}
