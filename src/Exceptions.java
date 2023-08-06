import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;

public class Exceptions {
	
	public static void dividedByZero(int de) {
		System.out.println(17/de);
	}
	
	public static void createURI() {
		try {
			URI uri =  new URI("-htts://www.google.com");
			System.out.println("the url is created");
		}catch (URISyntaxException e) {
			throw new IllegalArgumentException();
		}
	}
	
	public static void createURIv2() throws URISyntaxException {
		URI uri =  new URI("-htts://www.google.com");
	}
	
	
	public static void main(String[] args) {
		
//		Integer[] integerArray = new Integer[] {1,2,3,4,5};
//		System.out.println(integerArray[2]);
//	
//		dividedByZero(4);
//		dividedByZero(0);
		
//		LocalDate today = null;
//		if (today != null)
//		System.out.println(today.getMonth() );
//		
//		String hello = "hello";
//		Double value = Double.valueOf(hello);
		
		User user = new User("matt",21);
		User user1 = new User("sally", 43);
		try {
		createURI();
		}
		catch (IllegalArgumentException e) {
			System.out.println("The expection was caught");
		}
		
		//createURIv2();
		
		System.out.println("this is still printing");
	}

}
