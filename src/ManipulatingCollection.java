import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ManipulatingCollection {

	public static void main(String[] args) {

		List<String> firstList = new ArrayList<>();
		firstList.add("one");
		firstList.add("two");
		firstList.add("three");
		firstList.add("four");
		firstList.add("five");

		for (String s : firstList) {
			System.out.println(s);
		}
		Collections.sort(firstList);
		for (String s : firstList) {
			System.out.println(s);
		}	
			List<Book> books = new ArrayList<>();
			books.add(new Book("First Book","sai exam",15.99));
			books.add(new Book("A Good Book","Akki",25.99));
			books.add(new Book("someting to read","criss exam",15.99));
			
			Collections.sort(books);
			
			for (Book b : books) {
				System.out.println(b);
				
			}
         
			Map<Integer, Book> bookMap = new HashMap<>();
			bookMap.put(17,new Book("First Book","sai exam",15.99));
			bookMap.put(3,new Book("A Good Book","Akki",25.99)); 
			bookMap.put(21,new Book("someting to read","criss exam",15.99));
			
			System.out.println(bookMap.size());
			
			Book foundBook= bookMap.get(3);
			System.out.println(foundBook);
			bookMap.remove(3);
			Set<Integer> keys = bookMap.keySet();
			for (Integer k : keys) {
				System.out.println(bookMap.get(k));
			
			}
			
//			var values : Collection<Book> = bookMap.values();
//			for (Book b : values) {
//				System.out.println(b);
//			}
			
			bookMap.remove(3);
			
			List<Book> bookList = new ArrayList<>(bookMap.values());
			Collections.sort(bookList);
			
			
	}
}
