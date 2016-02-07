package OCJP;
// Create the Link class
class Link{
	private int id;
	private String name;
	public Link next;
	
	// Create the constructor
	public Link(int i,String n){
		id = i;
		name = n;
	}
	// display the link id and name
	public void display(){
		System.out.println(" {"+id+" - "+name+" }");
	}
}

// Create the Linked List class
class LinkedList{
	private Link first;
	// initialize the first link in the constructor
	public  LinkedList(){
		first = null;
	}
	// create the first link
	public boolean isEmpty(){
		return (first == null);
	}
	// method for inserting the item in first position
	public void insertFirst(int id,String name){
		Link n = new Link(id,name);
		n.next = first;
		first = n;
	}
	// method for deleting an item from first
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	// Display the list
	public void displayList(){
		System.out.println("Link:First->Last");
		Link current = first;
		while(current != null){
			current.display();
			current = current.next;
		}
	}
}

// Main Program
public class LinkedListProgram {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertFirst(1, "Soumyajit");
		ll.insertFirst(2, "Arijit");
		ll.insertFirst(3, "Rohit");
		ll.insertFirst(4,"SS Bhadury");
		ll.displayList();
		ll.deleteFirst();
		System.out.println("After Delete");
		ll.displayList();
	}

}
