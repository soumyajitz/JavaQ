package newJob;

import java.util.ArrayList;
import java.util.List;

public class CompressString2 {
	
	/**
	 * Method to create a compressed string
	 * @param s
	 * @return compressed output
	 */
	public static String compress(String s){
		String output ="";
		int sum =1;
		for(int x = 0;x<s.length()-1;x++){
			if(s.charAt(x) == s.charAt(x+1)){
				sum++;
			}
			else{
				output = output +s.charAt(x)+ sum;
				sum = 1;
			}
		}
		output = output + s.charAt(s.length()-1)+sum;
		return output;
	}

	/**
	 * Method to concatenate the number of times for a particular character
	 * @param s  the character 
	 * @param x  the number of times to be concatenated
	 * @return the output string
	 */
	public static String concatenate(String s, String x){
		String output = "";
		for(int i=0;i<Integer.parseInt(x);i++){
			output = output + s;
		}
		return output;
	}
	
	/**
	 * Method to decompress a compressed string
	 * @param s the compressed string
	 * @return the decompressed string
	 */
	public static String decompress(String s){
		String output = "";
		List<String> chared = new ArrayList<String>();
		List<String> valed = new ArrayList<String>();
		String[] vals = s.split("[a-z][a-z]*");
		for(String k:vals)
			valed.add(k);
		String[] chars = s.split("[0-9][0-9]*");
		for(String k:chars)
			chared.add(k);
		for(int i = 0;i<chared.size();i++){
			output = output + concatenate(chared.get(i),valed.get(i+1));
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println(compress("aabbc"));
		System.out.println(concatenate("b","5"));
		System.out.println(decompress("a30b20c15"));
	}
}
