import java.util.Scanner;
public class Str2Ascii {
	public static int[] str2ascii(String input) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		input = sc.nextLine();
		char[] in = new char[input.length()];
		int[] arr = new int[input.length()];
		//System.out.println(input);
		for(int i=0;i<input.length();i++){
			in[i] = input.charAt(i);
			arr[i] = (int) in[i];
			System.out.println(in[i]+"->"+arr[i]);
		}
		for(int k:arr)
		{
			System.out.print(k+" ");
		}
		return arr;
	}
	
	//return string as char array
	
	public static char[] str2char(String input) {
		char[] in = new char[input.length()];
		int[] arr = new int[input.length()];
		//System.out.println(input);
		for(int i=0;i<input.length();i++){
			in[i] = input.charAt(i);
			arr[i] = (int) in[i];
			//System.out.println(in[i]+"->"+arr[i]);
		}
		for(int k:arr)
		{
			System.out.print(k+" ");
		}
		return in;
	}
}
