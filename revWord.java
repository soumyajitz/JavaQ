package DSPracs;
import java.util.*;
class Rev{
	public String reverse1(String inputString){
		String rev = "";
		String[] tokens = inputString.split("[' ',:]");
		ArrayList<String> al = new ArrayList<String>();
		for(String k:tokens){
			al.add(k);
			System.out.println(al);
		}
		for(int z=al.size()-1;z>=0;z--){
			rev = rev +" "+ al.get(z);
		}
		return rev;
	}
}
public class revWord {
	public static void main(String[] args) {
		Rev r = new Rev();
		System.out.println(r.reverse1("Hello World and Hi"));
	}

}
