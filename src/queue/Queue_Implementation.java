package queue;

public class Queue_Implementation {
	
	private int[] array;
	private int capacity;
	private int rear;
	private int front;

	public Queue_Implementation(int[] array, int capacity) {
		this.array = array;
		this.capacity = capacity;
		this.rear =-1;
		this.front = 0;
	}

	public void push(int data) {
		if (rear == capacity - 1)
			throw new RuntimeException("Queue Overflow.");
		array[++rear] = data;
	}

	public int pop() {
		if (rear == -1 || front >rear)
			throw new RuntimeException("Queue Underflow .");
		return array[front++];
	}

	public int peek() {
		return array[rear];
	}


	public static void main(String[] args) {
		int capacity = 100;
		int[] array = new int[capacity];
		Queue_Implementation q = new Queue_Implementation(array, capacity);
		q.push(1);
		q.push(2);
		System.out.println("peak : "+q.peek());
		q.push(3);
		q.push(5);
		System.out.println("peak : "+q.peek());
		System.out.println("pop value : "+q.pop());
		System.out.println("pop value : "+q.pop());
		System.out.println("pop value : "+q.pop());
	}

}
