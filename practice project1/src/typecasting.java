
public class typecasting {

	public static void main(String[] args) {
		// implicit conversion
		int x1 = 50;
		float z1 = x1;
		System.out.println("conversion before int" + x1);
		System.out.println("conversion before float" + z1);
          // explicit conversion
		float f1 = 157f;
		int obj1 = (int)f1;
		System.out.println("before conversion"+ f1);
		System.out.println("before conversion"+ obj1);
	}

}
