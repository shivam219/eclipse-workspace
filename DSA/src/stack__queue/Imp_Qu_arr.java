package stack__queue;

public class Imp_Qu_arr {
	public static void main(String[] args) {
		Que q = new Que(1000);
		q.enQue(10);
		q.enQue(20);
		q.enQue(30);
		q.enQue(40);
		System.out.println(q.dequeue() + " dequeued from queue\n");
		System.out.println("Front item is " + q.front());
		System.out.println("Rear item is " + q.rear());
	}
}
class Que {
	int fr, re, size;
	int cap;
	int arr[];

	public Que(int capacity) {
		this.cap = capacity;
		fr = this.size = 0;
		re = capacity - 1;
		arr = new int[this.cap];
	}
	boolean isFull(Que queue) {
		return (queue.size == queue.cap);
	}
	boolean isEmpty(Que queue) {
		return (queue.size == 0);
	}
	void enQue(int item) {
		if (isFull(this))
			return;
		this.re = (this.re + 1) % this.cap;
		this.arr[this.re] = item;
		this.size = this.size + 1;
		System.out.println(item + " enqueued to queue");
	}
	int dequeue() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		int item = this.arr[this.fr];
		this.fr = (this.fr + 1) % this.cap;
		this.size = this.size - 1;
		return item;
	}
	int front() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.arr[this.fr];
	}
	int rear() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.arr[this.re];
	}
}
