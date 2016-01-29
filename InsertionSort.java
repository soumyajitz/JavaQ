package OCJP;

class InsertionSortAlgo{
	private long arr[];
	private int numElements;
	public InsertionSortAlgo(int value){
		arr = new long[value];
		numElements=0;
	}
	
	public void insert(int val){
		arr[numElements] = val;
		numElements++;
	}
	
	public void display(){
		for(int i = 0;i<numElements;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void insertionsort(){
		int i,j;
		for(j=1;j<numElements;j++){
			long temp = arr[j];
			i = j;
			while(i>0 && arr[i-1]>=temp){
				arr[i] = arr[i-1];
				--i;
			}
			arr[i]= temp;
		}
	}
	
}

public class InsertionSort {
	public static void main(String[] args) {
		InsertionSortAlgo arr = new InsertionSortAlgo(10);
		arr.insert(10);
		arr.insert(2);
		arr.insert(5);
		System.out.println("Before Sorting:---------------------");
		arr.display();
		arr.insertionsort();
		System.out.println("After Sorting:---------------------");
		arr.display();
	}

}
