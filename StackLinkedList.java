package OCJP;
// Created the Link class
class Linked{
	public int data;
	public Linked Link;
	// Initialize the constructor
	Linked(int d){
		data = d;
	}
	// Print the data values
	public void display(){
		System.out.print(data+" ");
	}
} // end of class Linked

class List{
	private Linked first;
	// Initialize the link
	public List(){
		first = null;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	// to be implemented for top insertion
	public void insertFirst(int d){
		Linked l = new Linked(d);
		l.Link = first;
		first = l;
	}
	// to be implemented for top deletion
	public int deleteFirst(){
		Linked temp = first;
		first = first.Link;
		return temp.data;
	}
	
	public void displayList(){
		Linked current = first;
		while(current != null){
			current.display();
			current = current.Link;
		}
		System.out.println();
	}
	
} // End of class List

class LinkedStack{
	private List ll;
	LinkedStack(){
		ll = new List();
	}
	
	public void push(int i){
		ll.insertFirst(i);
	}
	public int  pop(){
		return ll.deleteFirst();
	}
	
	public boolean isEmoty(){
		return ll.isEmpty();
	}
	
	public void displayStack(){
		System.out.println("Stack Values");
		ll.displayList();
	}
	
}

public class StackLinkedList {
	public static void main(String[] args) {
		LinkedStack ls = new LinkedStack();
		ls.push(1);
		ls.push(2);
		ls.push(3);
		ls.push(4);
		ls.push(5);
		ls.displayStack();
		ls.pop();
		ls.displayStack();
		
	}

}
