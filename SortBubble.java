import java.util.Scanner;
public class SortBubble {
	public static void BubbleSort(int arr[],int n){
		int temp;
		System.out.println();
		for(int i=0;i<(n-1);i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
				}
			}
		}
		System.out.println("The Sorted array is:");
		for(int k=0;k<n;k++){
			System.out.print(" "+arr[k]);
		}
	}
	public static void main(String[] args) {
		int arr[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the elements");
		for(int k=0;k<n;k++){
			arr[k] = sc.nextInt();
		}
		System.out.println("The Elements are:");
		for(int k:arr){
			System.out.print(" "+k);
		}
		BubbleSort(arr,n);
	}

}
