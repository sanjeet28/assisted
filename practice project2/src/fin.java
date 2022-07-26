
public class fin {

	public static void main(String[] args) {
		try {
		System.out.println("i am trying to execute program");
		int number = 89/0;
      System.out.println(number);
	}
    catch(ArithmeticException e) {
    	System.out.println("catch block");
    	System.out.println("Arithmetic exception divide by zero exist");
    }
		finally{
			System.out.println("finally block");
		}
			System.out.println("coninue to code");
		}

}