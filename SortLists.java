package DSPracs;

class Link{
	public int data;
	public Link next;
	// Initialize the constructor
	public Link(int d){
		data = d;
	}
	// Print the data 
	public void showData(){
		System.out.print(" "+data);
	}
}

class SortLinkedList{
	private Link first;
	public SortLinkedList(){
		first = null;
	}
	public boolean isEmpty(){
		return (first == null);
	}
	
	// Function to insert list in a sorted order
	public void sortInsert(int key){
		// Create the newLink to be added
		Link l = new Link(key);
		// set the previous node to be null
		Link prev = null;
		Link current = first;
		
		while(current != null && key>current.data){
			// Set the previous to current
			prev = current;
			current = current.next;
		}
		// Beginning of the list
		if(prev == null){
			first = l;
		}
		// if not in beginning
		else
		{
			// set the next of prev to the newLink
			prev.next = l;
			// set the next of the newLink to current
			l.next = current;
		}
	}
	// function to delete minimum item from the list
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	// Now display the List
	public void display(){
		Link current = first;
		System.out.print("Sorted List:");
		while(current != null){
			current.showData();
			current = current.next;
		}
		System.out.println();
	}	
}



public class SortLists {
	public static void main(String[] args) {
		SortLinkedList s = new SortLinkedList();
		s.sortInsert(-3);
		s.sortInsert(34);
		s.sortInsert(12);
		s.display();
		s.sortInsert(9);
		s.display();
		s.deleteFirst();
		s.display();
	}

}
