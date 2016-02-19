package DSPracs;

// Create the Link Class
class Link{
	public int data;
	public Link prev;
	public Link next;
	// Initialize the constructor
	public Link(int d){
		data = d;
	}
	public void displayList(){
		System.out.print(" "+data);
	}
}

class DLinkedList{
	private Link first;
	private Link last;
	
	// Initialize the Links
	DLinkedList(){
		first = null;
		last = null;
	}
	// check whether the contents are empty or not
	public boolean isEmpty(){
		return (first == null);
	}
	// insert the element at first
	public void insertFirst(int data){
		Link f = new Link(data);
		if(isEmpty()){
			last = f;
		}
		else {
			first.prev = f;
			f.next = first;
			first = f;
		}
	}
	// insert the element at last
	public void insertLast(int data){
		Link l = new Link(data);
		if(isEmpty()){
			first = l;
		}
		else {
			last.next = l;
			l.prev = last;
		}
		last = l;
	}
	// Insert at any location in the list
	public void insertKey(int key,int data){
		Link current = first;
		while(current.data != key){
			current = current.next;
			if(current == null)
				System.out.println("No item in list");
		}
		Link any = new Link(data);
		
		if(current == last){
			any.next = null;
			last = any;
		}
		else {
			any.next = current.next;
			current.next.prev = any;
		}
		any.prev = current;
		current.next = any;
	}
	// Delete the first element
	public Link deleteFirst(){
		Link temp = first;
		if(first.next == null){
			last = null;
		}
		else {
			first.next.prev = null;
			first = first.next;
		}
		return temp;
	}
	// Delete the last element
	public Link deleteLast(){
		Link temp = last;
		if(first.next == null){
			first = null;
		}
		else {
			last.prev.next = null;
			last = last.prev;
		}
		return temp;
	}
	// Delete an item from any part of the list
	public Link deleteAny(int key){
		Link current = first;
		while(current.data != key){
			current = current.next;
				if(current == null)
					return null;
		}
		if(current == first){
			first = current.next;
		}
		else {
			current.prev.next = current.next;
		}
		
		if(current == last){
			last = current.prev;
		}
		else {
			current.next.prev = current.prev;
		}
		return current;
	}
	// Display forward
	public void displayForward(){
		System.out.println("Forward Display : ");
		Link current = first;
		while(current != null){
			current.displayList();
			current = current.next;
		}
		System.out.println();
	}
	
	// Display backward
	public void displayBackward(){
		System.out.println("Backward Display : ");
		Link current = last;
		while(current != null){
			current.displayList();
			current = current.prev;
		}
		System.out.println();
	}
	
}

public class DoublyLinkedList {
	public static void main(String[] args) {
		DLinkedList d = new DLinkedList();
		d.insertLast(1);
		d.insertLast(2);
		d.insertLast(3);
		d.displayBackward();
		d.displayForward();
		d.deleteFirst();
		d.displayForward();
		d.deleteLast();
		d.displayForward();
		d.insertLast(4);
		d.insertLast(5);
		d.displayForward();
	}

}
