import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for Prime Check:");
		int n = sc.nextInt();
		long t1 = System.currentTimeMillis();
		if(isPrime(n)){
			System.out.println("Prime");
		}else{
			System.out.println("Not a Prime Number");
		}
		long t2 = System.currentTimeMillis();
		System.out.println("1:"+t1);
		System.out.println("2:"+t2);
		System.out.println("Time Difference is:"+(t2-t1));
	}

	public static boolean isPrime(int n) {
		if(n==2)
			return true;
		for(int i=2;i<Math.sqrt(n);i++){
		if (n%i==0){
			return false;
			}
		}
		return true;
	}
}
