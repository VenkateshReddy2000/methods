
public class MemoryManagement {

	public static void main(String[] args) {

		String AllNumbers = " ";
		
		for (int i =1; i <10; i++) {
			AllNumbers +=" "+i;
		}System.out.println(AllNumbers);
		
	StringBuilder allNumbersSB= new StringBuilder();
	for (int i =1; i <10; i++) {
		allNumbersSB.append( " ");
		allNumbersSB.append(i);
	}System.out.println(allNumbersSB);
	}

}
