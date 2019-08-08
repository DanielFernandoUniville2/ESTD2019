package stack;

public class Principal {

	public static void main(String[] args) {
		StackGetMin teste = new StackGetMin(10);
		teste.push(2);
		teste.push(1);
		System.out.println(teste.getMin());
		teste.pop();
		teste.pop();
		teste.push(3);
		teste.push(2);
		teste.push(4);
		teste.push(2);
		System.out.println(teste.getMin());
		teste.pop();
		teste.pop();
		System.out.println(teste.getMin());
		
		
	}
}
