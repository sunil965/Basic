package Stack;

public class Stack_Implementation {
	private int array[];
	private int capacity;
	private int top;

	public Stack_Implementation(int[] array, int capacity) {
		this.array = array;
		this.capacity = capacity;
		this.top = -1;
	}

	public void push(int data) {
		if (top == capacity - 1)
			throw new RuntimeException("Capacity Reached");
		array[++top] = data;
	}

	public int pop() {
		if (top == -1)
			throw new RuntimeException("Capacity Exhausted");
		return array[top--];
	}

	public int peek() {
		return array[top];
	}

	public static void main(String[] args) {
		int capacity = 100;
		int array[] = new int[capacity];
		
		Stack_Implementation stack = new Stack_Implementation(array, 100);
		
		stack.push(1);
		stack.push(2);
		System.out.println("peak : "+stack.peek());
		stack.push(3);
		stack.push(5);
		System.out.println("peak : "+stack.peek());
		stack.pop();
		System.out.println("peak : "+stack.peek());
		stack.pop();
		System.out.println("peak : "+stack.peek());
		stack.pop();
		System.out.println("peak : "+stack.peek());
	}

}
