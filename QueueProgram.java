package OCJP;

class Queue{
	private int front,rear;
	private int queueSize;
	private int numElements;
	private long[] queue;
	//private int item;
	// Constructor
	public Queue(int size){
		queueSize = size;
		front = 0;
		rear = -1;
		numElements = 0;
		queue = new long[queueSize];
	}
	// Queue Insertion function
	public void insert(long item){
		if(rear == queueSize-1)
			rear = -1;
		queue[++rear] = item;
		numElements++;
	}
	// Queue deletion function
	public long remove(){
		long item = queue[front++];
		if(front == queueSize)
			front = 0;
		numElements--;
		return item;
	}
	// Gives the value of the front element in the queue
	public long seek(){
		return queue[front];
	}
	
	public boolean isEmpty(){
		return (numElements == 0);
	}
	
	public boolean isFull(){
		return (numElements == queueSize);
	}
	
	public void displayQueue(){
		for(int i=0;i<=numElements;i++)
			System.out.print(" "+queue[i]);
		System.out.println();
	}
}

public class QueueProgram {
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.displayQueue();
		System.out.println("The deleted item is: "+q.remove());
		q.remove();
		System.out.println("The front item is: "+q.seek());
		q.insert(5);
		q.insert(6);
		System.out.println("The next deleted item is:"+q.remove());
		q.displayQueue();
	}

}
