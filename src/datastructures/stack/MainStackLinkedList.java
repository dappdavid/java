package datastructures.stack;

public class MainStackLinkedList {
	

	public static void main(String[] args) {
		StackLinkedList newStack = new StackLinkedList();
		newStack.push(1);
		newStack.push(2);
		newStack.push(3);
		newStack.pop();
		int peek = newStack.peek();
		System.out.println(peek);
		newStack.deleteStack();

	}
}
