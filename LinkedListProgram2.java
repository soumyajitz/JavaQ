package OCJP;
// Create the Link class
class Links{
	public int id;
	public String name;
	public Links next;
	
	// Create the constructor
	public Links(int i,String n){
		id = i;
		name = n;
	}
	// display the link id and name
	public void display(){
		System.out.print(" ->{"+id+" - "+name+" }->");
	}
}

// Create the Linked List class
class LinkedLists{
	private Links first;
	// initialize the first link in the constructor
	public  LinkedLists(){
		first = null;
	}
	// create the first link
	public boolean isEmpty(){
		return (first == null);
	}
	// method for inserting the item in first position
	public void insertFirst(int id,String name){
		Links n = new Links(id,name);
		n.next = first;
		first = n;
	}
	// method for deleting an item from first
	public Links deleteFirst(){
		Links temp = first;
		first = first.next;
		return temp;
	}
	
	// Find a key in the list
	public Links find(int key){
		Links current = first;
		while(current.id != key){
			if(current == null)
				return null;
			else 
				current = current.next;
		}
		return current;
	}
	
	public Links delete(int key){
		// Use two Links -one prev and the other current
		Links prev = first;
		Links current = first;
		while(current.id != key){
			if(current == null)
				return null;
			else 
				prev = current ;
			current = current.next;
		}
		
		if(current == first){
			return first;
		}
		else {
			prev.next = current.next;
		}
		return current;
	}
	
	// Display the list
	public void displayList(){
		System.out.println("Link:First->Last");
		Links current = first;
		while(current != null){
			current.display();
			current = current.next;
		}
	}
}

// Main Program
public class LinkedListProgram2 {
	public static void main(String[] args) {
		int keys[] = {1,2,3,4};
		LinkedLists ll = new LinkedLists();
		ll.insertFirst(1, "Soumyajit");
		ll.insertFirst(2, "Arijit");
		ll.insertFirst(3, "Rohit");
		ll.insertFirst(4,"SS Bhadury");
		ll.displayList();
//		ll.deleteFirst();
//		System.out.println("After Delete");
		ll.displayList();
		System.out.println();
		Links searchKey = ll.find(keys[0]);
		if(searchKey == null){
			System.out.println("Key not found");
		}
		else {
			System.out.println("Key found- Name is :"+searchKey.name);
		}
		// After Deletion
		Links d = ll.delete(keys[0]);
		
		System.out.println("List After Deletion");
		ll.displayList();
	}
}
