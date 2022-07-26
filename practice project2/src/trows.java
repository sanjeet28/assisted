
public class trows {
	static void cut() throws IllegalAccessException{
		System.out.println("illegal exception occured");
		throw new IllegalAccessException("trying");
	}

	public static void main(String[] args) {
		 try {
			 cut();
		 }catch(IllegalAccessException e) {
			 System.out.println("happen illegal exception");
		 }
	}

}
