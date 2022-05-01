
public class RunFinder {
	
	/**
	 * Main class to run the Finder class with sample input passed.
	 * @param args
	 */
	public static void main(String args[]) {
		String arr[] = { "das! ady","asdd","fre","dfdfd","ddfdf","sAd"," adysda","brd"};
		Finder finder = new Finder(arr);
		finder.find("sad day!");
	}

}
