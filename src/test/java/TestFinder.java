import org.junit.Assert;
import org.junit.Test;



public class TestFinder {
	
	@Test
    public void testFind() {
		String arr[] = { "das f","asdd","fre","dfdfd","ddfdf","sAd","asd day"};
        Finder finder = new Finder(arr);
        Assert.assertEquals(1, finder.find("sad day").length);
    }

    //@Test
    public void test50kruns() {
    	String arr[] = { "das","asdd","fre","dfdfd","ddfdf","sad","asd"};
        Finder finder = new Finder(arr);
        for(int i =0;i<50000;i++) {
        	Assert.assertEquals(3, finder.find("sad").length);
        }
    }
    
    @Test
    public void testwithLargeArrays() {
    	String arr[] = { "Vadl amaniBharani BharaniVa dlamani Va dlamaniniraBha","Vadlamani Bharani Vadlamani Bharani Vadlamani Bharani",
    			"VaadBhranilmiana","dsfddBharai","dfdfdfdfdfd","Vadl amaniBharani BharaniVa dlamani Vadlamani niraBha",
    			"Bharani Vadlamani Bharani Vadlamani","Bharani Vadlamani Bharani VadlamaniBharani Vadlamani Bharani Vadlamani",
    			"Bharani Vadlamani Bharani VadlamaniBharani Vadlamani Bharani VadlamaniBharani Vadlamani Bharani Vadlamani",
    			"Bharani Vadlamani Bharani VadlamaniBharani Vadlamani Bharani VadlamaniBharani Vadlamani Bharani VadlamaniBharani Vadlamani Bharani Vadlamani",
    			"Vadlamani Bharani Vadlamani Bharani Vadlamani BharaniVadlamani Bharani Vadlamani Bharani Vadlamani BharaniVadlamani Bharani Vadlamani Bharani Vadlamani Bharani",
    			"Vadlamani Bharani Vadlamani Bharani Vadlamani BharaniVadlamani Bharani Vadlamani Bharani Vadlamani BharaniVadlamani Bharani Vadlamani Bharani Vadlamani BharaniVadlamani Bharani Vadlamani Bharani Vadlamani Bharani"};
    	
    	
        Finder finder = new Finder(arr);
        for(int i =0;i<50000;i++) {
        	Assert.assertEquals(3, finder.find("Bharani Vadlamani Bharani Vadlamani Bharani Vadlamani").length);
        }
    }

}
