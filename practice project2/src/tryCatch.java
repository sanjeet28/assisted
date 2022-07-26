
public class tryCatch {

	public static void main(String[] args) {
		String s  = "abcd";
		try {
		int a = Integer.parseInt(s);
		
		
		System.out.println("result:" + a);
		}catch(NumberFormatException e) {
			System.out.println("number format exist");
		}
	}

	}

		
