package datastructures.queue;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueArray qarr = new QueueArray(3);
		System.out.println("Is queue empty? "+ qarr.isEmpty());
		qarr.enQueue(4);
		qarr.enQueue(5);
		qarr.enQueue(6);
		
		System.out.println("Is queue empty? "+ qarr.isEmpty());
		
		qarr.deQueue();
		qarr.deQueue();
		qarr.deQueue();
		
		System.out.println("Is queue empty? "+ qarr.isEmpty());

	}

}
