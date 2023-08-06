

public class NameManager {

	String myName = "venkat sai";
	public String getFirstName () {
		String[] values = myName.split(" ");
		return values[0];
	}
	public String getSurName() {
		String[] values = myName.split(" ");
		return values[values.length-1];
	}
	public static void doSomething() {
		System.out.println("i a'm doing something");
	}

}
