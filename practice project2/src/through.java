
public class through {
     static void Age(int age) {
    	 if(age < 18) {
    		 throw new ArithmeticException("not eligible to drive car");
    	 }
    	 else {
    		 System.out.println("eligible to drive car");
    	 }
     }
	public static void main(String[] args) {
		  Age(21);
		  System.out.println("throw keyword exist");

	}

}
