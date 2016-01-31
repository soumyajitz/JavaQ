package OCJP;

class Stack{
	private int stackSize;
	private long[] stack;
	private int top;
	// Constructor
	public Stack(int maxSize){
		stackSize = maxSize;
		stack = new long[stackSize];
		top = -1;
	}
	// Check whether the Stack is empty or not
	public boolean isEmpty(){
		return (top == -1);
	}
	
	// Check whether stack is full or not
	public boolean FullorNot(){
		return (top == stackSize-1);
	}
	
	// Pushing an item onto the stack
	public void push(long item){
		stack[++top] = item;
	}
	// Pop off an item
	public long pop(){
		return stack[top--];
	}
	// Display the top
	public long seek(){
		return stack[top];
	}
	// Display the stack values
	public void display(){
		for(int i=0;i<=top;i++){
			System.out.print(" "+stack[i]);
		}
		System.out.println();
	}
}

public class StackProgram {
	public static void main(String[] args) {
		Stack s = new Stack(10);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.display();
		System.out.println("The popped item is: "+s.pop());
	}

}
