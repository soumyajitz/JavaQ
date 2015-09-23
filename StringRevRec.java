
public class StringRevRec {
	//Normal recursion
	public static String rev(String s){
		if(s.length()<=1){
			return s;
		}
		return rev(s.substring(1))+s.charAt(0);
	}
	
	public static String revdivideandconquer(String s){
		if(s.length()<=1)
			return s;
		return revdivideandconquer(s.substring(s.length()/2, s.length()))+revdivideandconquer(s.substring(0, s.length()/2));
	}
	public static void main(String[] args) {
		String s = "abcde";
		System.out.println("Reverse is: "+rev(s));
		System.out.println("Reverse Divide & Conquer is: "+revdivideandconquer(s));
	}
}
