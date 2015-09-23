import java.util.Scanner;
public class BinarySearch {
	//Binary Search without Recursion
	public static int BinSrch1(int list[],int key){
		return BinSrch(list,key,0,list.length-1);
	}
	public static int BinSrch(int list[],int key,int low, int high){
		if(low>high){
			return -1;
		}
		while(low <= high)
		{
			int mid =(low+high)/2;
			if(list[mid]==key){
				System.out.println("Found at "+(mid+1));
				return mid;
			}
			else if(list[mid]<key){
				low = mid + 1;
			}
			else if(list[mid]>key){
				high = mid-1;
			}
		}
		return -1;
	}
	
	
	//Binary Search With Recursion
	public static int BinSrchRec1(int list[],int key){
		return BinSrchRec(list,key,0,list.length-1);
	}
	public static int BinSrchRec(int list[],int key,int low, int high){
		int result = 0;
		if(low>high)
		return -1;
		else if(low<high){
			int mid = low+high/2;
		if(list[mid] == key){
			System.out.println("Found at "+(mid+1));
			return mid;
			}
		else if(list[mid]<key){
			return BinSrchRec(list,key,mid+1,high);
		}
		else if(list[mid]>key){
			return BinSrchRec(list,key,low,mid-1);
		}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of search numbers you want to enter:");
		int input = sc.nextInt();
		arr = new int[input];
		System.out.println("Enter the numbers:");
		for(int i=0;i<input;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the key:");
		int key = sc.nextInt();
		int answer = BinSrch1(arr,key);
		//System.out.println(answer);
		if(answer>0)
			System.out.println("Element Found");
		else
			System.out.println("Not Found - 404 :P");
		
	}

}
