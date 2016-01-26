public class UniqueChars {
	// Building a boolean function to determine whether a character is unique in a string or not
	public static boolean isUnique(String s){
		// The vector is taken to be of length 122 because in ascii 122 is 'z' the rest are not letters
		boolean[] b = new boolean[122];
		for(int i=0;i<s.length();i++){
			// asciiVal will give the ascii value of the corresponding character from the string
			int asciiVal = s.charAt(i);
			// check whether the flag is set in the boolean array
			if(b[asciiVal] == false) 
				b[asciiVal] = true;
			else
				// if the flag is set, it means that already there is one character added of that type, i.e. it is not unique
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] unqWords = {"hello","world","soumyajit","shankar","arijit"};
		for(String w:unqWords){
			System.out.println(w+" - "+isUnique(w));
		}
	}
}