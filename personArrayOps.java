package OCJP;
// Create the person class with firstname,lastname and age
class Person{
	private String firstname;
	private String lastname;
	private int age;
	// Constructor
	public Person(String firstname,String lastname,int age){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	// display each person
	public void display(){
		System.out.print(firstname+" ");
		System.out.print(lastname+" ,");
		System.out.println(age);
	}
	// Retrieve 
	public String getLast(){
		return lastname;
	}
}

// This class has all the functionalities of the person class like create,insert,delete and find a person object
class PersonDynamics{
	private Person[] p;
	private int numElements;
	//Constructor for class
	public PersonDynamics(int maxVal){
		p = new Person[maxVal];
		numElements = 0;
	}
	// Search function using lastname
	public Person find(String lname){
		int j;
		for(j=0;j<numElements;j++)
			if(p[j].getLast().equals(lname))
				break;
		if(j == numElements)
			return null;
		else
			return p[j];
	}
	// Insertion method for new person
	public void insert(String first,String last, int age){
		p[numElements] = new Person(first,last,age);
		numElements++;
	}
	// Delete a person using their lastname as the key
	public boolean delete(String lname){
		int j;
		for(j = 0;j<numElements;j++)
			if(p[j].getLast().equals(lname))
				break;
		if(j == numElements)
			return false;
		else
		{
			for(int k = j;k<numElements;k++){
				p[k] = p[k+1]; // Point where the elements needs to be pushed
				numElements--;
			}
			return true;
		}
	}
	
	// Display all persons
	public void displayAllPersons(){
		for(int i = 0;i<numElements;i++)
			p[i].display();
		System.out.println("-------------------------------------");
	}
}

public class personArrayOps {
	public static void main(String[] args) {
		PersonDynamics pd = new PersonDynamics(5);
		Person search;
		boolean del;
		pd.insert("Soumyajit","Sarkar", 24);
		pd.insert("Arijit","Basu",24);
		pd.insert("Leo", "Di Caprio", 38);
		pd.insert("John", "Adams", 27);
		pd.insert("David", "Bowie", 69);
		pd.displayAllPersons();
		search = pd.find("Basu");
		if(search == null){
			System.out.println("No person found");
		}
		else{
			System.out.println("Found!!!");
			search.display();
			System.out.println("-------------------------------------");
		}
		del = pd.delete("Adams");
		if(del == true){
			System.out.println("Person Deleted from Database");
			System.out.println("-------------------------------------");
		}
		else
		{
			try{
				throw new Exception("Cannot delete");
			}catch(Exception e){
				System.out.println(e);
			}
		}
		pd.displayAllPersons();
	}
}
