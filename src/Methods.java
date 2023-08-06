public class Methods {

	public static void main(String[] args) {
		
		for(String arg : args ) {
			System.out.println(arg);
		}
        int result = addTwoNmbers(5,15);
        System.out.println(" result " +  result);
        double total = addThreeNumbers(2.0,2.3,result);
        
        NameManager nameManager = new NameManager();
        System.out.println(nameManager.getFirstName());
        System.out.println(nameManager.getSurName());
        
        NameManager.doSomething();
        
        nameManager.doSomething();
        //System.out.println(nameManager.myName);
        
        
	}
	
	
	public static double addThreeNumbers(double value1,double value2,double value3) {
		double result2 = value1 + value2 + value3;
		return result2;
	}
	
	public static int addTwoNmbers(int n1,int n2) {
		System.out.println(n1 + n2);
		printMyName();
		
		if ( n1 ==0) {
			return -1;
		}
		else {
			return n1+n2;
		}
	
	}
	
	public static void printMyName() {
		System.out.println("My name is venkat");
	}
	
	public static int whoIsOlder(int myAge1,int myAge2) {
		if( myAge1 > myAge2) {
			return myAge1;
		}else {
			return myAge2;
		}
		//return myAge2
		
	}
  public static boolean longerThan5(String word) {
//	  if(word.length() >= 6) {
//		  return true;
//	  }return false;
	  
//	 return word.length() >= 6 ? true : false;
	  
	  return word.length() >=6;
  }
	
	
	
}
