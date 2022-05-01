import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author Bharani Vadlamani
 *
 */
public class Finder {
	
	private String[] strArray;
	
	public Finder(String[] strArray) {
		this.strArray = strArray;
	}
	
	public String[] find(String matchStr) {
		
		Stream<String> stream = Arrays.stream(strArray);
		
		int matchStrLen = matchStr.length();
		char[] matchStrArray =  matchStr.toCharArray();
		Arrays.sort(matchStrArray);
		
		/**
		 * this line filters the array with strings having same length as of parameter string.
		 * on that filtered list of strings further check is made as to find all the characters are
		 * same as with the parameter string or not.
		 */
		List<String> list = stream.filter(x -> (x.length() == matchStrLen)).filter(x -> (checkIfStringHasSameChars(x,matchStrArray) == true)).collect(Collectors.toList());
		
		
		return list.toArray(new String[list.size()]);
	}

	/**
	 * this method checks two strings are same are not irrespective of the order of characters including
	 * spaces and special characters.
	 * this method is case sensitive 
	 * @param s
	 * @param matchStrArray
	 * @return
	 */
	private boolean checkIfStringHasSameChars(String s, char[] matchStrArray) {
		char[] first = s.toCharArray();
		Arrays.sort(first);
		return Arrays.equals(first, matchStrArray);
		
	}

}
